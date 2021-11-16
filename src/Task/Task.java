package Task;

import Data.*;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.round;

public class Task {
    public static void task1()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = in.nextDouble();
        System.out.print("Введите число y: ");
        double y = in.nextDouble();

        System.out.println("Результат: " + Data1.f(x, y));
    }

    public static void task2()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату x: ");
        double x = in.nextDouble();
        System.out.print("Введите координату y: ");
        double y = in.nextDouble();

        boolean isInside = false;
        if (((x >= Data2.rect1.x1) && (x <= Data2.rect1.x2) && (y <= Data2.rect1.y1) && (y >= Data2.rect1.y2)) ||
            ((x >= Data2.rect2.x1) && (x <= Data2.rect2.x2) && (y <= Data2.rect2.y1) && (y >= Data2.rect2.y2))) {
            isInside = true;
        }
        System.out.println("Результат: " + isInside);
    }

    public static void task3()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = in.nextDouble();
        System.out.print("Введите значение b: ");
        double b = in.nextDouble();
        System.out.print("Введите шаг h: ");
        double h = in.nextDouble();

        for (double i = a; i <= b; i += h) {
            System.out.println(i + " " + Data3.f(i));
        }
    }

    public static void task4()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int number = array[i];
            boolean isPrime = true;
            if (number <= 1) isPrime = false;
            for (int j = 2; (j <= Math.sqrt(number)) && (isPrime); j++) {
                if (number % j == 0) isPrime = false;
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task5()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int maxCount = 0;
        int[] count = new int[N];
        count[0] = 1;
        for (int i = 1; i < N; i++) {
            int localMax = -1;
            int maxInd = 0;
            for (int j = 0; j < i; j++) {
                if ((array[i] > array[j]) && (array[j] > localMax)) {
                    maxInd = j;
                    localMax = array[j];
                }
            }
            if (localMax != -1)
            count[i] = count[maxInd] + 1; else
                count[i] = 1;
            if (count[i] > maxCount) maxCount = count[i];
        }
        System.out.println("Результат: " + maxCount);
    }

    public static void task6()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = array[(i + j) % N];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task7()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов массива: ");

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int i = 0;
        while (i < N - 1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        for (int j = 0; j < N; j++) {
            System.out.print(array[j] + " ");
        }
    }

    public static void task8()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int N = in.nextInt();
        System.out.print("Введите " + N + " элементов первого массива: ");

        int[] array1 = new int[N];
        for (int i = 0; i < N; i++) {
            array1[i] = in.nextInt();
        }

        System.out.print("Введите " + N + " элементов второго массива: ");
        int[] array2 = new int[N];
        for (int i = 0; i < N; i++) {
            array2[i] = in.nextInt();
        }

        int[] index = new int[N];

        int i = 0;
        int j = 0;
        while (j < N)
        {
            if (i < N) {
                if (array1[i] < array2[j]) {
                    i++;
                } else
                {
                    index[j] = i;
                    j++;
                }
            } else
            {
                index[j] = i;
                j++;
            }
        }

        for (int k = 0; k < N; k++) {
            System.out.print(index[k] + " ");
        }
    }

    public static void task9()
    {
        Basket basket = new Basket();
        basket.add(new Ball("blue", 0.5));
        basket.add(new Ball("red", 0.7));
        basket.add(new Ball("white", 1.0));
        basket.add(new Ball("blue", 0.2));
        System.out.println("Синих шаров в корзине: " + basket.countOf("blue"));
        System.out.println("Общий вес шаров: " + round(basket.sumWeight() * 100) / 100.0);
    }

    public static void task10()
    {
        System.out.println("Сделано");
    }

    public static void task11()
    {
        System.out.println("Jar всего проекта находится по адресу web1_1\\out\\artifacts\\web1_1_jar\\web1_1.jar");
    }

    public static void task12()
    {
        Book book1 = new Book("abc", "cba", 1, 2);
        Book book2 = new Book("xyz", "qwer", 4, 6);
        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
    }

    public static void task13()
    {
        ProgrammerBook book1 = new ProgrammerBook("abc", "cba", 1, 2, "English", 3);
        ProgrammerBook book2 = new ProgrammerBook("abc", "cba", 1, 2, "English", 3);
        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("book1.equals(book2) = " + book1.equals(book2));
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
    }

    public static void task14()
    {
        Book book1 = new Book("abc", "cba", 1, 2);
        Book clone = book1.clone();
        System.out.println("book1: " + book1.toString());
        System.out.println("clone: " + clone.toString());
    }

    public static void task15()
    {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book(); book1.isbn = 13;
        Book book2 = new Book(); book2.isbn = 15;
        Book book3 = new Book(); book3.isbn = 9;
        Book book4 = new Book(); book4.isbn = 20;
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.sort(Book::compareTo);
        System.out.println("isbn: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.print(books.get(i).isbn + " ");
        }
    }

    public static void task16()
    {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("abc", "rtt16", 12, 3);
        Book book2 = new Book("xys", "bcd", 13, 7);
        Book book3 = new Book("abc", "bcd", 12, 2);
        Book book4 = new Book("aaa", "qwe", 14, 16);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println("По названию: ");
        books.sort(Book::compareTitle);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        System.out.println("По названию, автору: ");
        books.sort(Book::compareTitleAuthor);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        System.out.println("По автору, названию: ");
        books.sort(Book::compareAuthorTitle);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }

        System.out.println("По автору, названию, цене: ");
        books.sort(Book::compareAuthorTitlePrice);
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString() + " ");
        }
    }
}
