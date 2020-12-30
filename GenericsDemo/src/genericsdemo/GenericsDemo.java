package genericsdemo;

public class GenericsDemo {
    public static void main(String[] args) {
        MyGenericsClass<Integer> g = new MyGenericsClass();

        g.setMyVar(11);
        g.printValue();

        MyGenericsClass2<String> g2 = new MyGenericsClass2();//Will not work because String is not a subclass of Number
        // which is what MyGenericsClass2 is bounded by


    }
}
class MyGenericsClass<T>{
    private T myVar;

    void setMyVar(T i){
        myVar = i;
    }
    void printValue(){
        System.out.println("The value of MyVar is " + myVar);
    }
}
class MyGenericsClass2<T extends Number>{

}
