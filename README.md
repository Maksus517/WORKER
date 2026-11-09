# WORKER

## Описание
Программа для учёта сотрудников.
Позволяет вводить данные работников и находить сотрудников со стажем работы
более заданного значения.

## Структура проекта
- `Worker.java` - класс работника
- `Main.java` - точка входа
- `WorkerTest.java` - тесты класса Worker

## Класс Worker

### Атрибуты
- `fullName` (String) - фамилия и инициалы
- `position` (String) - должность
- `salary` (double) - зарплата
- `yearOfHire` (int) - год приёма на работу

### Методы
- `Worker()` - конструктор по умолчанию
- `Worker(String, String, double, int)` - конструктор с параметрами
- `finalize()` - деструктор (аналог)
- `setFullName()`, `setPosition()`, `setSalary()`, `setYearOfHire()` - сеттеры
- `getFullName()`, `getPosition()`, `getSalary()`, `getYearOfHire()` - геттеры
- `getExperience(int currentYear)` - расчёт стажа
- `display()` - вывод информации

## Запуск
```bash
javac src/main/java/org/example/Main.java src/main/java/org/example/model/Worker.java
java -cp src/main/java org.example.Main