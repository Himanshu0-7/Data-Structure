// Kadane's Algorithm
// arr = [-2, 1, -3, 4]
// Output = 4 index at 3

public class Kadane_Algorithm {

  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4};
    FindMaximumPossibleSum(arr);
  }

  public static void FindMaximumPossibleSum(int[] arr) {
    int currentSum = arr[0];
    int MaxSum = arr[0];

    for (int i = 0; i < arr.length; i++) {
      currentSum = Math.max(arr[i], currentSum + arr[i]);
      MaxSum = Math.max(MaxSum, currentSum);
    }
    System.out.println(MaxSum);
  }
}
