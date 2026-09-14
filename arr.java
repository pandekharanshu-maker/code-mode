//Program to understand array in java
public class arr {
    public static void main(String[] args) {
        int[] age = { 18, 19, 20, 18, 19, 20, 18, 19, 20, 18, 19, 20 };
        int max = age[0], min = age[0];
        System.out.println("Accessing Array Members: " + age[0]);
        // Using for loop
        for (int i = 0; i <= age.length - 1; i++) {
            System.out.println(age[i]);
        }
        System.out.println("Successfully Printed Using for loop");
        // Finding the max and min of array
        for (int i = 0; i <= age.length - 1; i++) {
            if (age[i] < min) {
                min = age[i];
            } else if (age[i] > max) {
                max = age[i];
            }
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        // 2D Array
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix.length - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // Passing Arrays to Methods
        sum(age);
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}