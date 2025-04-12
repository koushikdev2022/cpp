
import java.util.*;

public class LinkListCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("b");
        list.addLast("c");
        System.out.println(list);
        System.out.println(list.size());
    }
}
