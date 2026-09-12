package OOPS06.generics;

import java.util.Arrays;

// here T should eithr be Number or its subclass
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    // public void getList(List<Number> list){
        // do something
        // here you can only pass Number type
        // if you want to pass the subclass as well then do this List<? extends Number>
    // }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        Object[] temp = new Object[data.length * 2];

        // copy the current item in the new array
        for(int i = 0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    // public T remove(){
    //     T removed = (T)(data[--size]);
    //     return removed;
    // }

    // public T get(int index){
    //     return (T)(data[index]); 
    // }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
    }
}
