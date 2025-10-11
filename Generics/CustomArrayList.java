package Generics;

import java.util.ArrayList;

public class CustomArrayList {

  private int[] data;
  private static int DEFAULT_SIZE = 10;
  private int size = 0; // also working as index value

  // constructor
  public CustomArrayList() {
    this.data = new int[DEFAULT_SIZE];
  }

  public void add(int num) {
    if (isFull()) {
      resize();
    }
    data[size++] = num;
  }

  private boolean isFull() {
    return size == data.length;
  }

  private void resize() {
    int[] temp = new int[data.length * 2];
    // copy the current items in the new array
    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i];
    }
    data = temp;
  }

  public int remove() {
    int removed = data[--size];
    return removed;
  }

  public int get(int index) {
    return data[index];
  }

  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public void set(int index, int value) {
    data[index] = value;
  }

  @Override
  public String toString() {
    return "CustomArrayList [data=" + java.util.Arrays.toString(data) + ", size=" + size + "]";
  }
  
  public static void main(String[] args) {

    // List already exists in java.util package
  //   ArrayList list = new ArrayList();
  // //   list.add(10);
  // //   list.add("Hello");
  // //  // list.remove(0) ;
  // //   list.isEmpty();
  // //   System.out.println(list);


  // we are creating our own list
  CustomArrayList list = new CustomArrayList(); 
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);
  
  System.out.println(list);
  System.out.println(list.size());
  list.remove();
  System.out.println(list);
    
  }
}
