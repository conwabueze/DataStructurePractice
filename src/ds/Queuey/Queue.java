package ds.Queuey;

import java.util.LinkedList;

public class Queue {
    LinkedList queue;

    //Making a queue instance
    public Queue(){
        queue= new LinkedList();
    }

    //check if is empty
    public boolean isEmpty(){
        return queue.getFirst()==null;
    }

    //size/length
    public int size(){
        return queue.size();
    }

    //Enqueue add something to end of list, last person in line
    public void enqueue(int data){
        queue.addLast(data);
    }

    //dequeue remove from front
    public int dequeue(){
        return (int)queue.remove(0);
    }

    //peak at the first item
    public int peak(){
        return (int)queue.get(0);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(77);
        q.enqueue(5);
        q.enqueue(4340);
        System.out.println("first out: "+ q.dequeue());
        System.out.println("second out: "+ q.dequeue());
        System.out.println("third-23 out: "+ q.dequeue());

    }


}
