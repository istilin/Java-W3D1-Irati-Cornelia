package irati.A3;

public class Student {
    private String fullname;
    private int year;
    private int age;
    private String classnum;

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassnum(String classnum) {
        this.classnum = classnum;
    }

    public void display(){
        System.out.println(fullname + ", born in " + year + ", age " + age + ", goes to class " + classnum);
    }
}
