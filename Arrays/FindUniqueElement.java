// Find Unique ELement
// arr = [1,2,1,2,3]
// Constainst: Do Not use HashMap;

public class FindUniqueElement {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 2, 3};
    FindUniqueElement(arr);
    // System.out.println(1^2^1^2^3);
  }

  public static void FindUniqueElement(int[] arr) {
    int j = 0;
    int output = 0;
    for (int i = 0; i < arr.length; i++) {

      output ^= arr[i];
    }
    System.out.println(output);
  }
}
