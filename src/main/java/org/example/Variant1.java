package org.example;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Variant1 {

    private static int B =1;

    // Integer10: Вивести останню цифру та середню цифру
    public int[] integerTask(int number) {
        int units = number % 10;
        int tens = (number / 10) % 10;
        return new int[]{units, tens};
    }

    // Boolean10: Перевірка чи одне з чисел непарне
    public boolean booleanTask(int A, int i) {
        return (A % 2 != 0 && B % 2 == 0) || (A % 2 == 0 && B % 2 != 0);
    }

    // If10: Змінити значення A і B за умовою
    public int[] ifTask(int A) {
        if (A != B) {
            A = B = A + B;
        } else {
            A = B = 0;
        }
        return new int[]{A, B};
    }

    // Case10: Робот і напрямок руху
    public String caseTask(char direction, int command) {
        switch (command) {
            case 0: return String.valueOf(direction);
            case 1: return switch (direction) {
                case 'С' -> "З";
                case 'З' -> "Ю";
                case 'Ю' -> "С";
                case ' ' -> "Схід";
                default -> throw new IllegalArgumentException("Неправильна команда");
            };
            case -1: return switch (direction) {
                case 'С' -> "Схід";
                case 'З' -> "С";
                case 'Ю' -> "З";
                case ' ' -> "Ю";
                default -> throw new IllegalArgumentException("Неправильна команда");
            };
            default: throw new IllegalArgumentException("Неправильна команда");
        }
    }

    // For10: Знайти суму ряду
    public double forTask(int N) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // While10: Знайти найбільше ціле K
    public int whileTask(int N) {
        int K = 0;
        while (Math.pow(3, K) < N) {
            K++;
        }
        return K - 1;
    }

    // Array10: Парні та непарні числа масиву
    public int[] arrayTask(double[] array) {
        // Перетворення double[] на int[] для парності
        int[] intArray = Arrays.stream(array).mapToInt(x -> (int) x).toArray();

        // Розділення парних і непарних чисел
        return IntStream.concat(
                Arrays.stream(intArray).filter(x -> x % 2 == 0),             // Парні числа
                Arrays.stream(intArray).filter(x -> x % 2 != 0).map(x -> -x) // Непарні числа як від'ємні
        ).toArray();
    }

    // Matrix10: Виведення елементів у стовпцях з непарними номерами
    public int[] matrixTask(int[][] matrix) {
        return null;
    }

    public short inputOutputTask(int p1) {
        return 0;
    }

    public short switchTask(int p1, int i) {
        return 0;
    }

    public void integerNumbersTask(int i) {

    }

    public Object[] twoDimensionArrayTask(int[][] input, int from, int to) {
        return new int[][]{new int[]{0}};
    }
}

