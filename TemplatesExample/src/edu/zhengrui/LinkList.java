package edu.zhengrui;

public class LinkList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int count;

    public LinkList(){
        head = null;
        tail = null;
        count = 0;
    }

    public void printList(){
        if (head != null){
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data + ", ");
            temp = temp.next;
        }
    }

}
