import java.util.ArrayList;
import java.util.Collections;

public class NumberProcessor {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(16);
        numbers.add(9);
        numbers.add(25);
        numbers.add(36);

        // Sorting the ArrayList
        Collections.sort(numbers);

        System.out.println("Even numbers and their square roots:");
        for (Integer number : numbers) {
            double sqrt = Math.sqrt(number);
            if (number % 2 == 0) {
                System.out.println("Number: " + number + ", Square Root: " + sqrt);
            }
        }
    }
}
