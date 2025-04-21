public class ThreadNew extends Thread{
    public void run(){

    }
     static{
        System.out.println("gandu nilanjan");
     } 

    
    public static void main(String args[]){
        ThreadNew tn = new ThreadNew();
        System.out.println("k");
        tn.start();
         System.out.println("kd");
          System.out.println(tn.getState());
    }
}