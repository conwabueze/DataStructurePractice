package ds.platform.six.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(){
        head=null;
        tail=null;
    }

    //Check if empty
    public boolean isEmpty(){
        return head == null;
    }

    //Retrieve Head
    public Node getHead(){
        return head;
    }

    //Retrieve tail
    public Node getTail(){
        return tail;
    }

    //Insert at start of list
    public void insertToStart(int data){
        Node node = new Node(data);
        //if empty attach first Node into head and then attach the tail to the head
        //because there is only one Node so it is the head and tail
        if(isEmpty()){
            head = node;
            tail = head;
        }
        //if not empty take the new node and attach its next to the head then
        //set the heads previous to the new node
        //finally set the new node to the head
        else {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
    }

    public void insertToEnd(int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
            tail = head;
        }
        //in order to insert an element to the end of the list you set the the current tails next variable to the new node
        //then I set the new nodes previous to the current tail
        //Finally set the tail to the new node
        else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    //Print list from head to tail
    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
        }
        else{
            Node current = head;
            while (current!=null){
                System.out.print(current.getData()+" ");
                current=current.getNext();
            }
            System.out.println("\n");
        }
    }

    //Print list from tail to head
    public void printListReverse(){
        if(head==null)
            System.out.println("List is Empty");
        else{
            Node current = tail;
            while(current!=null){
                System.out.print(current.getData()+" ");
                current=current.getPrevious();
            }
        }
    }

    //length of list
    public int listLength(){
        int length = 0;
        if(head==null)
            return 0;
        else{
            Node current = head;
            while(current!=null){
                length++;
                current=current.getNext();
            }
        }
        return length;
    }

    //traverse list at specified index
    public void printListAt(int position){
        int index = 0;

        if(isEmpty()){
            System.out.println("is Empty");
        } else {
            Node current = head;
            while(current!=null){
                if(index == position){
                    System.out.print(current.getData() + " ");
                    current=current.getNext();
                }else {
                    index++;
                    current=current.getNext();
                }
            }
        }

    }

    public void insertElementsToFront(int[] values){
        for(int i = values.length-1; i>=0; i--){
            insertToStart(values[i]);
        }

    }

    public void insertElementsToEnd(int[] values){
        for(int i = 0; i<values.length; i++){
            insertToEnd(values[i]);
        }

    }

    public void insertAt(int position, int data){
        int index = 0;


        if(isEmpty()){
            insertToStart(data);
        } else if(position==listLength()-1){
            insertToEnd(data);
        }else {
            Node current = head;
            while(current!=null){
                if(index == position-1){
                    Node node = new Node(data);

                    node.setNext(current.getNext());
                    node.setPrevious(current);

                    current.getNext().setPrevious(node);

                    current.setNext(node);
                    break;
                }else {
                    index++;
                    current=current.getNext();
                }
            }
        }

    }

    public void insertElementsAt(int position, int[] values){
        int index=0;
        if(isEmpty()){
            insertElementsToFront(values);
        }
        else if(position==listLength()-1){
            insertElementsToEnd(values);
        }
        else{
            Node current = head;
            Node node = null;
            while(current!=null){
                if(index==position-1){
                    for(int i = values.length-1; i>=0; i--){
                        insertAt(position,values[i]);
                    }
                    break;
                }
                index++;
            }
        }

    }

    public void firstAndLastOccurr(int value){
        int first = 0, last=0, check=0,index=0;

        if(isEmpty())
            System.out.println("is Empty");
        else if(listLength()==0 && head.getData()!=value)
            System.out.println("Not found");
        else if(listLength()==0 && head.getData()==value)
            System.out.println("First and only occurrence of value " + value +"is at index: " + value);
        else{
            Node current = head;
            while(current != null){
                if(current.getData() == value && check==0) {
                    first = index;
                    check=1;
                }
                else if(current.getData()==value){
                    last=index;
                }
                current=current.getNext();
                index++;
            }

            System.out.println("First occurrence: " + first + " Last Occurance: "+ last);
        }

    }

    public void removeFirst(){
        if(listLength()==0){
            head = null;
            tail=null;
        }
        else
            head=head.getNext();
    }

    public void removeLast(){
        if(listLength()==0) {
            head = null;
            tail = null;
        }
        else
            tail=tail.getPrevious();

    }




}
