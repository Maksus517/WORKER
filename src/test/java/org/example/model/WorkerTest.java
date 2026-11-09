package org.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void testDefaultConstructor() {
        Worker worker = new Worker();
        assertEquals("Неизвестно", worker.getFullName());
        assertEquals("Не указана", worker.getPosition());
        assertEquals(0.0, worker.getSalary());
        assertEquals(2020, worker.getYearOfHire());
    }

    @Test
    void testParameterizedConstructor() {
        Worker worker = new Worker("Иванов И.И.", "Преподаватель", 85000, 2015);
        assertEquals("Иванов И.И.", worker.getFullName());
        assertEquals("Преподаватель", worker.getPosition());
        assertEquals(85000, worker.getSalary());
        assertEquals(2015, worker.getYearOfHire());
    }

    @Test
    void testSettersAndGetters() {
        Worker worker = new Worker();
        worker.setFullName("Петров П.П.");
        worker.setPosition("Тьютор");
        worker.setSalary(60000);
        worker.setYearOfHire(2020);

        assertEquals("Петров П.П.", worker.getFullName());
        assertEquals("Тьютор", worker.getPosition());
        assertEquals(60000, worker.getSalary());
        assertEquals(2020, worker.getYearOfHire());
    }

    @Test
    void testGetExperience() {
        Worker worker = new Worker("Сидоров С.С.", "Методист", 70000, 2018);
        assertEquals(8, worker.getExperience(2026));
        assertEquals(5, worker.getExperience(2023));
    }

    @Test
    void testGetExperienceBoundary() {
        Worker worker = new Worker("Кукушкин К.К.", "Ректор", 100000, 2026);
        assertEquals(0, worker.getExperience(2026));
    }
}