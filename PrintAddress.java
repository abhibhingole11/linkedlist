import java.util.*;
class PrintAddress{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
         Node(){
            this.next = null;
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node head= new Node();
        Node current = head;
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        

        for(int i = 0; i<size; i++){
            System.out.println("Enter number: ");
            int num = sc.nextInt();
            if(){

            }

          
           
            current = current.next;

        }
     
        // System.out.println(head.next);
        Node newNode = new Node(100);
        newNode.next = head;
        head = newNode;

           current= head;
        while(current!=null){
            System.out.println(current.data + "   --->   ");
            current = current.next;
        }


    }
}