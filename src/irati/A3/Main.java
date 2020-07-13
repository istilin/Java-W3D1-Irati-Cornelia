package irati.A3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setFullname("John Doe");
        student1.setYear(2005);
        student1.setAge(14);
        student1.setClassnum("3b");

        student2.setFullname("Georgiana Doe");
        student2.setYear(2006);
        student2.setAge(13);
        student2.setClassnum("2c");

        student3.setFullname("Alice Wonder");
        student3.setYear(2004);
        student3.setAge(15);
        student3.setClassnum("4a");

        student4.setFullname("Max Power");
        student4.setYear(2005);
        student4.setAge(14);
        student4.setClassnum("3d");

        student5.setFullname("Wendy Miau");
        student5.setYear(2004);
        student5.setAge(15);
        student5.setClassnum("4b");

        ArrayList <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        for (Student student: studentList){
            student.display();
        }

    }
}
