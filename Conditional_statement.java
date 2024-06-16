import java.util.*;
public class Conditional_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age>18){
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("not adult");

        // }    

        // int number = sc.nextInt();
        // if(number%2==0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("odd");
        // }

        int button = sc.nextInt();
        // if(button==1){
        //     System.out.println("hello");
        // }
        // else if(button==2){
        //     System.out.println("Namste");
        // }
        // else if(button == 3){
        //     System.out.println("bonjour");
        // }
        // else{
        //     System.out.println("Invalid button");
        // }

       switch(button){
        case 1: System.out.println("hello");
        break;
        case 2:System.out.println("Namaste");
        break;
        case 3: System.out.println("bonjour");
        break;
        default:System.out.println("Invalid");
       }
    }
}
