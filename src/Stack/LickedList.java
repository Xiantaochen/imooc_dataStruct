package Stack;

public class LickedList<E> {
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


//    @Override
//    public String toString(){
//        return e.toString();
//    }

    private Node dummyHead;
    private int size;
    public LickedList(){
        dummyHead = new Node(null,null);
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }



    public void add(int index,E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("add failed ,  out of range");

        Node pre = dummyHead;
        for(int i=0; i<=index ; i++)
            pre = pre.next;
//            Node node = new Node(e);
//            node.next = pre.next;
//            pre.next = node;
        pre.next =new  Node(e,pre.next);
        size ++;

    }

    public void  addFirst(E e){
//        Node node = new  Node(e);
//        node.next = head;
//        head = node;
//        head = new Node(e,head);
//        size ++;
        add(0,e);
    }

    public void addLast(E e){
        add(size,e);
    }

    public  E get(int index){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("add failed ,  out of range");
        Node cur = dummyHead.next;
        for(int i = 0; i<index; i++)
            cur = cur.next;
        return cur.e;
    }
    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    public void set(int index, E e){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("add failed ,  out of range");
        Node cur = dummyHead.next;
        for(int i = 0; i<index; i++)
            cur = cur.next;
        cur.e = e;

    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur !=null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
    }

    public E remove(int index){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("add failed ,  out of range");

        Node prev = dummyHead;
        for (int i = 0; i<index;i++)
            prev = prev.next;

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLirst(){
        return remove(size-1);
    }

    @Override
    public  String toString(){
        StringBuilder res = new StringBuilder();
//        Node cur  =dummyHead.nex;
//        while (cur !=null){
//           res.append(cur +"->");
//           cur = cur.next;
//        }
        for (Node cur = dummyHead.next ; cur !=null;cur = cur.next)
            res.append(cur +"->");
        res.append("null");
        return  res.toString();
    }


}
