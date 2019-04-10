package LinkList;

import java.util.LinkedList;

public class linklist<E> {
    private class  Node{
        public E e;
        public Node next;
        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }
    }


    @Override
    public String toString(){
        return e.toString();
    }

    private Node head;
    private int size;
    public linklist(){
        head = null;
        size = 0;
    }

    public int GetSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void  addFirst(E e){
//        Node node = new  Node(e);
//        node.next = head;
//        head = node;
        head = new Node(e,head);
        size ++;
    }

    public void add(int index,E e){

    }



}
