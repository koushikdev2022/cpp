
import java.util.Scanner;
class Question{
    String question;
    String ans;
    Question(String question,String ans){
          this.question = question;
          this.ans = ans;
    }
}
public class Quiz{
    
    public static void startQuiz( Question que []){
        int count = 0;
        for(int i=0;i<que.length;i++){
            System.out.println(que[i].question);
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your ans");
            String answer =  scanner.next();
            if(answer.equalsIgnoreCase(que[i].ans)){
                System.out.println("right ans");
                count++;
            }else{
                System.out.println("wrong  ans");
            }
        }
    }
    public static void main(String[] args){
        String s1 = "1. Who invented Java Programming?\n"
                  + "a) Guido van Rossum\n"
                  + "b) James Gosling\n"
                  + "c) Dennis Ritchie\n"
                  + "d) Bjarne Stroustrup";

        String s2 = "2. Which statement is true about Java?\n"
                  + "a) Java is a sequence-dependent programming language\n"
                  + "b) Java is a code dependent programming language\n"
                  + "c) Java is a platform-dependent programming language\n"
                  + "d) Java is a platform-independent programming language";

        String s3 = "3. Which component is used to compile, debug and execute the java programs?\n"
                  + "a) JRE\n"
                  + "b) JIT\n"
                  + "c) JDK\n"
                  + "d) JVM";

        String s4 = "4. Which one of the following is not a Java feature?\n"
                  + "a) Object-oriented\n"
                  + "b) Use of pointers\n"
                  + "c) Portable\n"
                  + "d) Dynamic and Extensible";

        String s5 = "5. Which of these cannot be used for a variable name in Java?\n"
                  + "a) identifier & keyword\n"
                  + "b) identifier\n"
                  + "c) keyword\n"
                  + "d) none of the mentioned";
        Question que[] = {
            new Question(s1, "b"),
            new Question(s2, "d"),
            new Question(s3, "c"),
            new Question(s4, "b"),
            new Question(s5, "c")
        };
        startQuiz(que);
    }
}