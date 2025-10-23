package stack;

import java.util.EmptyStackException;

public class LIFOStack<T> {

    private StackNode<T> head;

    public T pop(){
        if (head == null){
            throw new EmptyStackException();
        }
        T data = head.data;
        head = head.nextNode;
        return data;
    }

    public void push(T data){
        StackNode<T> node = new StackNode<T>(data);
        node.nextNode = head;
        head = node;
    }

    public T peek(){
        if (head == null){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public boolean isEmpty(){
        return (head == null);
    }


    private static class StackNode<T> {
        private final T data;
        private StackNode<T> nextNode;

        public StackNode(T data){
            this.data = data;
        }
    }
}
