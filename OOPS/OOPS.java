package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called P1
        p1.setColor("Red");
        p1.setTip(5);
        System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Sandeep";
        myAcc.setPassword("snskaksa");
        // System.out.println(myAcc.username);

        Student s1 = new Student();
    }
}

class Pen {
    private String color;
    private int tip;

    //getter
    String getColor() {
        return this.color;
    } 
    int getTip() {
        return this.tip;
    }
    //setter
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int setTip) {
        tip = setTip;
    }
}

// access modifiers
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}

// constructor
class Student {
    String name;
    int roll;

    //constructor
    Student() {
        System.out.println("Construcor is called...");
    }
}