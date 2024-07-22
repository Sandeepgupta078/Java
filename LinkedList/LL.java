package LinkedList;

import java.util.*;

// class LL{
//     public static void main(String args[]){
//         LinkedList<String> list = new LinkedList<>();
//         list.add("a");
//         list.addFirst("is");
//         list.addLast("List");
//         list.add(2, "linked");
//         list.addFirst("This");
//         System.out.println(list);

//         System.out.println(list.get(3));
//     }
// }

class LL{
    Node head;
    LL(){
    }

    public class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}

public void addFirst(String data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}

public void addLast(String data){
    Node newNode = new Node(data);

    if(head == null){
        head = newNode;
        return;
    }
    Node lastNode = head;
    while(lastNode.next != null){
        lastNode = lastNode.next;
    }
    lastNode.next = newNode;
}

public void printList(){
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data + "->");
        currNode = currNode.next;
    }
    System.out.println("null");
}

public static void main(String args[]){
    LL list = new LL();
    list.addFirst("is");
    list.addFirst("This");
    list.printList();

    list.addLast("Linkedlist");
    list.printList();
}
}
