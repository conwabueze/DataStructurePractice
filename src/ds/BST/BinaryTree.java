package ds.BST;

public class BinaryTree {
    Node root;//beginning of tree

    //this method inserts node
    public void add(int data){
        Node newNode= new Node(data);//Node we are trying to add to the tree

        if(root==null) root =newNode; //if there is no root make one

        Node current = root;//basically a null checker
        Node parent;//keeps parent to know if we should add or not


        while (true) {
            //traverse left
            parent = current;//parent needs to be constantly updated
            if (data <= current.getData()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            }
            //traverse right
            else{
                current=current.getRight();
                if(current==null){
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }

    public boolean find(int data) {
        if (root == null) return false; //if tree is empty

        Node current = root;
        while (current != null) {
            if (data == current.getData()) {
                return true;
            }
            else if (data < current.getData()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return false;
    }

    public void delete(int data){

    }
}
