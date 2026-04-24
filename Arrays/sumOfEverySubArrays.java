// Find sum of every subarray of size k
//
// arr = [2,1,5,1,3,2]
// k = 3
//
// Output: [8,7,9,6]

public class sumOfEverySubArrays {

  public static void main(String[] args) {
    int[] arr = {2, 1, 5, 1, 3, 2};
    int k = 3;
    findSumOfEverySubArray(arr, k);
  }

  public static void findSumOfEverySubArray(int[] arr, int k) {
    int sum = 0;
    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    System.out.print("[");
    System.out.print(sum);
    for (int i = k; i < arr.length; i++) {

      sum = sum - arr[i - k] + arr[i];
      System.out.print(", " + sum);
    }
    System.out.print("]");
  }
}
