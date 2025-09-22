class WrapperClass {
      public static void main(String[] args) {
            int a = 10;


 // Please read about this  Concept , // Autoboxing  ,  // Boxing

            Integer i = 10 ; 
            Integer j = 20 ; 

            System.out.println(a + " " + i + " " + j);
            swap1(i, j);
            System.out.println(i + " " + j);
      }


      public static void swap1(Integer i, Integer j) {
            Integer temp =i;
            i = j;
            j = temp;
      }
}
