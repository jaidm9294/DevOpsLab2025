public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9875; // Change this number to test different values
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
