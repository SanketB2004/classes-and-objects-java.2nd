package This_Static_Keyword;

// this is a static example 

public class Student {

    String name;
    static String college = "COEP";

    Student(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name + " " + college);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student("Sanket");
Student s2 = new Student("Rahul");

s1.display();
s2.display();
    }
}
