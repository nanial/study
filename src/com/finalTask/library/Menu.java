package com.finalTask.library;


import com.finalTask.library.apiBusiness.BookManager;
import com.finalTask.library.apiBusiness.CustomerManager;
import com.finalTask.library.business.BookManagerImpl;
import com.finalTask.library.business.CatalogBuilderFactory;
import com.finalTask.library.business.CustomerManagerImpl;
import com.finalTask.library.dao.BookDaoImpl;
import com.finalTask.library.dao.CustomerDaoImpl;
import com.finalTask.library.domain.*;
import com.finalTask.library.filter.BookFilter;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    CustomerManager cm = new CustomerManagerImpl(new CustomerDaoImpl());
    BookManager bm = new BookManagerImpl(new BookDaoImpl());
    MyCatalog cat = new CatalogBuilderFactory().getCatalogBuilder().getCatalog();
    ArrayList<Customer> customers = cm.getListCustomer();


    public void login() {

        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in);) {

            System.out.println("Input your Email");
            while (!scan.hasNext("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*" +
                    "@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$")){
                System.out.println("Input your Email");
                scan.next();
            }
            String customerEmail = scan.next("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*" +
                    "@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");

            System.out.println("Input your password");
            String customerPass = scan.next();


            for (Customer c : customers) {

                if (c.getCustomerEmail().equals(customerEmail) &&
                        c.getCustomerPassword().equals(customerPass.hashCode())) {
                    if (c.getRole() == Role.USER){
                        System.out.println("Welcome to the library");
                        this.userService();
                    }
                    if (c.getRole() == Role.ADMIN){
                        System.out.println("Hello, admin");
                        this.adminPanel();
                    }
                }

            }
        }
    }

    public void userService() {

        System.out.println("Input 1 for list per page of book, 2 for search certain book," +
                " 3 for search books of certain author, 4 for offer new book, 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in);) {
            int choice = scan.nextInt();

            while (choice != 5) {

                switch (choice) {

                    case 1:

                        System.out.println("Enter number of page");
                        bm.getBookList(new BookFilter(new Scanner(System.in).nextInt()));
                        System.out.println("Choice next operation");
                        while (!scan.hasNextInt()){
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Input title of book, please");
                        String titl =  new Scanner(System.in).nextLine();
                        bm.getBookList(new BookFilter(null, titl));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 3:

                        System.out.println("Input author of book, please");
                        String auth =  new Scanner(System.in).nextLine();
                        bm.getBookList(new BookFilter(auth, null));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 4:

                        System.out.println("Input author of book, please");
                        String author =  new Scanner(System.in).nextLine();
                        System.out.println("Input title of book, please");
                        String title =  new Scanner(System.in).nextLine();
                        System.out.println("It is digital? (true/false)");
                        boolean isDigital =  new Scanner(System.in).nextBoolean();
                        System.out.println("Write the description of book, please");
                        String description =  new Scanner(System.in).nextLine();

                        for (Customer c : customers) {
                            if (c.getRole() ==Role.ADMIN){
                                cm.sendEmail(c, new Book(author, title, isDigital, description));
                                //c.getInBox().forEach(System.out::println);
                            }
                        }

                        System.out.println("Your offer have been sended");

                        Book offerBook = new Book();
                        offerBook.setAuthor(author);
                        offerBook.setTitle(title);
                        offerBook.setDigital(isDigital);
                        offerBook.setDescription(description);
                        offerBook.setBookId(bm.getBookList(null).size() + 1);

                        bm.writeBooksInFile(cat.fillCatalog(offerBook));

                       // admin.getInBox().forEach(System.out::println);
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                        break;

                    case 5:
                        System.out.println("See you later..");
                        System.exit(1);

                    default:
                        System.out.println("You have been incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                }
            }

        }

    }
    public void adminPanel(){

        System.out.println("Input 1 for update book, 2 for delete book," +
                " 3 for add books, 4 for list per page of book, 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in);) {
            int choice = scan.nextInt();

            while (choice != 5) {

                switch (choice) {

                    case 1:

                        System.out.println("Enter id of book");
                        int bookId = new Scanner(System.in).nextInt();
                        System.out.println("It is digital? (true/false)");
                        boolean isDigital =  new Scanner(System.in).nextBoolean();
                        System.out.println("Write the description of book, please");
                        String description =  new Scanner(System.in).nextLine();
                        bm.writeBooksInFile(cat.updateBook(bookId, isDigital, description));
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Enter id of book");
                        int bId = new Scanner(System.in).nextInt();
                        bm.writeBooksInFile(cat.delBook(bId));
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                        break;

                    case 3:

                        System.out.println("Input author of book, please");
                        String author =  new Scanner(System.in).nextLine();
                        System.out.println("Input title of book, please");
                        String title =  new Scanner(System.in).nextLine();
                        System.out.println("It is digital? (true/false)");
                        boolean isDigit =  new Scanner(System.in).nextBoolean();
                        System.out.println("Write the description of book, please");
                        String descript =  new Scanner(System.in).nextLine();
                        System.out.println("Choice next operation");

                        Book newBook = new Book(author, title, isDigit, descript);
                        bm.writeBooksInFile(cat.fillCatalog(newBook));

                        for (Customer c : customers) {
                            cm.sendEmail(c, newBook );
                            //c.getInBox().forEach(System.out::println);
                        }
                        choice = scan.nextInt();
                        break;

                    case 4:

                        System.out.println("Enter number of page");
                        bm.getBookList(new BookFilter(new Scanner(System.in).nextInt()));
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                        break;

                    case 5:
                        System.out.println("See you later..");
                        System.exit(1);

                    default:
                        System.out.println("You have been incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();

                }
            }
        }
    }
}
