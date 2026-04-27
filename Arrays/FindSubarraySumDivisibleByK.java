// Problem: Subarray Sum Divisible by K
// arr = [4,5,0,-2,-3,1]
// k = 5
//
// Output: 7

import java.util.HashMap;

public class FindSubarraySumDivisibleByK {
  public static void main(String[] args) {
    int[] arr = {4, 5, 0, -2, -3, 1};
    int k = 5;
    int output = findSubarraySumIsDivisiblebyK(arr, k);
    System.out.println("Output : " + output);
  }

  public static int findSubarraySumIsDivisiblebyK(int[] arr, int k) {
    int sum = 0;
    int count = 0;
    int rem = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    for (int num : arr) {
      sum += num;

      rem = sum % k;

      if (rem < 0) {
        rem += k;
      }

      if (map.containsKey(rem)) {
        count += map.get(rem);
      }

      map.put(rem, map.getOrDefault(rem, 0) + 1);
    }
    return count;
  }
}
