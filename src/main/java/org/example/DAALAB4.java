package org.example;
import java.util.Random;

public class DAALAB4 {


        public static void shuffle(int card[], int n) {
            Random rand = new Random();

            for (int i = 0; i < n; i++) {
                int j = i + rand.nextInt(n - i);
                int temp = card[i];
                card[i] = card[j];
                card[j] = temp;
            }
        }

        // Driver code
        public static void main(String[] args) {
            // Array from 0 to 51
            int a[] = new int[52];
            for (int i = 0; i < 52; i++) {
                a[i] = i;
            }

            shuffle(a, 52);

            // Printing all shuffled elements of cards
            for (int i = 0; i < 52; i++) {
                System.out.print(a[i] + " ");
            }
        }

}
