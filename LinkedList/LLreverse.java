package LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class LLreverse{
    // public static void main(String args[]){
    //     LinkedList<Integer> list2 = new LinkedList<>();
    //     list2.add(1);
    //     list2.add(2);
    //     System.out.println("linked list:"+list2);
    //     Collections.reverse(list2);
    //     System.out.println("Reverse LinkedList" + list2);
    // }

    Node head;
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
    }
    }

    public  void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //  reverseIterate();
        System.out.println(list); 
    }
}