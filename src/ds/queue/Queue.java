package ds.queue;

public class Queue {
    private int maxSize; //initializes set number of slots
    private long[] queArray; //slots to maintain data
    private int front; //this will be the index position for the element in the front
    private int rear; //index position of element at back of line
    private int nItems; // counter to maintain the number of items in our queue

    public Queue(int size){
        maxSize=size;
        queArray=new long[size];
        front=0; //index position of the first slot of the array
        rear = -1;// there is no item in the array yet to be considered the last item
        nItems=0; //no items as of yet
    }
    //insert things to end of queue
    public void insert(long j){
        if(rear==maxSize-1){
            rear=-1; 
        }
        rear++;
        queArray[rear]=j;
        nItems++;
    }
    //remove item from front
    public long remove(){
       long temp = queArray[front];
       front++;
       if(front==maxSize){
           front=0;
       }
       nItems--;
        return temp;
    }

    public long peakFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems==maxSize);
    }

    public void view(){
        System.out.print("[");
        for (int x =0;x<queArray.length;x++){
            System.out.print(queArray[x]+", ");
        }
        System.out.print("]");
    }




}
