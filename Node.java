class ArrayToLL{
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String args[]){
          int []arr = {10,20,30,40};
          
          
         

           Node head = new Node(10);
           Node current = head;
           for(int i = 1; i<arr.length; i++){
            current.next = new Node(arr[i]);
            current = current.next;
           }
           current = head;
          while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
          }
          
    }
    
}
