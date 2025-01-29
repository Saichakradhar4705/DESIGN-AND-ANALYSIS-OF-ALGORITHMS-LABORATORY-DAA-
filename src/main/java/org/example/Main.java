package org.example;

import java.util.*;

class DAALAB1 {
    public static int findLargest(List<Integer> numbers) {
        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        int first = numbers.get(0);
        int largest = findLargest(numbers.subList(1, numbers.size()));
        return Math.max(first, largest);
    }

    public static int findSecondLargest(List<Integer> numbers) {
        int largest = findLargest(numbers);
        List<Integer> filteredNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num != largest) {
                filteredNumbers.add(num);
            }
        }
        return findLargest(filteredNumbers);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int secondLargest = findSecondLargest(numbers);
        System.out.println(secondLargest);
    }
}
