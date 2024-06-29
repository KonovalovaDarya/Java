public class LoopFor {
    public static void main(String[] args) {
        System.out.print("Numbers from [1;100] multiply of 4: ");

        for (int i = 100; i >= 1; i--) {
            if (multiplyOfFour(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean multiplyOfFour(int x) {
        return x % 4 == 0;
    }
}