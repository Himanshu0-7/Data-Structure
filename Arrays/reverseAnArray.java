// Reverse the array
// arr = [1, 2, 3, 4, 5]
// Output: [5, 4, 3, 2, 1]

public class reverseAnArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    reversedArray(arr);
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void reversedArray(int[] arr) {
    int temp;
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
