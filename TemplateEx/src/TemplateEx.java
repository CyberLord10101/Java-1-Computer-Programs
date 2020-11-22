/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Point;
import java.math.BigInteger;

/**
 *
 * @author student
 */
//Template in C++ and Generic in Java
public class TemplateEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 10, j = 12;
        double d = 9.23;
        boolean choice = true, choice2 = false;
        String str = "Java";
        BigInteger b = new BigInteger("2323487338768726348"),
                b2 = new BigInteger("78378463826898267868");
        Point p = new Point(4, -5);
        Dummy dumb = new Dummy(3);
        Dummy dumb2 = new Dummy("Fun Stuff");
        CPoint pt1 = new CPoint(),
                pt2 = new CPoint(3, 2),
                pt3 = new CPoint(2, 3),
                pt4 = new CPoint(-3, 5);
        foo(i);
        foo(d);
        foo(choice);
        foo(str);
        foo(b);
        foo(p);
        foo(dumb);
        //foo2(str);
        foo2(b);
        foo3(choice, choice, choice);
        foo3(choice, choice2, choice2);
        //foo3(choice, choice);

        System.out.println(foo5(str, str));
        System.out.println(foo5(b, b2));
        System.out.println(foo5(i, j));
        //foo5(dumb,dumb);
        System.out.println(foo5(pt1, pt2));
        System.out.println(foo5(pt2, pt3));
        System.out.println(foo5(pt3, pt4));

    }

    public static <T> void foo(T k) {
        System.out.println("Item: " + k);
        if (k instanceof Number) {
            System.out.println("Yes, " + k + " is a numeric.");
        }
    }

    //Upper bound on the generic type
    public static <T extends Number> void foo2(T k) {
        System.out.println(k.intValue());
    }

    //Mutiple arguments of same generic type
    public static <T> void foo3(T a, T b, T c) {
        //System.out.println(a.add(b).add(c)); 
        System.out.println("" + a + b + c);
    }

    //Mutiple arguments of different generic types
    public static <T, U, V> void foo4(T a, U b, V c) {

    }

    //Comapare two generic types
    public static <T extends Comparable<T>> int foo5(T a, T b) {
        return a.compareTo(b);
    }
}
