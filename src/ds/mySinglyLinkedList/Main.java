package ds.mySinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertToStart(10);
        myList.insertToEnd(20);
        myList.insertToEnd(20);
        myList.insertToEnd(40);
        myList.insertToEnd(50);
        myList.insertToEnd(50);
        myList.insertToEnd(70);
        myList.sortedInsert(45);
        myList.sortedInsert(45);
        myList.sortedInsert(0);
        myList.display();
        myList.removeDup();
        myList.display();

    }
}
