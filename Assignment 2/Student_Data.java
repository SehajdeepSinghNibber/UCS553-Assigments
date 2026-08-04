class Student{
    String name;
    long rollNo;

    void display(){
        System.out.println("Student's Name is "+name);
        System.out.println("Student's Roll No is "+rollNo);
    }
}

public class Student_Data{
    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Sehajdeep";
        s1.rollNo = 1024030864;

        s1.display();
    }
}