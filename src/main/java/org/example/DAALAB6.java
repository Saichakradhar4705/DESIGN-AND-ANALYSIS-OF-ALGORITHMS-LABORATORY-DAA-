package org.example;
import java.util.Random;
import java.util.Arrays;

public class DAALAB6 {
        // A function to randomly select k items from stream[0..n-1]
        static void selectKItems(int stream[], int n, int k) {
            int reservoir[] = new int[k];
            Random rand = new Random();

            // Copy first k items to reservoir
            for (int i = 0; i < k; i++) {
                reservoir[i] = stream[i];
            }

            // Process remaining items
            for (int i = k; i < n; i++) {
                int j = rand.nextInt(i + 1);
                if (j < k) {
                    reservoir[j] = stream[i];
                }
            }

            System.out.println("Following are k randomly selected items");
            System.out.println(Arrays.toString(reservoir));
        }

        // Driver Program to test above method
        public static void main(String[] args) {
            int stream[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            int n = stream.length;
            int k = 5;
            selectKItems(stream, n, k);
        }
}
