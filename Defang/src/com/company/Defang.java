package com.company;

public class Defang {

    public static void main(String[] args) {
	    Defang d = new Defang();
        System.out.println(d.defangIPaddr("111.222.333.444"));
    }
    public String defangIPaddr(String address) {
        if(address.length() != 0 ){
            return address.replaceAll("\\.", "[.]");
        }
        return null ;
    }
}
