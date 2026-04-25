// Find element that appears only once
// arr = [1,2,2,3,3,4,4]
// 1 → 1 time
// 2 → 2 times
// 3 → 2 times
// 4 → 2 times

import java.util.HashMap;

public class FindElementAppearsOnce {
  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 3, 4, 4, 5};
    FindElementAppearOnce(arr);
  }

  public static void FindElementAppearOnce(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    System.out.print("Output : [");

    for (int i : arr) {
      if (map.get(i) == 1) {

        System.out.print(i + ",");
      }
    }
    System.out.print("]");
  }
}
