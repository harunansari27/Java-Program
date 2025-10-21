package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>();
    List<Integer> anotherList = new LinkedList<>();

    anotherList.add(10);
    anotherList.add(20);
    anotherList.add(30);
    System.out.println("Second List " + anotherList);
    myList.addAll(anotherList);
    System.out.println("First List " + myList);
  }
}
