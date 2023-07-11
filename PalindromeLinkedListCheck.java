import java.util.*;

class PalindromeLinkedList{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            list.add(sc.nextLine());
        }

        System.out.println(list);

        boolean flag = true;
        for(int i = 0; i < n / 2; i++){
            if(list.get(i).equals(list.get(n - 1 - i)) ){
                
            }
            else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("The linked list is Palindrome.");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    
}