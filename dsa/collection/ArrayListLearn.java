// package collection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


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



        Stack<String> animal = new Stack<>();

        animal.push("dog");
        animal.push("cat");
        animal.push("book");

        System.out.println("stack" + animal);

        System.out.println(animal.peek());

        animal.pop();

        System.out.println(animal.peek());


        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(22);
        queue.offer(23);
        queue.offer(10);


        System.err.println(queue);

        queue.poll();
        System.err.println(queue);
        System.err.println(queue.peek());

        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder);
        //heap memory change minheap to max hip in memory
        // anonimus comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(121);
        pq.offer(221);
        pq.offer(231);
        pq.offer(101);


        System.err.println(pq);

        pq.poll();
        System.err.println(pq);
        System.err.println(pq.peek());


        //array deck 

        //q queue to remove both side from array 

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offer(25);
        adq.offer(27);
        adq.offerFirst(28);
        adq.offerLast(27);

        System.out.println(adq); 
        adq.poll();
        adq.pollLast();
        adq.pollFirst();
        System.out.println(adq);


        //has no order can obtains randoms
        //only can set same element means if there is one 54 second 54 can not assign
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(13);
        set.add(14);
        set.remove(12);

        System.out.println(set);
        System.out.println(set.contains(13));
        set.clear();

        //same but it is linklist set insert into set 1 by one
        Set<Integer> setl = new LinkedHashSet<>();
        setl.add(12);
        setl.add(13);
        setl.add(13);
        setl.add(14);
        setl.remove(12);

        System.out.println(setl);
        System.out.println(setl.contains(13));
        setl.clear();


        // graph tree for shorted format
        
        Set<Integer> setlt = new TreeSet<>();
        setlt.add(12);
        setlt.add(13);
        setlt.add(13);
        setlt.add(14);
        setlt.remove(12);

        System.out.println(setlt);
        System.out.println(setlt.contains(13));
        setlt.clear();

        Map<String,Integer> number = new HashMap<>();
        number.put("one",1);
        number.put("two",2);
        number.put("two2",3);
        number.put("three",3);

        System.out.println(number);

        if(number.containsKey("two")){
            number.put("two",2);
        }
        number.putIfAbsent("two",23);

        for (Map.Entry<String,Integer> e: number.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        for(String key: number.keySet()){
            System.out.println(key);
        }

        for(Integer val: number.values()){
            System.out.println(val);
        }

        System.out.println(number.containsValue(3));
        System.out.println(number.containsKey("two"));


        System.out.println(number.isEmpty());

        number.clear();




        Map<String,Integer> number1 = new TreeMap<>();
        number1.put("one",1);
        number1.put("two",2);
        number1.put("two2",3);
        number1.put("four",4);

        System.out.println(number1);

        if(number1.containsKey("two")){
            number1.put("two",2);
        }
        number1.putIfAbsent("two",23);

        for (Map.Entry<String,Integer> e: number1.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        for(String key: number1.keySet()){
            System.out.println(key);
        }

        for(Integer val: number1.values()){
            System.out.println(val);
        }

        System.out.println(number1.containsValue(3));
        System.out.println(number1.containsKey("two"));


        System.out.println(number1.isEmpty());

        number1.clear();




        Map<String,Integer> number3 = new LinkedHashMap<>();
        number3.put("one",1);
        number3.put("two",2);
        number3.put("two2",3);
        number3.put("four",4);

        System.out.println(number3);

        if(number3.containsKey("two")){
            number3.put("two",2);
        }
        number3.putIfAbsent("two",23);

        for (Map.Entry<String,Integer> e: number3.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        for(String key: number3.keySet()){
            System.out.println(key);
        }

        for(Integer val: number3.values()){
            System.out.println(val);
        }

        System.out.println(number3.containsValue(3));
        System.out.println(number3.containsKey("two"));


        System.out.println(number3.isEmpty());

        number3.clear();
    }
}
