package inheritancedemo;

import java.util.Scanner;

abstract public class Member {
    public String welcome = "Welcome to ABC fitness";
    protected double annualFee;
    private String name;
    private int memberID, memberSince, discount;

    public Member(){
        System.out.println("Parent constructor with no parameter");
    }
    public Member(String name, int memberID, int memberSince){
        System.out.println("Parent constructor with 3 parameters");

        this.name = name;
        this.memberID = memberID;
        this.memberSince = memberSince;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(){
        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter the admin password: ");
        password = input.nextLine();
        if(!password.equals("abcd")){
            System.out.println("Incorrect password you do not have the authority to edit this discount");
        }else{
            System.out.println("Please enter the discount: ");
            discount = input.nextInt();
        }
    }

    public void displayMemInfo(){
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberID);
        System.out.println("Member Since: " + memberSince);
        System.out.println("Annual Fee: " + annualFee + "\n");
    }
    abstract public void calculateAnnualFee();


}
