// public  class Recursion1 {
//     public static void printNumb(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }

//     public static void main(String args[]){
//         int n=5;
//         System.out.println(n);
//         printNumb(n-1);
//     }
// }
 

// sum of n natural numbers
// public class Recursion1{
//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String args[]){
//         printSum(1, 5, 0);
//     }
// }

// public class Recursion1{
//     public static int calcFactorial(int n){
    
//         if(n==1 || n==0){
//             return 1;
//         }
//         int facnm1= calcFactorial(n-1);
//         int facn = n*facnm1;
       
//         return facn;
//     }

//    public static void main(String args[]){
//     int n=5;
//     int ans = calcFactorial(n);
//     System.out.println(ans);
//    }
// }

// fibonacci series
public class Recursion1{
    public static void printFib(int a,int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String args[]) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n =7;
        printFib(a, b, n-2);
    }
}