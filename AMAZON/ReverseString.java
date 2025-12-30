package AMAZON;

public class ReverseString {
  public static void revStr(char[] s ) {
    int left = 0 ,  right = s.length-1 ;
    while (left < right) {
      char temp = s[left] ;
      s[left] = s[right] ;
      s[right] = temp ; 
      left++ ;
      right-- ;
    }
  }

  public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'} ;
    System.out.println("Before rev string: ") ;
    System.out.println(s)  ;
    revStr(s) ;
    System.out.println("After rev string: ") ;
    System.out.println(s) ;
  }
}
