// Count Frequency
// arr = [1,2,2,3,1,2]
// OutPut :
//         1 → 2
//         2 → 3
//         3 → 1

import java.util.HashMap;

public class CountFrequency {

  public static void main(String[] args) {
    int[] arr = {1, 2, 2, 3, 1, 2};
    findCountFrequency(arr);
  }

  public static void findCountFrequency(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    System.out.println(map);
  }
}
