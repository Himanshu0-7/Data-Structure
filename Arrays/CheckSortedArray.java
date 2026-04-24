// Check Sorted Array
// arr = [1, 2, 3, 4, 5] → true
// arr = [1, 3, 2, 4] → false

public class CheckSortedArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    boolean check = SortingValidation(arr);
    System.out.println(check);
  }

  public static boolean SortingValidation(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
