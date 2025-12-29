package AMAZON;

public class RemoveElement {

  public static int  removeElement (int[] nums , int val ) {

    int count = 0 ; 

    for(int i= 0  ; i< nums.length ; i++) {

      if(nums[i]  != val) {
        nums[count] = nums[i] ;
        count++ ;
      }

    }

    return count ;
  }

  public static void main(String[] args) {
    int[] nums = {1,1,2,3,4} ;
    int val = 1 ;

    int k = removeElement(nums , val) ;

    System.out.println("New length is : " + k) ;

    System.out.print("Modified array is : ") ;
    for(int i = 0 ; i < k ; i++) {
      System.out.print(nums[i] + " ") ;
    }

  }
  
}
