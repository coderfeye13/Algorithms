/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

class QuickSort {
    public static int[] quickSort(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int[] numbers = new int[7];
        int a = 0;
        while (scanner.hasNextLine()) {
            numbers[a] = scanner.nextInt();
            a++;
        }
        int elements;
        int[] QuickSort;() {
                if(elements < 2){     //Base Case
                    return numbers;
                }

                int current_position=0;   //position of pivot element
                int temp; //a temporary variable to assist in swapping

                for(int i=1; i<elements; i++) //Partitioning loop
                {
                    if(numbers[i] <= numbers[0])
                    {
                        current_position++;
                        temp = numbers[i];
                        numbers[i] = numbers[current_position];
                        numbers[current_position] = temp;

                    }
                }

                temp = numbers[0];
                numbers[0] = numbers[current_position];
                numbers[current_position] = temp;

                int[] left = QuickSort(numbers,current_position);

                int[] arr2 = Arrays.copyOfRange(numbers, current_position+1, elements);

                int[] right = QuickSort(arr2, elements-current_position-1);

                numbers = new int[elements];

                for(int i=0; i<current_position; i++)
                {
                    numbers[i] = left[i];
                }
                numbers[current_position] = numbers[current_position];
                for(int i=current_position+1; i<elements; i++)
                {
                    numbers[i] = right[i-current_position-1];
                }

                return numbers;

            }
        }

    private static int[] QuickSort(int[] arr2, int i) {
        return arr2;
    }

*/