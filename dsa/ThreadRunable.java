public class ThreadRunable implements Runnable{
    public void run(){
            for( ; ;){
                System.out.println("koushik");
            }
    }
    public static void main(String args[]){
             ThreadRunable runnable = new ThreadRunable();
             Thread t1 = new Thread(runnable);
             t1.start();
             for( ; ;){
                 System.out.println("mondal");
             }
            

    }
}