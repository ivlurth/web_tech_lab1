package com.company;

import java.util.Scanner;
import Task.*;

public class Main {
    public static void main(String[] args) {
	    System.out.print("Введите номер задания: ");
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();

	    switch (num)
		{
			case 1: { Task.task1(); } break;
			case 2: { Task.task2(); } break;
			case 3: { Task.task3(); } break;
			case 4: { Task.task4(); } break;
			case 5: { Task.task5(); } break;
			case 6: { Task.task6(); } break;
			case 7: { Task.task7(); } break;
			case 8: { Task.task8(); } break;
			case 9: { Task.task9(); } break;
			case 10: { Task.task10(); } break;
			case 11: { Task.task11(); } break;
			case 12: { Task.task12(); } break;
			case 13: { Task.task13(); } break;
			case 14: { Task.task14(); } break;
			case 15: { Task.task15(); } break;
			case 16: { Task.task16(); } break;
		}

		String t = in.next();
    }
}

