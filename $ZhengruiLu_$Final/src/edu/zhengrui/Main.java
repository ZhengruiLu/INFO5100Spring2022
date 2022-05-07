package edu.zhengrui;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //q1
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));

        //q2
        System.out.println(compressString("aabcccccaaa"));//Output: "a2b1c5a3"
        System.out.println(compressString("ab"));//Output: "ab"

        //q3
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));

        //q4
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(-1)));

        //q5
//        Input: nums = [3,2,1,5,6,4], k = 2
//        Output: 5
//        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//        Output: 4
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums2, 4));
    }
/*
    Question1: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

    Input: s = "()[]{}"
    Output: true
    Input: s = "(]"
    Output: false
 */
    public static boolean isValid(String s) {
        //TODO: Write your code here
        if (s.length() % 2 != 0){
            return false;
        }
        //map
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        //stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)){
                stack.push(ch);
            }else {
                if (stack.isEmpty() || stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }
        }
        //return empty stack
        return stack.isEmpty();
    }
/*
    Question 2: String Compression: Implement a method to perform basic string compression
    using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3.
    If the "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).

    Input: "aabcccccaaa"
    Output: "a2b1c5a3"
    Input: "ab"
    Output: "ab"
 */
    public static String compressString(String str){
        //TODO: Write your code here
        //corner
        if (str.length() <= 1){
            return str;
        }
        //map k: char, v: int
        StringBuilder sb = new StringBuilder();
        int slow = 0, fast = 0;

        while (fast < str.length()) {
            if (str.charAt(fast) != str.charAt(slow)){
                sb.append(str.charAt(slow));
                sb.append(fast - slow);
                slow = fast;
            }
            fast++;
        }
        sb.append(str.charAt(slow));
        sb.append(fast - slow);
        //return len
        return (sb.length() >= str.length()) ? str : sb.toString();
    }
/*
    Question 3: Given a string s, find the length of the longest substring without repeating characters.

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

    pwwkew
      i
      j

    set
    while j < n
    if ch.i != ch.j
    set.add(ch.j)
    ans = Math.max(ans, set.size())
    else
    i++
 */
    public static int lengthOfLongestSubstring(String s) {
        //TODO: Write your code here
        if (s.length() == 0){
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int len = 0;
        int left = 0, right = 0;

        while (right < s.length()){
            char ch = s.charAt(right++);

            while (set.contains(ch)){
                set.remove(s.charAt(left++));
            }

            set.add(ch);
            len = Math.max(len, set.size());
        }

        return len;
    }
/*
    Question 4: Given an integer n, return any array containing n unique integers such that they add up to 0.

    Input: n = 5
    Output: [-7,-1,1,3,4]
    Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
    Input: n = 3
    Output: [-1,0,1]
 */
    public static int[] sumZero(int n) {
        //TODO: Write your code here
        //corner
        if (n <= 0){
            return new int[0];
        }

        int[] ans = new int[n];
        int sum = 0;

        //from 1 - n-1, sum -= i
        for (int i = 1; i < n; i++) {
            ans[i] = i;
            sum -= ans[i];
        }

        ans[0] = sum;

        return ans;
    }
/*
    Question 5: Given an integer array nums and an integer k, return the kth largest element in the array.

    Note that it is the kth largest element in the sorted order, not the kth distinct element.

    Input: nums = [3,2,1,5,6,4], k = 2
    Output: 5

    Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
    Output: 4
 */
    public static int findKthLargest(int[] nums, int k) {
        //TODO: Write your code here
        if (nums.length == 0){
            return -1;
        }
        //use priority queue to sort the arr from small to large, keep pq size as k
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (a - b));
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > k){
                pq.poll();
            }
        }
        //pop pq
        return pq.poll();
    }
}

