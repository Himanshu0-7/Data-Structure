// Prefix Sum
// arr = [2,1,3]
// k = 3

import java.util.HashMap;

public class prefixSum {

  public static void main(String[] args) {
    int[] arr = {1, 0, 1};
    int k = 1;
    findPrefixSum(arr, k);
  }

  public static void findPrefixSum(int[] arr, int k) {
    int sum = 0;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int right = 0; right < arr.length; right++) {
      sum += arr[right];
      if (map.containsKey(sum - k)) {
        count += map.get(sum - k);
      }
      map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    System.out.println("Prefix Sum Count is :" + count);
  }
}
