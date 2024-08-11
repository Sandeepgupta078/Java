package Stack;
import java.util.*;

public class validParanthesis {  //o(n)

    public static boolean isValid(String str){ 
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){   //opening
                s.push(ch);
            }else{
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    // duplicate parenthesis
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        // closing
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == ')'){
                int count = 0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // String str = "({[({})]})]";
        // System.out.println(isValid(str));

        String str = "(((a+b) + (c+d)))";
        System.out.println(isDuplicate(str));

    }
}
