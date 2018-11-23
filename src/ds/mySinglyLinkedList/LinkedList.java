package ds.mySinglyLinkedList;

import java.util.ArrayList;

public class LinkedList {
    private Node head;
    private Node tail;


    public LinkedList() {
        head = null;
        tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    //method to check if its empty
    public boolean isEmpty(){
        return head==null;
    }

    //method to get size of list
    public int listLength(){
        if(isEmpty())return 0;
        int length = 0;
        Node current = head;
        while(current!=null){
            length++;
            current=current.getNext();
        }
        return length;
    }

    //method to insert at start of list
    public void insertToStart(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=head;
            return;
        }
        newNode.setNext(head);
        head=newNode;

    }

    //method to insert at end of list
    public void insertToEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            insertToStart(data);
            return;
        }
        tail.setNext(newNode);
        tail=newNode;
    }

    //method to insert at a certain position
    public void insertAtPos(int index,int data){
        Node newNode = new Node(data);
        if(head==null){
            insertToStart(data);
            return;
        }
        if(index==0){
            newNode.setNext(head);
            head=newNode;
            tail=newNode.getNext();
            return;
        }
        if(index==listLength()-1){
            insertToEnd(data);
            return;
        }

        int count=0;
        Node current=head;
        while(count!=index-1){
            current=current.getNext();
            count++;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);

    }

    //delete at index
    public void deleteAtPos(int index){
        Node current =head;
        int count =0;
        if(isEmpty()) return;
        if(index==0){
            head = head.getNext();
            return;
        }
        if(index==listLength()-1){
            while(count!=index-1){
                current=current.getNext();
                count++;
            }
            current.setNext(null);
            return;
        }

        while(count!=index-1){
            current=current.getNext();
            count++;
        }
        current.setNext(current.getNext().getNext());
    }

    //Count method method count the amount of times a given number appears in a list
    public int count(int data){
        if(head==null)return 0;
        int count=0;
        Node current = head;
        while(current!=null){
            if(current.getData()== data){count++;}
            current=current.getNext();
        }
        return count;
    }

    //method return the value in specified node position
    public int getNth(int pos){
        if(head==null)return -1;
        Node current =head;
        for(int x=0;x<pos;x++){
            current=current.getNext();
        }
        return current.getData();
    }
    //deletes list
    public void deleteList(){
        head=null;
        tail=null;
    }

    //pop method deletes the head node and return its data
    public int pop(){
        int value = head.getData();
        head=head.getNext();
        return value;
    }

    //sortedInsert method places the node in the right position in an already sorted linked List
    public void sortedInsert(int data){
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            tail=newNode;
            return;
        }
        if(head.getData()>data){
            newNode.setNext(head);
            head=newNode;
            return;
        }
        if(tail.getData()<data){
            tail.setNext(newNode);
            tail=newNode;
            return;
        }
        Node current= head;
        while(current!=null){
            if(current.getNext().getData()>data){
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                return;
            }
            current=current.getNext();
        }

    }

    //insertSort method rearranges nodes in increasing order
    public void insertSort(LinkedList list){

    }

    //append method takes two list a and b and attaches b to the end of a
    //and then sets b to null;
    public void append(LinkedList b){
        if(head==null){
            head=b.getHead();
            tail=b.getTail();
            b.setHead(null);
            b.setTail(null);
        }

        if(b.getHead()==null) return;

        tail.setNext(b.getHead());
        tail=b.getTail();
        b.setHead(null);
        b.setTail(null);
    }

    public void removeDup(){
        if(head==null||head.getNext()==null)return;
        ArrayList<Integer> uniqueNums = new ArrayList<>();
        uniqueNums.add(head.getData());
        Node current=head;
        while(current!=null){
            if(uniqueNums.contains(current.getNext().getData())){
                if(current.getNext().getNext()==null) {//checks if we are at the tail
                    current.setNext(null);
                }
                //current.setData(current.getNext().getData());//takes the value from the node over
                current.setNext(current.getNext().getNext());//then set the next link to the node 2 over
            }
            else if(!uniqueNums.contains(current.getNext().getData())){
                uniqueNums.add(current.getNext().getData());
            }
            current=current.getNext();
        }
        /*
        while(current!=null){
            current=current.getNext();
            if(uniqueNums.contains(current.getData())){
                current.setNext(current.getNext().getNext());
            }
            else if(!uniqueNums.contains(current.getData())){
                uniqueNums.add(current.getData());
            }
        }
        /*
        if(uniqueNums.contains(current.getNext().getData())){
            current.setNext(null);
        }
        */
    }


    //display content of list
    public void display(){
        Node current = head;
        while (current!=null){
            System.out.print(current.getData()+" ");
            current=current.getNext();
        }
        System.out.println();

    }


}