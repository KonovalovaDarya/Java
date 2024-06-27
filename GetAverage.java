import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;

        System.out.print("Enter starting number = ");
        m = scanner.nextInt();
        System.out.print("Enter the end of the range = ");
        n = scanner.nextInt();

        int sum = 0, sumEven = 0, j = 0;
        int i = m;

        while (i <= n) {
            sum = sum + i;
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                j++;
            }
            i++;
        }

        double average = (double) sum / (n - m + 1);
        System.out.printf("Average of the range [%d;%d] = %.2f", m, n, average);

        double averageEven = (double) sumEven / j;
        System.out.printf("%nAverage of the range [%d;%d] for even numbers = %.2f", m, n, averageEven);
    }
}
