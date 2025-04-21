
public class ThreadDemo extends Thread{
    ThreadDemo(String name){
        super(name);
    }
    public void run(){
         System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[]){
        System.out.println("hello");
        ThreadDemo td1 = new ThreadDemo("thread1");
        ThreadDemo td2 = new ThreadDemo("thread1");
        td1.start();
        td2.start();

    }
}