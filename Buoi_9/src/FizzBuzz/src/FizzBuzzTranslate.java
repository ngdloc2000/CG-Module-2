package FizzBuzz.src;

public class FizzBuzzTranslate {

    public static String translate(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(num);
        }
    }

    public static void main(String[] args) {
        System.out.println(FizzBuzzTranslate.translate(14));
    }
}
