package com.finalTask.library;

//создать консольное приложение “Учет книг в домашней библиотеке”.
//Общие требования к заданию:
//• Система учитывает книги как в электронном, так и в бумажном варианте.+
//• Существующие роли: пользователь, администратор.+
//• Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.+
//• Администратор может модифицировать каталог.+
//• *При добавлении описания книги в каталог оповещение о ней рассылается на e-mail всем пользователям
//• **При просмотре каталога желательно реализовать постраничный просмотр
//• ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
//• Каталог книг хранится в текстовом файле.+
//• Данные аутентификации пользователей хранятся в текстовом файле. Пароль не хранится в открытом виде+

import com.finalTask.library.apiBusiness.BookManager;
import com.finalTask.library.apiBusiness.CustomerManager;
import com.finalTask.library.business.BookManagerImpl;
import com.finalTask.library.business.CustomerManagerImpl;
import com.finalTask.library.dao.BookDaoImpl;
import com.finalTask.library.dao.CatalogBuilderFactory;
import com.finalTask.library.dao.CustomerDaoImpl;
import com.finalTask.library.domain.*;
import com.finalTask.library.filter.BookFilter;


public class Main {

    public static void main(String[] args) {

        BookManager bm = new BookManagerImpl(new BookDaoImpl());
        MyCatalog cat = new CatalogBuilderFactory().getCatalogBuilder().getCatalog();
        bm.writeBooksInFile(cat.fillCatalog());
        bm.getBookList(new BookFilter(null, "The Enchanted Wanderer"));


        CustomerManager cm = new CustomerManagerImpl(new CustomerDaoImpl());
        cm.addInFileCustomer(new Customers().fillListOfCustomer());
        cm.getListCustomer();

        bm.writeBooksInFile(cat.updateBook(1, true, "poem"));
        bm.getBookList(null);
    }
}
