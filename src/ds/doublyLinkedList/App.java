package ds.doublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertLast(3);
        list.insertLast(6);
        list.insertLast(33);
        list.insertLast(89);
        list.insertLast(3567);
        list.insertAfter(6,2);
        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(3);
        list.display();
    }

}
