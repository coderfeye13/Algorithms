/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SelectionSort {
    public static int[] selectionSort(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int[] numbers = new int[900000];
        int a = 0;
        while (scanner.hasNextLine()) {
            numbers[a] = scanner.nextInt();
            a++;
        }
        int min, minIndex, temp;

        for(int start = 0; start < numbers.length - 1; start++){

            min = numbers[start];
            minIndex = start;
            for(int i = start + 1; i < numbers.length; i++){
                if(numbers[i] < min){
                    min = numbers[i];
                    minIndex = i;
                }
            }
            temp = min;
            numbers[minIndex] = numbers[start];
            numbers[start] = temp;
        }
        return numbers;
    }
}*/