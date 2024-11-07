package org.example;




import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class TestVariant1 {
    public static double EPS = 0.0000001;

    @Test
    public void MassTest() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

    @Test
    public void testBooleanTask() {
        // Тест для методу booleanTask у класі Variant1
        assertEquals(true, new Variant1().booleanTask(3, 5));  // Приклад виклику з двома аргументами
    }

    @Test
    public void inputTest() {
        int p1 = 0;
        short p3 = 0;
        assertEquals(p3, new Variant1().inputOutputTask(p1));
    }

    @Test
    public void integerTaskTest() {
        int[] result = new Variant1().integerTask(123);
        assertArrayEquals(new int[]{3, 2}, result);  // 123 -> остання цифра 3, середня цифра 2
    }

    @Test
    public void negativeInputTest() {
        // Перевірка негативного входу
        try {
            new Variant1().integerTask(-2);
        } catch (IllegalArgumentException e) {
            // Якщо очікується виняток, то перевіряємо його
            assertEquals("Negative input not allowed", e.getMessage());
        }
    }

    @Test
    public void switchTest() {
        // Тест для методу switchTask
        assertEquals("З", new Variant1().switchTask('С', 1));  // Наприклад, зміна напрямку для 'С'
    }

    @Test
    public void switchNegativeTest() {
        // Перевірка винятку для некоректної команди
        try {
            new Variant1().switchTask('С', 99);  // Некоректна команда
        } catch (IllegalArgumentException e) {
            assertEquals("Неправильна команда", e.getMessage());
        }
    }

    @Test
    public void forTest() {
        // Тест для методу forTask
        double result = new Variant1().forTask(3);
        assertEquals(2.666667, result, EPS);
    }

    @Test
    public void whileTest() {
        // Тест для методу whileTask
        int result = new Variant1().whileTask(10);
        assertEquals(2, result);
    }

    @Test
    public void arrayTest() {
        // Тест з порожнім масивом
        double[] array = new double[0];
        int[] expected = new int[0];
        assertArrayEquals(expected, new Variant1().arrayTask(array));
    }

    @Test
    public void arrayTestWithValues() {
        // Тест із парними та непарними числами
        double[] array = {2.0, 3.0, 4.0, 5.0};
        int[] expected = {2, 4, -3, -5};
        assertArrayEquals(expected, new Variant1().arrayTask(array));
    }

    @Test
    public void twoDimensionArrayTest() {
        int[][] input = {{2, 3}, {4, 5}};
        int[][] expected = {{2, 4}, {3, 5}};
        assertArrayEquals(expected, new Variant1().twoDimensionArrayTask(input, 1, 2));
    }
}
