package ds.queue;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(30);
        myQueue.insert(80);
        myQueue.insert(90);
        myQueue.view();
    }
}
