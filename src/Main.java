import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File ("/Users/furkanyilmaz/Desktop/Bionluk/src/database.txt");
        int [] numbers = MergeSort.mergeSort(file);
        for (int item : numbers) {
            System.out.print(item + ",");
        }

    }

}
