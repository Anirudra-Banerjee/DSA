
class LinkedList1 {

    Node head;

    private int size;

    LinkedList1(){
        this.size = 0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add first

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // if head is not null then we have to add the node in first

        newNode.next = head;
        head = newNode;
        
    }

    // add last

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        
        currentNode.next = newNode; 
    }

    // delete first

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }

        size--;
        head = head.next;
    }

    //delete last

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }

    // print list

    public void printList() {
        
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    // return size as it is declared as private

    public int getSize(){
        return size;
    }
    public static void main(String args[]) {

        LinkedList1 list = new LinkedList1();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        
    }
}