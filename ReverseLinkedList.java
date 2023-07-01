
class ReverseLinkedList {

    Node head;

    private int size;

    ReverseLinkedList(){
        this.size = 0;
    }

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add first

    public void addFirst(int data){
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

    public void addLast(int data) {
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

    
    // Reverse Linked List using Iteration

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Reverse Linked List using Recursion

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String args[]) {

        ReverseLinkedList list = new ReverseLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
        
    }
}