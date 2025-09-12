package Recursion.Easy;

public class DigitSum {

    public static void main(String[] args) {

        int num = 12345 ; 
        System.out.println("Sum of the Digits : " +sum(num)); 
        
    }


    static int sum (int n ) {

        if(n == 0 ){
            return 0;
        } 

        return n%10  + sum(n/10)  ;
    }
    
}
