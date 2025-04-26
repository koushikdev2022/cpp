// package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearn {
    public static void main(String args[]){
        ArrayList<String> studentName = new ArrayList<>();

        //size = n
        //n+n/2+1
        studentName.add("koushik");
        studentName.add("souvik");
        studentName.add("hirrr");
        studentName.add(1,"koushik");


        ArrayList<String> addList = new ArrayList<>();
        addList.add("krish");
        addList.add("sonarpur");


        studentName.addAll(addList);
        System.out.println(studentName);
        System.out.println(studentName.get(1));
        for(int i=0;i<studentName.size();i++){
            System.err.println(studentName.get(i));
        }
        for (String name : studentName) {
            System.out.println(name);
        }
        Iterator<String> it = studentName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        studentName.remove("koushik");
        studentName.set(1,"ksm");
        studentName.contains("ksm");
        System.out.println(studentName);
        studentName.clear();

        System.out.println(studentName);

    }
}
