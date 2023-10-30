import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessorStream {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(16);
        numbers.add(9);
        numbers.add(25);
        numbers.add(36);

        System.out.println("Even numbers and their square roots:");
        numbers.stream()
                .sorted(Comparator.naturalOrder())
                .filter(number -> number % 2 == 0)
                .forEach(number -> {
                    double sqrt = Math.sqrt(number);
                    System.out.println("Number: " + number + ", Square Root: " + sqrt);
                });
    }
}
