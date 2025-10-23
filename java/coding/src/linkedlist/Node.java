package linkedlist;

public class Node {

    private int data;

    private Node nextNode;

    public Node(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public void setNextNode(Node node){
        this.nextNode = node;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
