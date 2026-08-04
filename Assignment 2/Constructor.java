class Teacher{
    String name;
    String subject;
    int number_classes;

    Teacher(String n, String s, int nc){
        name = n;
        subject = s;
        number_classes = nc;
    }
    void display(){
        System.out.println("Teacher: "+name+", Subject: "+subject+", Number of classes alloted: "+number_classes);
    }
}

public class Constructor {
    public static void main(String[] args){
        
        Teacher t1 = new Teacher("Sehajdeep Singh","Programming" , 8);
        Teacher t2 = new Teacher("ABC Singh","Programming in Java" , 6);

        t1.display();
        t2.display();
        
    }
}
