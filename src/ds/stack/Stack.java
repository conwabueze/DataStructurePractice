package ds.stack;

public class Stack {

    private int maxSize;
    private String[] stackArray;
    private int top; //index position of last item

    public Stack(int size){
        maxSize=size;
        stackArray=new String[maxSize];
        top=-1;
    }

    public void push(String j){
        if(isFull()){
            System.out.println("Stack is full");
        }else {
            top++;
            stackArray[top] = j;
        }
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("The stack is already empty");
            return "";
        }else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public String peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize-1==top);
    }





}
