
//Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.


import java.util.*;
public class LL_Problem_1 {
    
    public static void main(String args[]){

        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the no. of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        System.out.println("Enter the no. to be searched: ");
        int a = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(list.get(i) == a){
                System.out.println("The index of searched no is: " + i);
            }
        }
    }
}
