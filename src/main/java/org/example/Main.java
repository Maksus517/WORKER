package org.example;

import org.example.model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество работников: ");
        int n = scanner.nextInt();

        List<Worker> workers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();

            System.out.println("\nРаботник " + (i + 1));

            System.out.print("Фамилия и инициалы: ");
            String name = scanner.nextLine();

            System.out.print("Должность: ");
            String pos = scanner.nextLine();

            System.out.print("Зарплата: ");
            double sal = scanner.nextDouble();

            System.out.print("Год поступления на работу: ");
            int year = scanner.nextInt();

            workers.add(new Worker(name, pos, sal, year));
        }

        System.out.print("\nВведите минимальный стаж работы (лет): ");
        int minExperience = scanner.nextInt();

        int currentYear = 2026;
        boolean found = false;

        System.out.println("\nРаботники со стажем более " + minExperience + " лет:");
        for (Worker w : workers) {
            if (w.getExperience(currentYear) > minExperience) {
                System.out.println(w.getFullName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Работников со стажем более " + minExperience + " лет не найдено.");
        }

        scanner.close();
    }
}
