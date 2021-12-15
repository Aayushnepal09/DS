package Arraytype;


public class QueueTest {
    int front;
    int rear;
    int size;
    int queue[];

    public void enqueue(int data){
        if(isFull()){
            System.out.println("quwuw is over flow ");
        }
        else {
            if(isEmpty()){
                front++;

            }
            queue[++rear]=data;

        }
    }
        public int dequeue(){
        if(isEmpty()){
            System.out.println("quwue is underflow");
            return -999999;

        }
        else{
            int element=queue[front];

            if(front>=rear){
                front=-1;
                rear=-1;

            }
            else{
                front++;

            }
            return element;

        }

}

    QueueTest(int n){
        this.front=-1;
        this.rear=-1;
        this.size=n;
        queue=new int[n];

    }
    public boolean isFull() {
        return rear==size-1;

    }
    public boolean isEmpty(){
        return front==-1;

    }
}

