
class LinkedList1 {

    Node head;

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
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
        System.out.print("NULL");
    }

    public static void main(String args[]) {

        LinkedList1 list = new LinkedList1();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
        
    }
}