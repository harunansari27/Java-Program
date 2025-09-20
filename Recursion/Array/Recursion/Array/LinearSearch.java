package Recursion.Array.Recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,4,5,6,7,8,9} ;
        int target = 4 ;
        boolean ans = search(arr, target , 0 ) ;
        System.out.println(ans);

        int  ans2 = search2(arr , target , 0 ) ;
        System.out.println(ans2);

        int index3 = arr.length -1 ;
        System.out.println(searchLastIndex(arr, target, index3));

        findAllIndex(arr , target , 0 ) ;
        System.out.println("At  the place of "+list+" Target is found." );
        
    }

// Number Present or Not
    static boolean search(int[] arr, int target , int index) {
        
        // base case 
        if(index == arr.length) {
            return false ;
        }

        return arr[index] == target || search(arr, target, index+1) ;
    
    }


    // Finding index of Element 

    static int search2(int[] arr , int target , int index2) {
        if(index2 == arr.length) {
            return 0 ;
        }

        if(arr[index2] == target) {
            return index2 ;
        }

        return search2(arr , target , index2+1 ) ;
    }



    static int searchLastIndex(int[] arr , int target , int index3) {
        if(index3 == -1) {
            return 0 ;
        }

        if(arr[index3] == target) {
            return index3 ;
        }

        return searchLastIndex(arr , target , index3-1 ) ;

       
    }


    static ArrayList<Integer> list = new ArrayList<>() ;

    static void findAllIndex(int[] arr , int target , int index) {
        if(index == arr.length) {
            return ;
        }

        if(arr[index] == target) {
            list.add(index) ;
        }

        findAllIndex(arr , target , index+1 ) ;
    }
}
