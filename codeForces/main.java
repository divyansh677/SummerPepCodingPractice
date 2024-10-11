// package codeForces;

// import java.util.Scanner;

// public class main {
//     private static int n;
//     private static int[] relaxationCoefficients;
//     private static int[][] dp;

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         n = scanner.nextInt();
//         relaxationCoefficients = new int[n];
//         for (int i = 0; i < n; i++) {
//             relaxationCoefficients[i] = scanner.nextInt();
//         }

//         dp = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 dp[i][j] = -1;
//             }
//         }

//         System.out.println(maxRelaxation(0, n - 1, 1));
//     }

//     private static int maxRelaxation(int left, int right, int multiplier) {
//         if (left > right) {
//             return 0;
//         }

//         if (dp[left][right] != -1) {
//             return dp[left][right];
//         }

  
//         int pickLeft = multiplier * relaxationCoefficients[left] + maxRelaxation(left + 1, right, multiplier + 1);
//         int pickRight = multiplier * relaxationCoefficients[right] + maxRelaxation(left, right - 1, multiplier + 1);
//         dp[left][right] = Math.max(pickLeft, pickRight);
//         return dp[left][right];
//     }
// } 
    



import java.util.Scanner;

public class Main {
    private static int n;
    private static long[] relaxationCoefficients;
    private static long[][] dp;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        relaxationCoefficients = new long[n];
        for (int i = 0; i < n; i++) {
            relaxationCoefficients[i] = scanner.nextInt();
        }

        dp = new long[n][n];

        for (int length = 1; length <= n; length++) {
            for (int left = 0; left + length <= n; left++) {
                int right = left + length - 1;
                int multiplier = n - (right - left);
                if (left == right) {
                    dp[left][right] = multiplier * relaxationCoefficients[left];
                } else {
                    dp[left][right] = Math.max(
                        multiplier * relaxationCoefficients[left] + dp[left + 1][right],
                        multiplier * relaxationCoefficients[right] + dp[left][right - 1]
                    );
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }
}
