package ds.singlyLinkedList;

public class SinglyLinkedList {
    private Node first;//first node of list

    public SinglyLinkedList(){}

    public boolean isEmpty(){return (first==null);}

    //use to insert at the beginning of the list
    public void insertFirst(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=first;
        first=newNode;
    }

    public void insertLast(int data){
        Node current =first;
        while(current.next!=null){
            current=current.next; //when next = null it will stop
        }
        Node newNode = new Node();
        newNode.data=data;
        current.next=newNode;
    }

    public Node deleteFirst(){
        Node temp=first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List(first-->last)");
        Node current =first;
        while(current!=null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();
    }
}
