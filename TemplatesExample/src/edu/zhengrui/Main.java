package edu.zhengrui;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> list = new LinkList<>();
    }

    public Node<Integer> initializeList(){
        Node<Integer> head = new Node(-1);
        head.next = new Node<>(5);
        head.next.next = new Node<>(7);
        head.next.next.next = new Node<>(30);
        head.next.next.next.next = new Node<>(23);
        return head;
    }
}
