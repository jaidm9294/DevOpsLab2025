public class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int original = number;
        int result = 0;
        int n = String.valueOf(number).length(); // Count of digits

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        return result == original;
    }

    public static void main(String[] args) {
        int[] testCases = {153, 9474, 370, 9475, 407};
        for (int num : testCases) {
            System.out.printf("Is %d an Armstrong number? %b%n", num, isArmstrong(num));
        }
    }
}
