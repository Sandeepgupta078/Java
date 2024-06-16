import java.util.*;

// public class Patterns {
//   public static void main(String args[]) {
//     int n = 5;
//     // upper half
//     for (int i = 1; i <= n; i++) {
//       for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       int spaces = 2 * (n - i);
//       for (int j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//       }
//       for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
    
//     // for lower
//     for (int i = n; i >= 1; i--) {
//       for (int j = i; j >= 1; j--) {
//         System.out.print("*");
//       }
//       int spaces = 2 * (n - i);
//       for (int j = spaces; j >= 1; j--) {
//         System.out.print(" ");
//       }
//       for (int j = i; j >= 1; j--) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


//  public class Patterns{
//     public static void main(String args[]){
//         int n = 5;
//         for(int i=1; i<=n;i++){
//             int space = n-i;
//             for(int j =1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=1;i<=n;i++){
//             // spaces
//             for(int j =1;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


public class Patterns {

    public static void main(String[] args) {
        int n=5;
        for(int i =1;i<=n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}