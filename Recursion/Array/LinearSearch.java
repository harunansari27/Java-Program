package Recursion.Array;

public class LinearSearch {
    
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9} ;
        int target = 2 ;
        boolean ans = search(arr, target , 0 ) ;
        System.out.println(ans);

        int  ans2 = search2(arr , target , 0 ) ;
        System.out.println(ans2);
        
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
}
