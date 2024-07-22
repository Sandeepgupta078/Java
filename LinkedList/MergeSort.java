package LinkedList;
// import java.util.*;

public class MergeSort {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node lefthead, Node righthead){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(lefthead != null && righthead != null){
            if(lefthead.data <= righthead.data){
                temp.next = lefthead;
                lefthead  = lefthead.next;
                temp = temp.next;
            }else{
                temp.next = righthead;
                righthead = righthead.next;
                temp = temp.next;
            }
        }
        while (lefthead != null) {
            temp.next = lefthead;
            lefthead  = lefthead.next;
            temp = temp.next;
        }
        while (righthead != null) {
            temp.next = righthead;
            righthead = righthead.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // find mid 
        Node mid = getMid(head);

        // left and right merge sort
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        // merge
        return merge(newleft,newRight);
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);

        print(head);

        head = mergeSort(head);
        print(head);

    }
}
