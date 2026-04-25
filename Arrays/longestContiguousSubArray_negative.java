// Longest Continous SubArray with negative number equals to k
// arr = [1, -1, 5, -2, 3]
// k = 3
//
// Output: 4

import java.util.HashMap;

public class longestContiguousSubArray_negative {
  public static void main(String[] args) {
    int[] arr = {1, -1, 5, -2, 3};
    int k = 3;
    int maxLen = findLongestContiguousSubArray_negative(arr, k);
    System.out.println(maxLen);
  }

  public static int findLongestContiguousSubArray_negative(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int sum = 0;
    int maxLen = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == k) {
        maxLen = i + 1;
      }
      if (map.containsKey(sum - k)) {
        int len = i - map.get(sum - k);
        maxLen = Math.max(maxLen, len);
      }
      if (!map.containsKey(sum)) {
        map.put(sum, i);
      }
    }
    return maxLen;
  }
}
