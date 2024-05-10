package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index].length);
        }
    }
}
