package Oops;

class Student {
    String name;
    static String school;
}

public class Static {
    public static void main(String[] args) {
        Student.school = "jvm";
        Student s1 = new Student();
        s1.name = "manisha";
        System.out.println(s1.school +" "+s1.name);
    }
}
