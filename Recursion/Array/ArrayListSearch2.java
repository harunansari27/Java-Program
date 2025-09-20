package Recursion.Array;

import java.util.ArrayList;

public class ArrayListSearch2 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,7,3,9} ;
        int target = 3 ;
    
        ArrayList<Integer> result = findAllIndex(arr, target, 0) ;
        System.out.println(result) ; 
        
        // OR 

        System.out.println(findAllIndex(arr, target, 0)) ;
        
    }


    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>() ;
        // base case
        if(index == arr.length) {
            return list ;
        }

        // if found the target element
        if(arr[index] == target) {
            list.add(index) ;
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index + 1) ;
        list.addAll(ansFromBelowCalls) ;
        return list ;
    }
}
