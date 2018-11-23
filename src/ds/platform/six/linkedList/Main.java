package ds.platform.six.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertToStart(1);

        list.insertToStart(4);

        list.insertToStart(6);

        //1. Write a Java program to append the specified element to the end of a linked list.
        list.insertToEnd(2);

        //2. Write a Java program to iterate through all elements in a linked list
        list.printList();

        //3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        list.printListAt(2);

        //4. Write a Java program to iterate a linked list in reverse order.
        list.printListReverse();

        //5. Write a Java program to insert the specified element at the specified position in the linked list.
        list.insertAt(2,55);
        list.printList();

        //6. Write a Java program to insert elements into the linked list at the first and last position.
        int[] values = {2,3,67,89,9};
        //insert to front
        list.insertElementsToFront(values);
        //insert to back
        list.insertElementsToEnd(values);
        list.printList();

        //7. Write a Java program to insert the specified element at the front of a linked list.
        list.insertToStart(333333);

        //8. Write a Java program to insert the specified element at the end of a linked list.
        list.insertToEnd(444444444);
        list.printList();

        //9. Write a Java program to insert some elements at the specified position into a linked list.
        int[] values2 = {8,7,3,9,33355};
        list.insertElementsAt(5,values2);
        System.out.println();
        list.printList();

        //10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        list.firstAndLastOccurr(3);

        //11. Write a Java program to remove first and last element from a linked list.
        //remove first
        list.removeFirst();

        //remove last
        list.removeLast();

        //print
        list.printList();









    }
}
