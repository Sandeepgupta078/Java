import java.util.LinkedList;

public class classroom {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();

        // add element
        ll.addFirst(2);
        ll.add(1,3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);

        // remove element
        ll.removeFirst();
        ll.removeLast();
        ll.remove(1);
        System.out.println(ll);
    }
}
