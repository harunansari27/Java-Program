package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // current index

    // Constructor
    public WildCards() {
        this.data = new Object[DEFAULT_SIZE];
    }


    // WildCards example
    public void getList(List<? extends Number> list) {
        // do something
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @SuppressWarnings("unchecked")
    public T remove() {
        T removed = (T) data[--size];
        data[size] = null; // avoid memory leak
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        Object[] actualData = Arrays.copyOf(data, size);
        return "CustomGenericsArrayList" + Arrays.toString(actualData);
    }

    public static void main(String[] args) {
        WildCards<Integer> list = new WildCards<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        System.out.println("Size: " + list.size());
        list.remove();
        System.out.println("After remove: " + list);
        System.out.println("Get index 1: " + list.get(1));

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(2 * i);
        }
        System.out.println(arrayList);
    }
}
