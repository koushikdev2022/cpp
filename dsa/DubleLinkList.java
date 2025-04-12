
public class DubleLinkList {
    private  Node head;
    private Node tail;
    private int size;
    class Node{
        Node prev;
        Node next;
        String data;
        Node(String data){
            this.data = data;
            this.prev = null;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
             head = newNode;
             tail = newNode;
             return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    public void addLast(String data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
             head = newNode;
             tail = newNode;
             return;
        }
        while(current.next != null){
            current = current.next;
        }
        newNode.prev = current.next;
        current.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node current = head;
       if(head == null){
        System.out.println("the list is null");
       }
       while(current != null){
             System.out.println(current.data);
             current = current.next;
       }
    }
    public void deleteFrist(){
        if(head == null){
            System.out.println("list null");
        }
        size--;
        Node current = head;
        head = current.next;
        // head.prev = null;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("list null");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
      
        tail = current;
        tail.next = null;
        tail.prev = current.prev;
        // head.prev = null;
    }
    public void count(){
        System.out.println(size);
    }
    public static void main(String[] args) {
        DubleLinkList dl = new DubleLinkList();
        dl.addFirst("a");
        dl.addFirst("b");
        dl.addFirst("c");
        dl.addLast("d");
        dl.deleteFrist();
        dl.deleteLast();
        dl.print();
        dl.count();
    }
}
