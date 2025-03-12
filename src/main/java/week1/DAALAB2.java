package week1;

public class DAALAB2 {

        static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
            if (n == 0) {
                return;
            }

            // Move N-1 disks from 'from_rod' to 'aux_rod' using 'to_rod'
            towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);

            // Move the nth disk from 'from_rod' to 'to_rod'
            System.out.println("Disk " + n + " moved from " + from_rod + " to " + to_rod);

            // Move N-1 disks from 'aux_rod' to 'to_rod' using 'from_rod'
            towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
        }

        // Driver code
        public static void main(String args[]) {
            int N = 3;

            // A, B, and C are names of rods
            towerOfHanoi(N, 'A', 'C', 'B');

    }

}
