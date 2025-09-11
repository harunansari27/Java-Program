package Recursion;

public class ZerosCount {
    public static void main(String[] args) {
        System.out.println(countZeros(1002003));
    }


    private static int helper(int n) {
        if(n==0){
            return 0;
        }
        int rem = n%10 ;
        if(rem==0){
            return 1 + helper(n/10) ;
        }
        return helper(n/10) ;
    }   

    
    static int countZeros(int n){
        if(n==0){
            return 1;
        }
        return helper(n);
    }
}
