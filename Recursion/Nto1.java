package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        printNto1(10);
    }

    static void printNto1(int n ) {
        if(n== 0)
        return ; 

        System.out.print(n +" ");

        printNto1(n-1);
    }
}
