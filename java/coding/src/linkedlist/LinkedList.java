package linkedlist;

public class LinkedList {

    private Node headNode;

    public void appendData(int data){
        Node newNode = new Node(data);
        if (this.headNode == null){
            this.headNode = newNode;
            return;
        }
        Node lastNode = this.headNode;

        while(lastNode.getNextNode() != null){
            lastNode = lastNode.getNextNode();
        }
        lastNode.setNextNode(newNode);
    }

    public void printList(){
        Node currentHead = this.headNode;
        String data = "";
        while (currentHead != null){
            data = data + " -> " + currentHead.getData();
            currentHead = currentHead.getNextNode();
        }
        System.out.println(data);
    }

    public void prependData(int data){
        Node node = new Node(data);
        if (this.headNode != null){
            node.setNextNode(this.headNode);
        }
        this.headNode = node;
    }

    public void delete(int position){
        if (this.headNode == null) {
            return;
        }
        if (position == 0) {
            this.headNode = this.headNode.getNextNode();
            return;
        }
        Node currentNode = this.headNode;
        int index = 0;
        while(currentNode.getNextNode() != null){
            Node nextNode = currentNode.getNextNode();
            if (++index == position){
            // remove the next node
                currentNode.setNextNode(nextNode.getNextNode());
                return;
            } else {
                currentNode = nextNode;
            }
        }
    }
}
