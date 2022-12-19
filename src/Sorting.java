/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sorting {

    public static int[] bubbleSort(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int[] numbers = new int[800000];
        int a = 0;
        while (scanner.hasNextLine()) {
            numbers[a] = scanner.nextInt();
            a++;
        }
        for (int i = 0; i < numbers.length - 1; ++i) {

            for (int j = 0; j < numbers.length - i - 1; ++j) {

                if (numbers[j + 1] < numbers[j]) {

                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;

                }
            }
        }
        return numbers;
    }
}*/