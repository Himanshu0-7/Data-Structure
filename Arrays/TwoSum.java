// Two Sum
// arr = [2, 3, 4, 7, 11, 15]
// target = 9
//
// Output: indices (1, 3) OR values (2,7)
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 7, 11, 15};
    int target = 9;
    findTwoSum(arr, target);
  }

  public static void findTwoSum(int[] arr, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i <= arr.length - 1; i++) {
      int needed = target - arr[i];
      if (map.containsKey(needed)) {
        System.out.println("Two Sum Value is " + map.get(needed) + " , " + i);
        return;
      }
      map.put(arr[i], i);
    }
  }
}
