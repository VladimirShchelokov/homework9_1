/*
Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные классы.
 */

public class Main {
    public static void main(String[] args) {
        Occupation director = new Director();
        director.print();

        Occupation worker = new Worker();
        worker.print();

        Occupation accountant = new Accountant();
        accountant.print();
    }
}