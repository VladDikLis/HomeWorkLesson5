package ru.otus.java.basic.lesson5hw;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Это домашнее задание для урока 5. Список доступных команд:");
        System.out.println("1 - replayString. Печать строки n-раз");
        System.out.println("2 - massSum5. Вывести сумму элементов массива (Тех, что больше пяти)");
        System.out.println("3 - massReplaceInt. Заполнить каждую ячейку массива числом");
        System.out.println("4 - massSumInt. Прибавить ко всем элементам массива число");
        System.out.println("5 - sumHalf. Указать, какая из половин массива больше по сумме");
        System.out.println("6 - sumMassDifferent. Сложить разные по размеру массивы");
        System.out.println("7 - sumLeftRight. Проверка одинаковой суммы по сторонам от точки");
        System.out.println("8 - massSortCheck. Проверка сортированности массива");
        System.out.println("9 - massReverse. Переворачиваем массив");
        System.out.println();
        System.out.println("Введите номер комманды:");
        int me = scanner.nextInt();
        scanner.nextLine();

        if (me == 1) {
            System.out.println("Выбран метод replayString.");
            System.out.println("Введите строку:");
            String a = scanner.nextLine();
            System.out.println("Введите количество повторений:");
            int b = scanner.nextInt();
            replayString(a, b);
        }

        if (me == 2) {
            System.out.println("Выбран метод massSum5.");
            massSum5();
        }

        if (me == 3) {
            System.out.println("Выбран метод massReplaceInt.");
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(arr));
            int a = (int) (Math.random() * 10);
            System.out.println("Исходное число для замены: " + a);
            massReplaceInt(arr, a);
        }

        if (me == 4) {
            System.out.println("Выбран метод massSumInt.");
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(arr));
            int a = (int) (Math.random() * 10);
            System.out.println("Исходное число для сложения: " + a);
            massSumInt(arr, a);
        }

        if (me == 5) {
            System.out.println("Выбран метод sumHalf.");
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(arr));
            sumHalf(arr);
        }

        if (me == 6) {
            System.out.println("Выбран метод sumMassDifferent.");
            int[] arr1 = new int[2];
            for (int i = 0; i < 2; i++) {
                arr1[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив 1: ");
            System.out.println(Arrays.toString(arr1));
            int[] arr2 = new int[6];
            for (int i = 0; i < 6; i++) {
                arr2[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив 2: ");
            System.out.println(Arrays.toString(arr2));
            int[] arr3 = new int[4];
            for (int i = 0; i < 4; i++) {
                arr3[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив 3: ");
            System.out.println(Arrays.toString(arr3));
            sumMassDifferent(arr1, arr2, arr3);
        }

        if (me == 7) {
            System.out.println("Выбран метод sumLeftRight.");
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = 1;  //(int) (Math.random() * 10); // Рандом отключен, сложно поймать ситуацию
            }
            System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(arr));
            sumLeftRight(arr);
        }

        if (me == 8) {
            System.out.println("Выбран метод massSortCheck.");
            System.out.println("Выберите вариант проверки: 1 - В порядке возрастания?  2 - В порядке убывания?");
            int a = scanner.nextInt();
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(arr));
            massSortCheck(arr, a);
        }

        if (me == 9) {
            System.out.println("Выбран метод massReverse.");
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = (int) (Math.random() * 10);
            }
            System.out.print("Исходный массив: ");
            System.out.println(Arrays.toString(arr));
            massReverse(arr);
        }
    }

    public static void replayString(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void massSum5() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] > 5) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Сумма элементов, значение которых больше чем 5, равняется " + sum);
    }

    public static void massReplaceInt(int[] arr, int a) {
        for (int i = 0; i < 10; i++) {
            arr[i] = a;
        }
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void massSumInt(int[] arr, int a) {
        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] + a;
        }
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void sumHalf(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            sum1 = sum1 + arr[i];
        }
        for (int i = 5; i < 10; i++) {
            sum2 = sum2 + arr[i];
        }
        if (sum1 > sum2) {
            System.out.print("Первая половина больше");
        }
        if (sum1 < sum2) {
            System.out.print("Вторая половина больше");
        }
        if (sum1 == sum2) {
            System.out.print("Половины массива равны по сумме");
        }
    }

    public static void sumMassDifferent(int[] arr1, int[] arr2, int[] arr3) {
        int Larr1 = arr1.length;
        int Larr2 = arr2.length;
        int Larr3 = arr3.length;
        int max = 0;
        int x = 0;
        max = Math.max(Larr1, Larr2);
        if (Larr3 > max) {
            max = Larr3;     // Нашли самый длинный массив, работаем от него.
        }
        int[] arr4 = new int[max];   // Создаём новый массив нужной длинны, куда бросаем результат
        for (int i = 0; i < max; i++) {
            x = 0;
            if (i < Larr1) {      // Если мы ещё не вышли за диапазон массива, складываем результат
                x = x + arr1[i];
            }
            if (i < Larr2) {
                x = x + arr2[i];
            }
            if (i < Larr3) {
                x = x + arr3[i];
            }
            arr4[i] = x;
        }
        System.out.print("Сумма массивов: ");
        System.out.println(Arrays.toString(arr4));
    }

    public static void sumLeftRight(int[] arr) {
        System.out.print("Итоговый массив: [ ");
        int z = 0;   // Метка статуса
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            int x = 0;   // Сумма первой части
            int y = 0;   // Сумма второй части
            for (int j = 0; j < i + 1; j++) {
                x = x + arr[j];
            }
            for (int k = i + 1; k < 10; k++) {
                y = y + arr[k];
            }
            if (x == y) {
                System.out.print(" |  ");
                z = 1;
            }
        }
        System.out.println("]");
        if (z == 0) {
            System.out.print("Точка не найдена");
        }
    }

    public static void massSortCheck(int[] arr, int a) {
        if (a == 1) {
            for (int i = 1; i < 3; i++) {
                if (arr[i] < arr[i - 1]) {
                    System.out.print("Ряд расположен не в порядке возрастания");
                    System.exit(0);
                }
            }
        }
        if (a == 2) {
            for (int i = 1; i < 3; i++) {
                if (arr[i] > arr[i - 1]) {
                    System.out.print("Ряд расположен не в порядке убывания");
                    System.exit(0);
                }
            }
        }
        if (a == 1) {
            System.out.print("Ряд расположен в порядке возрастания");
        }
        if (a == 2) {
            System.out.print("Ряд расположен в порядке убывания");
        }
    }

    public static void massReverse(int[] arr) {
        int Larr = arr.length;
        int[] arrN = new int[Larr];
        Larr = Larr - 1;
        for (int i = 0; i < 5; i++) {
            arrN[i] = arr[Larr - i];
        }
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(arrN));
    }
}