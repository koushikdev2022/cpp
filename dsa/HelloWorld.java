import java.util.LinkedList;

public class HelloWorld {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");

        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}
