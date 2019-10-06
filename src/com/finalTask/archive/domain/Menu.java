package com.finalTask.archive.domain;

import com.finalTask.archive.apiBusiness.ArchiveManager;
import com.finalTask.archive.business.ArchiveBuilderFactory;
import com.finalTask.archive.business.ArchiveManagerImpl;
import com.finalTask.archive.dao.ArchiveDaoImpl;
import com.finalTask.archive.filter.Filter;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    ArchiveManager am = new ArchiveManagerImpl(new ArchiveDaoImpl());

    Archive arch = new ArchiveBuilderFactory().getArchiveBuilder().getArchive();
    ArrayList<Customer> customers = new Customers().fillListOfCustomer();



    public void login() {

        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {

            System.out.println("Input your position in our university, please");
            while (!scan.hasNext()){

                System.out.println("Input your position in our university correctly, please");
                scan.next();
            }
            String position = scan.next();

            for (Customer c : customers) {

                if (c.getPosition().equals(position)){

                    if (c.getRole() == Role.USER){

                        System.out.println("Welcome");
                      //  this.userService();
                    }
                    if (c.getRole() == Role.ADMIN){

                        System.out.println("Hello, admin");
                        this.adminPanel();
                    }
                }

            }
        }
    }

    public void userService(ArrayList<Portfolio> portfolios) {

        System.out.println("Input 1 for list of portfolios, 2 for search certain portfolio per lastName of student," +
                " 3 for search portfolio(s) of certain group, 4 for search portfolio(s) of certain group," +
                " 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

            while (true) {

                switch (choice) {

                    case 1:

                        portfolios.forEach(System.out::println);
                        System.out.println("Choice next operation");

                        while (!scan.hasNextInt()){

                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Input lastName of student, please");
                        String lastName = new Scanner(System.in).nextLine();
                        am.searchCertainPortfolio(portfolios, new Filter(lastName));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 3:

                        System.out.println("Input number of group, please");
                        int numOfGroup =  new Scanner(System.in).nextInt();
                        am.searchCertainPortfolio(portfolios, new Filter(numOfGroup, null));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 4:
                        System.out.println("Input department, please");
                        String  department =  new Scanner(System.in).nextLine();
                        am.searchCertainPortfolio(portfolios, new Filter(0, department));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 5:
                        System.out.println("See you later..");
                        System.exit(0);

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
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

            while (true) {

                switch (choice) {

                    case 1:

                        System.out.println("Enter id of book");
                        int bookId = new Scanner(System.in).nextInt();
                        System.out.println("It is digital? (true/false)");
                        boolean isDigital =  new Scanner(System.in).nextBoolean();
                        System.out.println("Write the description of book, please");
                        String description =  new Scanner(System.in).nextLine();
                       // bm.writeBooksInFile(arch.updateBook(bookId, isDigital, description));
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                        break;

                    case 2:

                        System.out.println("Enter id of book");
                        int bId = new Scanner(System.in).nextInt();
                       // bm.writeBooksInFile(arch.delBook(bId));
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

                      //  Book newBook = new Book(author, title, isDigit, descript);
                        //bm.writeBooksInFile(arch.fillCatalog(newBook));

                        for (Customer c : customers) {
                          //  am.sendEmail(c, newBook );
                            //c.getInBox().forEach(System.out::println);
                        }
                        choice = scan.nextInt();
                        break;

                    case 4:

                        System.out.println("Enter number of page");
                       // bm.getBookList(new BookFilter(new Scanner(System.in).nextInt()));
                        System.out.println("Choice next operation");
                        while (!scan.hasNextInt()){
                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();
                        break;

                    case 5:
                        System.out.println("See you later..");
                        System.exit(0);

                    default:
                        System.out.println("You have been incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();

                }
            }
        }
    }
}
