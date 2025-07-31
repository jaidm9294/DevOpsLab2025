public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int[] testCases = {121, -121, 12321, 123, 0};
        for (int num : testCases) {
            System.out.printf("Is %d a palindrome? %b%n", num, isPalindrome(num));
        }
    }
}
