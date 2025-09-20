package Recursion.Array;

// Rotated Binary Search
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RBS {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2} ;
        int target = 0 ;
        int ans = search(arr, target, 0, arr.length - 1) ;
        System.out.println("The element at index : "+ans+" present.") ;

        // second type of printing
        System.out.println("The element at index : "+search(arr, target, 0, arr.length - 1)+" present.") ;
        
    }


    static int search(int[] arr, int target , int s , int e) {
        // base case
        if(s > e) {
            return -1 ;
        }
// find mid element 
        int mid = s + (e - s) / 2 ;

        // case found
        if(arr[mid] == target) {
            return mid ;
        }

        // mid on L1
        if(arr[s] <= arr[mid]) {
            // case a : left search
            if(target >= arr[s] && target <= arr[mid]) {
                return search(arr, target, s, mid - 1) ;
            } else { // case b : right search
                return search(arr, target, mid + 1, e) ;
            }
        } else { // mid on L2
            // case a : right search
            if(target >= arr[mid] && target <= arr[e]) {
                return search(arr, target, mid + 1, e) ;
            } else { // case b : left search
                return search(arr, target, s, mid - 1) ;
            }
        }
       

    }
}
