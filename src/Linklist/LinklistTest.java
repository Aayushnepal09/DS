package Linklist;

public class LinklistTest {
    int size=0;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node head=null;
    Node tail=null;



    public void addNode(int data){
        size++;
        Node newnode=new Node((data));
        if (head==null){
            Node current=head;
            head=newnode;
            tail=head;


        }

        else{
            tail.next=newnode;
            tail=newnode;
            
//            Node current=head;
//            while(current.next!=null){
//                current=current.next;
//
//            }
//            current.next=newnode ;

        }
    }
    public void pointList(){
        Node current=head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;

        }


    }
    public int getDataAtPos(int i) {
       if(i<size){
           Node current = head;//j=0
           for(int j=1; j<i;j++){
               current=current.next;
           }

         return current.data;
           }
           return -9999;

       }

    public void remove(int i) {
        Node current = head;//j=0
        for(int j=1;    j<i-1;  j++){
            current=current.next.next;

        }
        current.next=current.next.next;


    }
}

