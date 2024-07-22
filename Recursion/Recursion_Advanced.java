package Recursion;
// public class Recursion_Advanced{
//     public static void printPerm(String str, String permutation){
//         if(str.length()==0){
//             System.out.println(permutation);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char currChar = str.charAt(i);
//             String newstr = str.substring(0,i) + str.substring(i+1);
//             printPerm(newstr,permutation+currChar);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         printPerm(str, " ");
//     }
// }

// public class Recursion_Advanced{
//     public static int countPaths(int i,int j,int n,int m){
//         if(i==n || j==m){
//             return 0;
//         }
//         if(i == n-1 && j == m-1){
//             return 1;
//         }
//         int downpaths = countPaths(i+1, j, n, m);
//         int rightpaths = countPaths(i, j+1, n, m);
//         return downpaths+ rightpaths;
//     }
//     public static void main(String args[]){
//         int n=3 , m=3;
//         int totalpaths = countPaths(0, 0, n, m);
//         System.out.println(totalpaths);
//     }
// }


// public class Recursion_Advanced{
//     public static int placeTiles(int n,int m){
//         if(n==m){
//             return 2;
//         }
//         if (n<m) {
//             return 1;
//         }
//         int vertPlacements = placeTiles(n-m, m);
//         int horPlacements = placeTiles(n-1, m);
//         return vertPlacements+ horPlacements;
//     }
//     public static void main(String args[]){
//         int n=4, m=2;
//         System.out.println(placeTiles(n, m));
//     }
// }

public class Recursion_Advanced{
    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }
        int ways1 = callGuest(n-1);
        int ways2 = (n-1)*callGuest(n-2);
        return ways1 + ways2;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(callGuest(n));
    }
}