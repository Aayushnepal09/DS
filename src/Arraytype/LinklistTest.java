package Arraytype;

public class LinklistTest {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node head=null;

    public void addNode(int data){
        Node newnode=new Node((data));
        if (head==null){
            Node current=head;
            head=newnode;


        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;

            }
        }
    }
}
