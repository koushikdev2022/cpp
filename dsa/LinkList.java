
public class LinkList {
    private Node head;
    private int size;
    LinkList(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        } 

        newNode.next = head;
        head = newNode;
    }
   
    public void lastAdd(String data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
            return;
        } 
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        Node current = head;
        // System.out.println(current.data);
        head = current.next;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
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
        current.next = null;
    }
    public int count(){
        int count = 0;
        Node current = head;
        if(head == null){
           System.out.println(count);
           return count;
        }
        while(current != null){
            count = count+1;
            current = current.next;
        }
        System.out.println(count);
        return count;
    }
    public int getSize(){
        return size;
    }
    public void printList(){
        Node currentNode = head;
        if(head == null){
            System.out.println("list is empty");
        }
        while(currentNode != null){
            System.out.println(currentNode.data + "---->");
            currentNode = currentNode.next;
            
        }
        System.out.println("null");
    }
    // public String toString() {
    //     StringBuilder result = new StringBuilder();
    //     Node current = head;
    //     while (current != null) {
    //         result.append(current.data).append(" -> ");
    //         current = current.next;
    //     }
    //     result.append("null");
    //     return result.toString();
    // }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst("a");
        list.lastAdd("b");
        list.lastAdd("here");
        list.lastAdd("new");
        list.deleteFirst();
        list.deleteLast();
        list.count();
        list.printList();
        System.out.println(list.getSize());
    }
}
