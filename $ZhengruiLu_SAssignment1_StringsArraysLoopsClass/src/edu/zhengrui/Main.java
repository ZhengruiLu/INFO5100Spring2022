package edu.zhengrui;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //q1
        String s1 = "A man, a plan, a canal: Panama";
        printResultForQ1(s1,isPalindrome(s1));

        /*q2 and q3 is similiar
        consider:
        1.space
        2.lowercase of one letter is the duplicate of its uppercase or not?
        3.use extra data structure or not

        so q2 solution:
        1.considering space
        2.considering lowercase and uppercase is different
        3.using HashSet

        q3 solultion:
        1.no space
        2.lowercase and uppercase is duplicated
        3.no extra data structure
        */

        //q2
        String s2 = "I like dog.";//true
        String s3 = "this dog is cute,";//false
        String s4 = " ";//true, because just one space
        String s5 = "";//false, we set this corner case false
        printResultForQ2(s2,hasAllUnique(s2));
        printResultForQ2(s3,hasAllUnique(s3));
        printResultForQ2(s4,hasAllUnique(s4));
        printResultForQ2(s5,hasAllUnique(s5));

        //q3
        String s6 = "ILikeDog";//true
        String s7 = "dog";//false
        printResultForQ3(s6,hasDuplicates(s6));
        printResultForQ3(s7,hasDuplicates(s7));

        //q4
        String str1 = "abgh";
        String str2 = "gbah";
        printResultForQ4(str1, str2, areAnagrams(str1, str2));

        //q5
        int year1 = 1900, year2 = 2012;
        printResultForQ5(year1, isLeapYear(year1));
        printResultForQ5(year2, isLeapYear(year2));

        //q6
        int calls = 67;//under 100
        int calls2 = 134;//101-150
        int calls3 = 168;//151-200
        int calls4 = 235;//beyond 200
        calculateBills(calls);
        calculateBills(calls2);
        calculateBills(calls3);
        calculateBills(calls4);

        //q7
        String ransomNote = "aa", magazine = "aab";//true
        printResultForQ7(ransomNote, magazine, canConstruct(ransomNote, magazine));
        String ransomNote2 = "a", magazine2 = "b";//false
        printResultForQ7(ransomNote2, magazine2, canConstruct(ransomNote2, magazine2));
        String ransomNote3 = "aa", magazine3 = "ab";//false
        printResultForQ7(ransomNote3, magazine3, canConstruct(ransomNote3, magazine3));

        //q8
        gradeMeaning('A');
        gradeMeaning('B');
        gradeMeaning('C');
        gradeMeaning('D');
        gradeMeaning('E');

        //q9
        Book bookSample = new Book();
        printResultForQ9(bookSample);

        Book book1 = new Book("The Great Gatsby", 87454824, "fiction", 5.97);
        printResultForQ9(book1);
        book1.setPrice(12.78);
        printResultForQ9(book1);

        //q10
        Box box = new Box(2.2, 4.5, 8.9);
        double volume = box.calculateVolume();
        volume = (double)Math.round(volume * 100)/100;
        System.out.println("Question 10: ");
        System.out.println("Box Volume: " + volume);
    }

    //helpers for print results
    private static void printResultForQ1(String s, Boolean b){
        System.out.println("Question 1: ");
        if (b){
            System.out.println("String " + "\"" + s + "\"" + " is palindrome");
        }else{
            System.out.println("String " + "\"" + s + "\"" + " isn't palindrome");
        }
    }

    private static void printResultForQ2(String s, Boolean b){
        System.out.println("Question 2: ");
        if (b){
            System.out.println("String " + "\"" + s + "\"" + " has all unique characters");
        }else{
            System.out.println("String " + "\"" + s + "\"" + " has duplicate characters");
        }
    }

    private static void printResultForQ3(String s, Boolean b){
        System.out.println("Question 3 - consider lowercase and uppercase is duplicated: ");
        if (b){
            System.out.println("String " + "\"" + s + "\"" + " has duplicates");
        }else{
            System.out.println("String " + "\"" + s + "\"" + " doesn't have duplicates");
        }
    }

    private static void printResultForQ4(String s, String s2, Boolean b){
        System.out.println("Question 4: ");
        if (b){
            System.out.println("\"" + s + "\"" + " and " + "\"" + s2 + "\"" +" are anagrams");
        }else{
            System.out.println("\"" + s + "\"" + " and " + "\"" + s2 + "\"" +" aren't anagrams");
        }
    }

    private static void printResultForQ5(int year, Boolean b){
        System.out.println("Question 5: ");
        if (b){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " isn't leap year");
        }
    }

    private static void printResultForQ7(String s1, String s2, Boolean b){
        System.out.println("Question 7: ");
        if (b){
            System.out.println("\"" + s1 + "\"" + " can be constructed from " + "\"" + s2 + "\"");
        }else{
            System.out.println("\"" + s2 + "\"" + " can't be constructed from " + "\"" + s2 + "\"");
        }
    }

    private static void printResultForQ9(Book book){
        System.out.println("Question 9: ");
        System.out.println("**********");
        System.out.println("Book Name: " + book.getName());
        System.out.println("Book ID: " + book.getBookID());
        System.out.println("Book Generes: " + book.getGenres());
        System.out.println("Book Price: $" + book.getPrice());
        System.out.println("**********");
    }

    /*
    Question 1: Write a program find if String is Palindrome?
    consider:
    1.
    time: O(n), space: O(1)
     */
    private static boolean isPalindrome(String str){
        //corner case
        if (str.length() == 0){
            return true;
        }
        //two pointers
        int left = 0, right = str.length() - 1;

        while (left < right){
            while (left < right && !isAlphanumeric(str, left)){
                left++;
            }
            while (left < right && !isAlphanumeric(str, right)){
                right--;
            }
            if (!isEqual(str, left, right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isAlphanumeric(String str, int i) {
        if (!Character.isLetterOrDigit(str.charAt(i))){
            return false;
        }
        return true;
    }

    private static boolean isEqual(String str, int left, int right) {
        if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
            return false;
        }
        return true;
    }

    /*
    Question2: Write a program to check if a string has all unique characters.
    consider:
    1.skip space when using set, count space when calculate total length
    time: O(n), space: O(1)
    */
    private static boolean hasAllUnique(String str){
        //corner case
        //we suppose if str is null or is empty string, we return false
        if (str == null || str.length() == 0){
            return true;
        }

        //use set speciality, only contains unique elements
        HashSet<Character> set = new HashSet<>();
        int spaceCount = 0;
        for (char c: str.toCharArray()){
            if (c == ' '){
                spaceCount++;
                continue;
            }
            if (!set.contains(c)){
                set.add(c);
            }
        }

        if ((set.size() + spaceCount) != str.length()){
            return false;
        }

        return true;
    }

    /*
    Question3: Write a program to check if string contains duplicates
    consider:

    time: O(nlogn), space: O(1)
    */
    private static boolean hasDuplicates(String str){
        Arrays.sort(str.toCharArray());
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    /*
    Question4: Write a program to check if two strings are anagrams
    consider:
    lowercase and uppercase
    if all is lowercase, we can use an array and ASCII to count chars position number in str1,
    and reduce it for str2, if count length equals to 0, it means true;
    if both lowercase and uppercase, we need hashmap to save Character and count

    time: O(n), space: O(n)
    */
    private static boolean areAnagrams(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }else{
                map.put(s1.charAt(i), 1);
            }
            //why this step can't work as above
//            Integer count = map.getOrDefault(s1.charAt(i), 1) + 1;
//            map.put(s1.charAt(i), count);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            }
        }

        for (Character ch: map.keySet()){
            if (map.get(ch) != 0){
                return false;
            }
        }

        return true;
    }

    /*
    Q5: Write a program to determine whether the year is a leap year or not.
    time: O(1), space: O(1)
     */
    private static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }
            else{
                return true;
            }
        }

        return false;
    }

    /*
    Question 6: Write a program to calculate the monthly telephone bills as per the following rule:
    Minimum $ 200 for up to 100 calls
    Plus $ 0.60 per call for next 50 calls.
    Plus $ 0.50 per call for next 50 calls.
    Plus $ 0.40 per call for any call beyond 200 calls.
     */
    private static void calculateBills(int calls){
        double MIN_BILL = 200;
        int MIN_CALLS = 100;
        int INTERVAL = 50;
        double Fee_WITHIN_100_TO_150 = 0.60;
        double Fee_WITHIN_151_TO_200 = 0.50;
        double Fee_WITHIN_BEYOND200 = 0.40;

        int caseNum = 0;
        double bill = 0;

        System.out.println("Question 6: ");
        if (calls < 100){
            bill = MIN_BILL;
        }
        if (calls > 100 && calls <= 150){
            caseNum = 1;
        }
        if (calls > 150 && calls <= 200){
            caseNum = 2;
        }
        if (calls > 200){
            caseNum = 3;
        }


        switch (caseNum){
            case 1:
                bill = MIN_BILL + (calls - MIN_CALLS) * Fee_WITHIN_100_TO_150;
            case 2:
                bill = MIN_BILL + INTERVAL * Fee_WITHIN_100_TO_150 + (calls - MIN_CALLS - INTERVAL) * Fee_WITHIN_151_TO_200;
            case 3:
                bill = MIN_BILL + (INTERVAL * Fee_WITHIN_100_TO_150) + (INTERVAL * Fee_WITHIN_151_TO_200)
                        + ((calls - MIN_CALLS - INTERVAL - INTERVAL) * Fee_WITHIN_BEYOND200);
        }

        System.out.println("The calls is " + calls + ". The monthly telephone bills is " + bill);
    }

    /*
    Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.
    HashMap
    time: O(m), m refers to magazine's length,
    space: O(k), k refers to 26, because hashmap size wouldn't more than 26
    */
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (char ch: magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch: ransomNote.toCharArray()){
            int countInMagazine = map.getOrDefault(ch, 0);
            if (countInMagazine == 0){
                return false;
            }
            map.put(ch, countInMagazine - 1);
        }

        return true;
    }

    private static void gradeMeaning(char grade){
        String meaning;

        switch (grade){
            case 'A':
                meaning = "Excellent";
                break;
            case 'B':
                meaning = "Good";
                break;
            case 'C':
                meaning = "Average";
                break;
            case 'D':
                meaning = "Deficient";
                break;
            default:
                meaning = "Failing";
        }
        System.out.println("Question 8: ");
        System.out.println(grade + "\t" + meaning);
    }
}
