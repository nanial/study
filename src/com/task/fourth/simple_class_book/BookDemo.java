package com.task.fourth.simple_class_book;

//Создать второй класс, агрегирующий массив
//типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных
//и вывести эти данные на консоль.Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class BookDemo {

    static private Book [] library = new Book[] {
            new Book("Ocharovanny strannik", "Leskov",
                    "LenIzdat", 1984, 387, 44),
            new Book("Zapechatlenny angel", "Leskov",
                    "LenIzdat", 1984, 187, 14),
            new Book("Levscha", "Leskov",
                    "LenIzdat", 1979, 37, 4),
            new Book("Resurrection", "Tolstoy",
                    "Svoboda", 1962, 532, 32),
            new Book("Peace and war", "Tolstoy",
                    "Blankizdat", 1962, 2532, 59),
    };

    private static void showBooksOfCertainAuth(String author) {

        for (Book b : library) {

            if(b.getAuthor().equals(author))
            System.out.println(b.toString());
        }
    }
    private static void showBooksOfCertainEdit(String editHouse) {

        for (Book b : library) {

            if(b.getEditHouse().equals(editHouse)) {

                System.out.println(b.toString());
            }
        }
    }
    private static void showBooksOfCertainYear(int year) {

        for (Book b : library) {

            if(b.getEditYear() > year){

                System.out.println(b.toString());
            }
        }
    }
    public static void main(String[] args) {

        showBooksOfCertainAuth("Leskov");

        System.out.println();
        showBooksOfCertainEdit("Blankizdat");

        System.out.println();
        showBooksOfCertainYear(1960);
    }
}
