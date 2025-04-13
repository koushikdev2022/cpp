
public class CircularLinkList {
   private Node head ;
   private int size;
   private Node tail;
   class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
   }
   private void addFirst(String data){
       Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           tail = newNode;
           tail.next = head;
           return;
       }
       newNode.next = head;
       head = newNode;
       tail.next = head;
   }
   public void addLast(String data){
        Node newNode = new Node(data);
        Node current = tail;
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

   public void getCount(){
      System.out.println(size);
   }
   public void deleteFirst(){
        Node current = head.next;
        if(head == null){
            System.out.println("linklist is null");
        }
        size--;
        head = current;
        tail.next = head;
   }
   public void deleteLast(){
        Node current = head;
        if(head == null){
            System.out.println("linklist is null");
            return;
        }
        size--;
        if(tail == head){
            tail = null;
            head = null;
            return;
        }
        
        while(current.next != tail){
             current = current.next;
        }
        tail = current;
        tail.next = head;

   }


   private void print(){
       Node current = head;
       Node end = tail.next;
       if(head == null){
          System.out.println("linklist empty");
       }
       do{
          System.out.println(current.data);
          current = current.next;
       }while(current != head);
       
   }
   public static void main(String[] args) {
        CircularLinkList cll = new CircularLinkList();
        cll.addFirst("ab");
        cll.addFirst("bc");
        cll.addFirst("cd");
        cll.addLast("koushik");
        cll.addLast("ko2ushik");
        cll.deleteFirst();
        cll.deleteLast();
        cll.getCount();
        cll.print();
   } 
}
