package Stack;
import java.util.*;

// some other forms of this type ques like -
// next greater right
// next greter left
// next smaller right
// next smaller left

public class nextGreater {
    // next greater right
    // public static void main(String[] args) {
    //     int arr[] = {6,8,0,1,3};
    //     int nextGreater[] = new int[arr.length];
    //     Stack<Integer> s = new Stack<>();

    //     for(int i = arr.length - 1; i>=0; i--){
             
    //         while(!s.isEmpty() && (arr[s.peek()] <= arr[i])){
    //             s.pop();
    //         }
    //         if (s.isEmpty()) {
    //             nextGreater[i] = -1;
    //         }else{
    //             nextGreater[i] = arr[s.peek()];
    //         }
    //         // push element in stack
    //         s.push(i);
    //     } 
    //     for(int i=0; i<nextGreater.length; i++){
    //         System.out.print(nextGreater[i] + " ");
    //     }
    //     System.out.println();
    // }


    // next greater left
    // public static void main(String[] args) {
    //     int arr[] = {6,8,0,1,3};
    //     int nextGreater[] = new int[arr.length];
    //     Stack<Integer> s = new Stack<>();

    //     for(int i = 0; i<= arr.length-1; i++){
             
    //         while(!s.isEmpty() && (arr[s.peek()] <= arr[i])){
    //             s.pop();
    //         }
    //         if (s.isEmpty()) {
    //             nextGreater[i] = -1;
    //         }else{
    //             nextGreater[i] = arr[s.peek()];
    //         }
    //         // push element in stack
    //         s.push(i);
    //     } 
    //     for(int i=0; i<nextGreater.length; i++){
    //         System.out.print(nextGreater[i] + " ");
    //     }
    //     System.out.println();
    // }


    // next smaller right
    // public static void main(String[] args) {
    //     int arr[] = {6,8,0,1,3};
    //     int nextGreater[] = new int[arr.length];
    //     Stack<Integer> s = new Stack<>();

    //     for(int i = arr.length-1; i>=0; i--){
             
    //         while(!s.isEmpty() && (arr[s.peek()] >= arr[i])){
    //             s.pop();
    //         }
    //         if (s.isEmpty()) {
    //             nextGreater[i] = -1;
    //         }else{
    //             nextGreater[i] = arr[s.peek()];
    //         }
    //         // push element in stack
    //         s.push(i);
    //     } 
    //     for(int i=0; i<nextGreater.length; i++){
    //         System.out.print(nextGreater[i] + " ");
    //     }
    //     System.out.println();
    // }


    // next smaller left
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i<= arr.length-1; i++){
             
            while(!s.isEmpty() && (arr[s.peek()] >= arr[i])){
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            // push element in stack
            s.push(i);
        } 
        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}


