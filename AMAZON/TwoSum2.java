package AMAZON;

import java.util.HashMap;

public class TwoSum2 {
  
  public static int[] twoSum(int[] numbers , int target ) {
    var data = new HashMap<Integer, Integer>();

    for(int i = 0 ; i<numbers.length ; i++) {

      int needed = target - numbers[i];
      if(data.containsKey(needed)) {
        return new int[] {data.get(needed) , i};
      }

      data.put(numbers[i], i);
    }
  
    return new int[]{};
  }

  public static void main(String[] args) {
    int[] numbers = {2,7,11,15};
    int target = 9;
    int[] result = twoSum(numbers, target);
    System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 1, 2
  }
}
