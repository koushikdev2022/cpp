

class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
    Student(){

    }
}


public class CopyConst {
    
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "koushik";
        s1.age = 42;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
