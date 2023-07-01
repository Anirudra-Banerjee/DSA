import java.util.*;

class PalindromeLinkedList{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);

        boolean flag = true;
        for(int i = 0; i < n / 2; i++){
            if(list.get(i) != list.get(n - 1 - i)){
                System.out.println("Not Plindrome");
                flag = false;
                break;
            }
            
        }
        if(flag){
            System.out.println("The linked list is Palindrome.");
        }

    }
    
    // while(list.Reverse()){

    // }


}