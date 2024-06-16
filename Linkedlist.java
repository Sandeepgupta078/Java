public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1- create new node
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 - newNode->next = head;
        newNode.next = head;
        // step 3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            tail.next = head.next = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print linkedlist
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in the middle of linkedList
    public void add(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        if(index == 0) {
            addFirst(data);
            return;
        }
        size++;
        while(i < index - 1) {
            temp = temp.next;
            i++;
        }
        // at i = index - 1, temp -> prev
        // add newNode in the middle
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // RemoveFirst LinkedList
    public int removeFirst() {
        if(size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last in LinkedList
    public int removeLast() {
        if(size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }


    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 7);
        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print(); 
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}