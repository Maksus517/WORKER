package org.example;

import org.example.model.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = getIntInput(scanner, "Введите количество работников: ");

        List<Worker> workers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nРаботник " + (i + 1));

            System.out.print("Фамилия и инициалы: ");
            String name = scanner.nextLine();

            System.out.print("Должность: ");
            String pos = scanner.nextLine();

            double sal = getDoubleInput(scanner, "Зарплата: ");
            int year = getIntInput(scanner, "Год поступления на работу: ");

            workers.add(new Worker(name, pos, sal, year));
        }

        int minExperience = getIntInput(scanner, "\nВведите минимальный стаж работы (лет): ");

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

    private static int getIntInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число.");
            }
        }
    }

    private static double getDoubleInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input.replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }
}