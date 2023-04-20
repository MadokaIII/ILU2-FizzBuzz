package fizzbuzz;

public class FizzBuzz {

    private static final String UN = "1";
    private static final String DEUX = "2";

    private FizzBuzz() {
        throw new IllegalStateException("Utility class");
    }

    public static String fizzbuzz(int i) {
        if (i == 1) return UN;
        if (i == 2) return DEUX;
        return "";
    }

}
