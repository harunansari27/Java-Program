package Recursion.Easy;

public class Palindrome {
    

public static int rev(int n) {

    // it count the power of n means n=100 , to 10^2 = ans 2 , 
    int digits = (int) Math.log10(n) + 1 ;
    return revHelper(n , digits) ;
        
    }

private static int revHelper(int n, int digits) {
    if(n % 10  == n )
    return n  ;

    int rem =  n%10 ;
    return (int) (rem * Math.pow(10 , digits -1) + revHelper(n/10 , digits -1 )) ;

}

static boolean isPalindrome(int n ){
    return n== rev(n)   ;
}

    public static void main(String[] args) {
  
   System.out.println(isPalindrome(1234321)) ;
        
 
    }

 }


