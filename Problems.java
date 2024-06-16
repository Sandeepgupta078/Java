// import java.lang.*;
import java.util.*;
// public class Problems{
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int n=10, i=1,sum=0;
//         while(i<=n){
//             sum =sum + i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class Problems{
//     public static int sum(int a,int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Sum is:"+ sum(a, b));
//     }
// }

//  public class Problems{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         double a = sc.nextInt();
//         double b = sc.nextInt();
//         int result = (int) Math.pow(a, b);
//         System.out.println(result);
//     }

   
//  }

// Calculator
// public class Problems{
//     public static void main(String args[]) {
//         System.out.println("You Have Following Choices : ");
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");
//         System.out.println("Enter Your Choices: ");

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         switch(n){
//             case 1:
//             System.out.println("Addition");
//             break;
//             case 2:
//             System.out.println("Subtraction");
//             break;
//             case 3:
//             System.out.println("Multiplication");
//             break;
//             case 4:
//             System.out.println("Division");
//             break;
//             default:
//             System.out.println("Invalid");
//         }
//         System.out.println("Enter Your First No.:");
//         int a = sc.nextInt();
//         System.out.println("Enter Your Second No.:");
//         int b = sc.nextInt();
//         if(n==1){
//             System.out.println("Result:"+ (a+b));
//         }
//         else if(n==2){
//             System.out.println("Result:" + (a-b));
//         }
//         else if (n==3){
//             System.out.println("Result:"+ (a*b));

//         }
//         else if(n==4){
//             System.out.println("Result:" +(a/b));
//         }
//         else if(n>4){

//         }

//     }
// }

// factoerial of no.
// public class Problems{
//     public static int factorial(int n){
//         if(n==0 || n == 1){
//             return 1;
//         }
//         return n*factorial(n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no. : ");
//         int n = sc.nextInt();
//         System.out.println( "Factorial of no. is :"+factorial(n));

//     }
// }


// Telephone Bills 
public class Problems{
    public static void main(String args[]){
        System.out.println("Telephone Bills: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of calls: ");
        int n = sc.nextInt();
        if(n<=100){
            System.out.println("Rs:200");
        }
        else if (n>100 && n<=150 ){
            Double Rs = 200.00 + 0.60*(n-100);   
            System.out.println("Rs:" +Rs);
        }
        else if (n>150 && n<=200){
            Double Rs = 200.00+ 0.60*50 + 0.50*(n-150);
            System.out.println("Rs: "+Rs);
        }
        else if (n>200){
            Double Rs = 200.00 + 0.60*50 +0.50*50 +0.40*(n-200);
            System.out.println("Rs:" + Rs);
        }
    }
}