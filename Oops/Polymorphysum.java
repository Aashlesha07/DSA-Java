package Oops;

class studentInfo{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name, int age){
        System.out.println(this.name+this.age);
    }
}
public class Polymorphysum {
    
    public static void main(String[] args) {
        //this is for defualt constoractor
        studentInfo student1 = new studentInfo();
        student1.name = "Aashlesha";
        student1.age = 21;

        student1.printInfo(student1.name, student1.age);
}

}