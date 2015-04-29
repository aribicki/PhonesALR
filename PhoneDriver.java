package edu.saintjoe.cs.aribicki.phones;

public class PhoneDriver {
    public Phone one;
    public Phone two;
    public Phone three;
    
    public static void main(String[] args) {
    
    one = new Phone("Name", "LG");
    two = new Phone("HowMany", 3);
    three = new Phone("Mystery");
    System.out.println(one.toString());
    System.out.println(two.toString());
    };
    }
