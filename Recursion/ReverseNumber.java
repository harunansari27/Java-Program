package Recursion;

public class ReverseNumber {
    
    static int sum =0  ;

  public static void rev1(int n) {

        if(n==0){
            return;
        }  

        int rev = n% 10; 
        sum = sum *10 + rev ; 
        rev1(n/10) ;
    }

    public static void main(String[] args) {
        
        rev1(125) ;
        
    System.out.println(sum);
    }

 }
