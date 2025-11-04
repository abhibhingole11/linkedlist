import java.util.*;
class Delete{
    static class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int data){
            this.data = data;
            this.next = next;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        Node head = new Node();
        Node current = head;
        for(int i = 0; i<size; i++){
            System.out.println("Enter element: ");        
            current.next = new Node(sc.nextInt());
            current = current.next;

        }
        current = head.next;
        while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        
    }
}