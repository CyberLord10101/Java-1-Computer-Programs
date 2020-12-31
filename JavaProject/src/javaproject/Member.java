package javaproject;

public class Member {
    private char memberType;
    private int memberID;
    private String name;
    private double fees;

    Member(){

    }
    Member(char memberType, int memberID, String name, double fees){
        this.memberType = memberType;
        this.memberID = memberID;
        this.name = name;
        this.fees = fees;
    }
    public void setMemberType(char memberType){
        this.memberType = memberType;
    }
    public char getMemberType(){
        return memberType;
    }
    public void setMemberID(int memberID){
        this.memberID = memberID;
    }
    public int getMemberID(){
        return memberID;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setFees(double fees){
        this.fees = fees;
    }
    public double getFees(){
        return fees;
    }
    @Override
    public String toString(){
        return String.format("%c, %d, %s, %f", memberType,memberID,name,fees);
    }
}
