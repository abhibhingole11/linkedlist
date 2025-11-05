import java.util.*;
class AddFirst{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        

    }
 

    public static void main(String args[]){

        
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
      
        Node current = head;
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            System.out.println("Enter num: ");
            int num = sc.nextInt();
            current.next = new Node(num);
            current = current.next;

        }
        // current = head;
        // while(current!=null){
        //     System.out.print(current.data+"->");
        //     current = current.next;
        // }
        System.out.println("Enter num to add first: ");
        int num1 = sc.nextInt();
        Node newNode = new Node(num1);
        newNode.next = head;
        head = newNode;

       
          System.out.println("Enter num to add last: ");
          num1 = sc.nextInt();
          Node newNode2 = new Node(num1);
          current = head;
          while(current!=null){
          
           if(current.next==null){
            current.next = newNode2;
            newNode2.next = null;
           }
           current = current.next;
          }
           current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
        }

        

      
        


    }
   
}