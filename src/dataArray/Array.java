package dataArray;

public class Array {
    private int[] data;
    private int size;


    public Array(int capacity){
        data = new int[capacity];
        size = 0;

    }

    public Array(){
        this( 10);
    }


    // 获取数组中元素的个数
    public int getSize(){
        return size;
    }


    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addLast(int e){
        if(size == data.length) {
            throw new IllegalArgumentException("addlat failed , array is full");
        }
        data[size] = e;
        size ++;
    }

    public void addFirst(int e){
        add(0,e);
    }

    public void add(int index,int e){
        if(size == data.length) {
            throw new IllegalArgumentException("addlat failed , array is full");
        }
        if(index <0 || index > size)
        {
            throw new IllegalArgumentException("add failed , array is full");
        }
        for(int i = size - 1; i>=index ; i-- )
            data[i+1] = data[i];
        data[index] = e;
        size ++;
    }

    int get(int index){
        if(inde < 0 || index >=size)
            throw new IllegalArgumentException("add failed , array is full");
        return data[index];
    }

    void set(int index, int e){
        if(inde < 0 || index >=size)
            throw new IllegalArgumentException("add failed , array is full");
        data[index] = e;
    }

    public boolean contains(int e){
        for(int i =0; i<size; i++){
            if(data[i] == e)
               return true;
        }
        return false;
    }

    public int find(int e){
        for(int i =0; i<size; i++){
            if(data[i] == e)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d, capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append("]");
        return res.toString();
    }

}
