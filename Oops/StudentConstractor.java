package Oops;

class studentInfo{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
// defualt constractor
    studentInfo(){ 
        System.out.println("called constractor");
    }

    // parameter constoractor
    // studentInfo(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    // parameter with constoractor for kown as copy constoractor
    studentInfo(studentInfo student2){
        this.name = student2.name;
        this.age = student2.age;
    }
}

public class StudentConstractor {
    public static void main(String[] args) {
        //this is for defualt constoractor
        studentInfo student1 = new studentInfo();
        student1.name = "Aashlesha";
        student1.age = 21;

        studentInfo student2 = new studentInfo(student1);

        //this is for parameter 
        // studentInfo student1 = new studentInfo("sameer", 21);

        student1.printInfo();
        student2.printInfo();
    }
}
