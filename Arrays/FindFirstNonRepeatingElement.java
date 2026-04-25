// Find Non Repeatative Element
// arr = [4,5,1,2,0,4]
// Output : 5

import java.util.HashMap;

public class FindFirstNonRepeatingElement {

  public static void main(String[] args) {
    int[] arr = {4, 5, 1, 2, 0, 4};
    int output = findFirstNonRepeatingElement(arr);
    System.out.println("Output: " + output);
  }

  public static int findFirstNonRepeatingElement(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int output = 0;
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    for (int num : arr) {
      if (map.get(num) == 1) {
        output = num;
        break;
      }
    }

    return output;
  }
}
