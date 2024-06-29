import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = Math.abs(scanner.nextInt());
        int sum = 0, sumOdd = 0, max = 0;

        do {
            int n = x % 10;

            sum = sum + n; // сумма всех цифр

            if (n % 2 != 0 ) {
                sumOdd = sumOdd + n;  // сумма нечетных
            }

            if (n > max) {
                max = n; // поиск максимального
            }

            x = x / 10;

        } while (x > 0);

        System.out.println("Summ of numbers = " + sum);
        System.out.println("Summ of odd numbers = " + sumOdd);
        System.out.println("Max number = " + max);
    }
}
