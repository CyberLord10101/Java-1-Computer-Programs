package inheritancedemo;

public class NormalMember extends Member{
    public NormalMember(){
        System.out.println("Child constructor with no parameter");
    }
    public NormalMember(String name, int memberID, int memberSince){
        super(name, memberID, memberSince);
        System.out.println("Child constructor with 3 parameters");
    }

    public static void main(String[] args) {
        NormalMember myChildMember = new NormalMember("James", 1, 2010);
    }
}
