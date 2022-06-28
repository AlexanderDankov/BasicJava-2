package com.simbirsoft;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Создадим массив из 5 целых чисел");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите " + (i + 1) + " число:");
            int number = scanner.nextInt();
            numbers[i] = number;
        }

        System.out.println("Созданный массив:" + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Отсортированный в порядке возрастания: " + Arrays.toString(numbers));

        int[] minNumbers = Arrays.copyOf(numbers,2);
        System.out.println("2 минимальных числа из массива: "  + Arrays.toString(minNumbers));

        int[] maxNumbers = Arrays.copyOfRange(numbers, 3, numbers.length);
        System.out.println("2 максимальных числа из массива: "  + Arrays.toString(maxNumbers));
    }
}
