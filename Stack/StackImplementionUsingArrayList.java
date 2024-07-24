package Stack;

import java.util.ArrayList;

public class StackImplementionUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        // function to check stack is empty or not
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push operation -> push data into stack
        public static void push(int data){
            list.add(data);
        }

        // pop operation -> pop data from stack
        public static int pop(){
            // base case
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek operation -> return peek value from the stack
        public static int peek(){
            // base case
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        System.err.println(s.peek());
        s.pop();
        System.err.println(s.peek());
    }
}
