package AMAZON;

public class LongestPrefix {

  public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    System.out.println(LCP(strs));
  }



  // Function to find the longest common prefix  ---------- 1
  public static String LCP(String[] strs ){

    if(strs == null || strs.length == 0 ){
      return "";
  }

    // String prefix = strs[0];

    // for(int i = 1; i < strs.length; i++){
    //   while(strs[i].indexOf(prefix) != 0){
    //     prefix = prefix.substring(0, prefix.length() - 1);

    //     if(prefix.isEmpty()) 
    //       return "";
    //   }
    // }

    // return prefix;


    // Optimized Approach  ---------- 2
    if (strs == null || strs.length == 0) return "";

    for (int i = 0; i < strs[0].length(); i++) {
        char ch = strs[0].charAt(i);

        for (int j = 1; j < strs.length; j++) {
            if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                return strs[0].substring(0, i);
            }
        }
    }
    return strs[0];

    // alternate approach using sorting

    // Arrays.sort(strs);
    // String first = strs[0];  
    // String last = strs[strs.length - 1];
    // int i = 0;
    // while (i < first.length() && i < last.length()) {
    //     if (first.charAt(i) == last.charAt(i)) {
    //         i++;
    //     } else {
    //         break;
    //     }
    // }
    // return first.substring(0, i);
    

  }
  
}
