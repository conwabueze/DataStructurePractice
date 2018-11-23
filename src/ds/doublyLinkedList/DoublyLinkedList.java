package ds.doublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        first =null;
        last =null;
    }

    public boolean isEmpty(){
        return first ==null;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            last = newNode;//if empty last will refer to the newNOde
        }else{
            first.previous=newNode;
            newNode.next= first;//the new nodes next field will point to the old node
        }
        first=newNode;
    }

    public void insertLast(int data){
        Node newNode =new Node(data);

        if(isEmpty()){
            first=newNode;
        }else{
            last.next=newNode;
            newNode.previous=last;
        }
        last=newNode;

    }

    //assume that its a non empty list at this point
    public Node deleteFirst(){
        Node temp = first;
        if(isEmpty()) return null;
        if(first.next==null){//there is only one item in the list
            last=null;
        }else{
            first.next.previous=null;
        }
        first=first.next;
        return temp;//return deleted first node
    }

        //assume non empty list
    public Node deleteLast(){
        Node temp = last;
        if(isEmpty()||first.next==null){
            first=null;
            last=null;
        }else{
            last=last.previous;
            last.next=null;
        }
        return temp;
    }

    public boolean insertAfter(int after, int data){
        Node current = first;
        while(current.data!=after){
            current=current.next;
            if(current==null) return false;
        }
        Node newNode = new Node(data);
        if(current==last){
            current.next=newNode;
            newNode.previous=current;
            last=newNode;
            return true;
        }else {
            newNode.next = current.next;
            current.next.previous = newNode;
            newNode.previous = current;
            current.next = newNode;
            return true;
        }
    }

    public Node deleteKey(int key){
        Node current = first;
        while(current.data!=key){
            current=current.next;
            if(current==null) {
                System.out.println("Value not found");
                return null;
            }
        }
        if(current==first){
            first=current.next;
            current.next.previous=null;
        }
        if(current==last){
            last=current.previous;
            current.previous.next=null;
        }else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        return current;
    }

    public void display(){
        Node current = first;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

}
