import java.util.*;
class First{
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
        System.out.println("Enter size");
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            int num = sc.nextInt();
            Node current = head;
            current.next = new Node(num);
            current = current.next;


        }
        current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        




    }

}