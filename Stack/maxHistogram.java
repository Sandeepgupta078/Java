package Stack;
import java.util.*;

public class maxHistogram {

    public static void maximumArea(int arr[]){

        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // next smaller right
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // calculate area - height * width
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            // width = j -i -1 or (nsr[i] - nsl[i] -1)
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Maximum Area in Histogram: " + maxArea);

    }


    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3}; // height of histogram
        int arr2[] = {2,4};
        maximumArea(arr2);
    }
}
