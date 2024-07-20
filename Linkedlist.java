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

    // reverse a linkedlist
    public void reverse(){     //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // remove Nth Node from end  - imp concept
    public void deleteNthNodefromEnd(int n){
        // calculate size 
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size == n){ //remove first
            head = head.next;
        }

        int i = 1;
        int indexToFind = size - n;
        Node prev = head;
        while(i < indexToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // palindrome number
    // find mid 
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){

        //base case 
        if(head == null || head.next == null){
            return true;
        }

        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse half linkedlist
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left  = head;

        // step3 - check half left == half right
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        if(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; //cycle exists
            }
        }
        return false; // cycle does not exist
    }

    // public static void removeCycle() {
    //     // detect cycle
    //     Node slow = head;
    //     Node fast = head;
    //     boolean cycle = false;

    //     if(fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next;
    //         if (fast == slow) {
    //             cycle  = true;
    //             break;
    //         }
    //     }
    //     if(cycle == false) {
    //         return;
    //     }
    //     // find meeting point - slow = fast
    //     slow = head;
    //     Node prev = null;
    //     while(slow != fast){
    //         prev = fast;
    //         slow = slow.next;
    //         fast = fast.next;
    //     }

    //     // remove cycle -> last.next = null
    //     prev.next = null;
    // }


    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        // ll.add(3,1);
        ll.print();
        // ll.deleteNthNodefromEnd(3);
        // ll.print();
        // ll.reverse();
        // ll.print();
        System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(5);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.err.println(isCycle());
    }
}