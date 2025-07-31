public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // You can change this to any number
        int reversed = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
