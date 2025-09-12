package Recursion.Easy;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8,9} ;
        int target = 9 ;
        int ans = Search(arr , target , 0 , arr.length-1 ) ;
        System.out.println(ans);

        
    }

    static int Search(int[] arr , int target , int s , int e ) {

        
        if(s > e) {
            return -1 ;
        }

        int mid = s+(e-s) /2 ; 


        if(arr[mid] == target ) {
            return mid; 
        }

        if(target < arr[mid] ) {
            return Search( arr , target , s , mid-1 ) ;
        }
        return Search(arr , target , mid+1 , e ) ;
    }
}
