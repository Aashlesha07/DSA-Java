package Oops;

abstract class animal{
    abstract void walk();
    animal(){
        System.out.println("Create new animal");
    }
    public void eats(){
        System.out.println("Animal can eats");
    }
}
class Horse extends animal{
    Horse(){
        System.out.println("create new hours");
    }
    public void walk(){
        System.out.println("walk in 4 legs");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println(" walk in 2 legs");
    }
}

public class AnimalAbstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();

        // horse.walk();
        // horse.eats();
    }
    
}
