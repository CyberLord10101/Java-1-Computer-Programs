package inheritancedemo;

public class NormalMember extends Member{
    public NormalMember(){
        System.out.println("Child constructor with no parameter");
    }
    public NormalMember(String name, int memberID, int memberSince){
        super(name, memberID, memberSince);
        System.out.println("Child constructor with 3 parameters");
    }
    @Override
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*(100 + 12*30);
    }
}
