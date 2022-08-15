package org.example.kyu5;

public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int n = arr.length;
        return maxSubArraySum(arr, 0, n - 1);
    }

    static int maxCrossingSum(int arr[], int l, int m,
                              int h) {

        int sum = 0;
        int left_sum = 0;
        for (int i = m; i >= l; i--) {
            sum = sum + arr[i];
            if (sum > left_sum)
                left_sum = sum;
        }

        sum = 0;
        int right_sum = 0;
        for (int i = m + 1; i <= h; i++) {
            sum = sum + arr[i];
            if (sum > right_sum)
                right_sum = sum;
        }

        return Math.max(left_sum + right_sum,
                Math.max(left_sum, right_sum));
    }

    static int maxSubArraySum(int arr[], int l, int h)
    {
        if (l == h)
            return arr[l];

        int m = (l + h) / 2;

        return Math.max(
                Math.max(maxSubArraySum(arr, l, m),
                        maxSubArraySum(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h));
    }
}
