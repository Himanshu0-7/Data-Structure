// longest Contiguous SubArray
// arr = [1,2,3,1,1,1,1]
// k = 3

public class longestContiguousSubArray {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1, 1, 1, 1};
    int k = 3;
    findLongestContinousSubArray(arr, k);
  }

  public static void findLongestContinousSubArray(int[] arr, int k) {
    int sum = 0;
    int left = 0;
    int maxLen = 0;
    for (int right = 0; right < arr.length; right++) {
      sum += arr[right];
      while (sum > k) {
        sum -= arr[left];
        left++;
      }
      if (sum == k) {
        maxLen = Math.max(maxLen, right - left + 1);
      }
    }
    System.out.println("longest Contiguous SubArray is : " + maxLen);
  }
}
