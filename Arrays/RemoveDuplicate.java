// Remove Duplicate
// arr = [1,1,2,2,3,3,3]
// Output: 3 (array becomes [1,2,3,...])

public class RemoveDuplicate {
  public static void main(String[] args) {
    int[] arr = {1, 1, 2, 2, 3, 3, 3};
    int result = removeDuplicate(arr);
    System.out.println(result);
  }

  public static int removeDuplicate(int[] arr) {
    int j = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[j] != arr[i]) {
        j++;
        arr[j] = arr[i];
      }
    }
    return j + 1;
  }
}
