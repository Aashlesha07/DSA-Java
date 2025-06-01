package Oops;

interface Animal{
    int eyes = 2;
    void walk();
}
interface harbivore{

}

class hours implements Animal , harbivore{ //multiple inheritance
    public void walk(){
        System.out.println("4 legs");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        hours hours = new hours();
        hours.walk();
    }
}
