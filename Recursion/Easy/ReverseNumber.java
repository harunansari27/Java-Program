package Recursion.Easy;

public class ReverseNumber {
    
    static int sum =0  ;

//   public static void rev1(int n) {

//         if(n==0){
//             return;
//         }  

//         int rev = n% 10; 
//         sum = sum *10 + rev ; 
//         rev1(n/10) ;
//     }

public static int rev2(int n) {

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



    public static void main(String[] args) {
        
      //  rev1(125) ;
      int ans = rev2(1234) ;
      System.out.println(ans);
        
//    System.out.println(sum);
    }

 }
