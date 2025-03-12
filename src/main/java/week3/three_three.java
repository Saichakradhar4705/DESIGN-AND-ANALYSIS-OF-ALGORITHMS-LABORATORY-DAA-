package week3;

public class three_three {
    static long karatsuba(long X, long Y) {
        // Base Case
        if (X < 10 || Y < 10) {
            return X * Y;
        }

        // Calculate the size of the numbers
        int size = Math.max(get_size(X), get_size(Y));
        int n = (size / 2) + (size % 2);

        // Split the numbers
        long m = (long) Math.pow(10, n);
        long X1 = X / m;
        long X2 = X % m;
        long Y1 = Y / m;
        long Y2 = Y % m;

        long U = karatsuba(X1, Y1);
        long V = karatsuba(X2, Y2);
        long W = karatsuba(X1 + X2, Y1 + Y2);

        // Combine the results
        return (long) (U * Math.pow(10, 2 * n) + (W - U - V) * Math.pow(10, n) + V);
    }

    static int get_size(long value) {
        int size = 0;
        while (value != 0) {
            size++;
            value /= 10;
        }
        return size;
    }

    public static void main(String[] args) {
        // Two numbers
        long x = 145623;
        long y = 653324;
        System.out.print("The final product is: ");
        long product = karatsuba(x, y);
        System.out.println(product);
    }
}