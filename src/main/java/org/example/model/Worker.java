package org.example.model;

public class Worker {

    private String fullName;
    private String position;
    private double salary;
    private int yearOfHire;

    // Конструктор по умолчанию
    public Worker() {
        this.fullName = "Неизвестно";
        this.position = "Не указана";
        this.salary = 0.0;
        this.yearOfHire = 2020;
    }

    // Конструктор с параметрами
    public Worker(String fullName, String position, double salary, int yearOfHire) {
        this.fullName = fullName;
        this.position = position;
        this.salary = salary;
        this.yearOfHire = yearOfHire;
    }

    // Деструктор
    @Override
    protected void finalize() {
        System.out.println("Объект WORKER \"" + fullName + "\" удалён");
    }

    // Методы изменения полей
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearOfHire(int yearOfHire) {
        this.yearOfHire = yearOfHire;
    }

    // Методы отображения полей
    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }


    public double getSalary() {
        return salary;
    }

    public int getYearOfHire() {
        return yearOfHire;
    }

    // Метод расчёта стажа работы
    public int getExperience(int currentYear) {
        return currentYear - yearOfHire;
    }

    // Метод отображения информации о работнике
    public void display() {
        System.out.println("ФИО: " + fullName + " | Должность: " + position
                + " | Зарплата: " + salary + " | Год приёма: " + yearOfHire);
    }
}
