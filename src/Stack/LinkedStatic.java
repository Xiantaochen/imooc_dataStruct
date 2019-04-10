package Stack;

public class LinkedStatic<E>  implements Stack<E>{

    public LickedList<E> list;
    public LinkedStatic(){
        list = new LickedList<E>();
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E peek() {
        return list.getFirst();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
