package Recursion.Array;

import java.util.ArrayList;

public class ArrayListSearch {
    // find the index of target in the array using arraylist 

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,7,3,9};
        int target = 3; 
    
        ArrayList<Integer> result = findAllIndex(arr, target, 0, new ArrayList<Integer>());
        System.out.println(result);
        
    }


    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        // base case
        if(index == arr.length){
            return list;
        }

        // if found the target element
        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index + 1, list);
    }
}
