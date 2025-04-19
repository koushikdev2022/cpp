
class Circle{
    public void area(){
        System.out.println("display the area");
    }
}
class Triangle extends Circle{
    public void area(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
}
public class Inheritance {
    public static void main(String args[]){
        Triangle s1 = new Triangle();
        s1.area();
    }
}
