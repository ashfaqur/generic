package stack;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class FIFOQueue<T> {

    private QueueNode<T> first;
    private QueueNode<T> last;

    public T remove() {
        if (this.first == null) {
            throw new NoSuchElementException();
        }
        T data = this.first.data;
        this.first = this.first.nextNode;
        if (this.first == null){
            this.last = null;
        }
        return data;
    }

    public void add(T data){
        QueueNode<T> node = new QueueNode<>(data);
        if (this.first == null) {
            this.first = node;
            this.last = node;
        } else {
            this.last.nextNode = node;
            this.last = node;
        }

    }

    public T peek(){
        if (this.first == null){
            throw new NoSuchElementException();
        }
        return this.first.data;
    }

    public boolean isEmpty(){
        return (this.first == null);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        QueueNode<T> node = this.first;
        while (node != null){
            builder.append(node.data);
            node = node.nextNode;
            if (node != null){
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }


    private static class QueueNode<T> {
        private final T data;
        private QueueNode<T> nextNode;

        public QueueNode(T data){
            this.data = data;
        }
    }
}
