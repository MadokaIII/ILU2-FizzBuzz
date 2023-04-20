package fizzbuzz;

public class FizzBuzz {

    public static final int[] cases = { 3, 5 };
    public static final String[] strings = { "Fizz", "Buzz" };

    public static String fizzbuzz(int number) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < cases.length; i++) {
            if (number % cases[i] == 0) str.append(strings[i]);
        }
        if (str.isEmpty()) str.append(number);
        return str.toString();
    }

}
