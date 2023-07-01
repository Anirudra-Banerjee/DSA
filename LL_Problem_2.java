
//Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.

import java.util.*;

public class LL_Problem_2 {
    
    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the no of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int data = sc.nextInt();
            if(data >= 1 && data <= 50){
                list.add(data);
            }
            else{
                System.out.println("You have entered a wrong number,please try again.");
            }
        }

        ListIterator<Integer> iterate = list.listIterator();
            while(iterate.hasNext()){
                //Integer value = iterate.next();
                if(iterate.next() > 25){
                    iterate.remove();
                }
            }
            
        System.out.println("The updated list is: ");
        System.out.println(list);
        sc.close(); //used for close the scanner.
    }
}
