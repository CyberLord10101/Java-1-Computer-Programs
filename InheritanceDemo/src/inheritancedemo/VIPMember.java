package inheritancedemo;

public class VIPMember extends Member{
    public VIPMember(String name, int memberID, int memberSince){
        super(name,memberID,memberSince);
        System.out.println("Child Constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*1200;
    }

}
