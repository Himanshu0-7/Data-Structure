// find the Maximum Element
// arr = [3, 7, 2, 9, 5]
// Output: 9

public class Maximum_Element {
  public static void main(String[] args) {
    int[] arr = {3, 7, 2, 9, 5};
    int maximumElement = findMaxElement(arr);
    System.out.println("Maximum ELement:" + maximumElement);
  }

  public static int findMaxElement(int[] arr) {
    int max = arr[0];
    for (int i = 0; i <= arr.length - 1; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}
