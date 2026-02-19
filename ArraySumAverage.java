import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display result
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        sc.close();
    }
}
