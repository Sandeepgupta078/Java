import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Sides of Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b+c == 180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}
