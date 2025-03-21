package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// public class ActivitySelection {
    
//     public static void main(String args[]){
//         int start[] = {1,3,0,5,8,5};
//         int end[] = {2,4,6,7,9,9};

//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //1st Activity
//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = end[0];

//         for(int i=1; i<end.length; i++){
//             if(start[i] >= lastEnd){
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd = end[i];
//             }
//         }
//         System.out.println("Max Activity :" + maxAct);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();

//     }
// }


// if end are not sorted
public class ActivitySelection {
    
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {9,2,7,6,4,9};

        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function -> short form
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=1; i<end.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Activity :" + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
