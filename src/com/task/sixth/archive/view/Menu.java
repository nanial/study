package com.task.sixth.archive.view;

import com.task.sixth.archive.apiBusiness.ArchiveManager;
import com.task.sixth.archive.bean.Customer;
import com.task.sixth.archive.bean.Customers;
import com.task.sixth.archive.bean.Portfolio;
import com.task.sixth.archive.bean.Role;
import com.task.sixth.archive.business.ArchiveManagerImpl;
import com.task.sixth.archive.dao.ArchiveDaoImpl;
import com.task.sixth.archive.filter.Filter;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    ArchiveManager am = new ArchiveManagerImpl(new ArchiveDaoImpl());

    ArrayList<Customer> customers = new Customers().fillListOfCustomer();
    public ArrayList<Portfolio> returnPortfolios = new ArrayList<>();


    public void login(ArrayList<Portfolio> portfolios) {

        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {

            System.out.println("Input your position in our university, please");
            while (!scan.hasNext()){

                System.out.println("Input your position in our university correctly, please");
                scan.next();
            }
            String position = scan.next();

            for (Customer c : customers) {

                 if (c.getPosition().equalsIgnoreCase(position)){

                    if (c.getRole() == Role.USER){

                        System.out.println("Welcome, " + position);
                        this.userService(portfolios);
                    }
                    if (c.getRole() == Role.ADMIN){

                        System.out.println("Hello, admin");
                        this.adminPanel(portfolios);
                    }
                }

            }
        }
    }

    public void userService(ArrayList<Portfolio> portfolios) {

        System.out.println("Input 1 for list of portfolios, 2 for search certain portfolio per lastName of student," +
                " 3 for search portfolio(s) of certain group, 4 for search portfolio(s) of certain department," +
                " 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

         one:   while (true) {

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
                        returnPortfolios.addAll(portfolios);
                        break one;

                    default:
                        System.out.println("You have been incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                }
            }

        }


    }
    public void adminPanel(ArrayList<Portfolio> portfolios){


        System.out.println("Input 1 for list of portfolios, 2 for search certain portfolio per lastName of student," +
                " 3 for search portfolio(s) of certain group, 4 for search portfolio(s) of certain department," +
                "5 for create new portfolio, 6 for update portfolio, 7 for escape");

        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

           one: while (true) {

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

                        System.out.println("Input name, please");
                        String  newName =  new Scanner(System.in).nextLine();
                        System.out.println("Input lastName, please");
                        String  newLastName =  new Scanner(System.in).nextLine();
                        System.out.println("Input number of group, please");
                        int number =  new Scanner(System.in).nextInt();
                        System.out.println("Input department, please");
                        String  dep =  new Scanner(System.in).nextLine();
                        System.out.println("Input average score, please");
                        double score =  new Scanner(System.in).nextDouble();

                        Portfolio portfolio = am.createPortfolio(newName,
                                newLastName, number, dep, score);
                        portfolio.setIdOfStudent(portfolios.size() + 1);
                        portfolios.add(portfolio);

                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();

                        break;

                    case 6:

                        System.out.println("Input id of student, please");
                        int id =  new Scanner(System.in).nextInt();
                        System.out.println("Input number of group, please");
                        int numGr =  new Scanner(System.in).nextInt();
                        System.out.println("Input department, please");
                        String  depart =  new Scanner(System.in).nextLine();
                        System.out.println("Input average score, please");
                        double avScore =  new Scanner(System.in).nextDouble();

                        am.updatePortfolio(portfolios,id, depart, numGr, avScore);
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();

                        break;

                    case 7:
                        System.out.println("See you later..");
                        returnPortfolios.addAll(portfolios);
                        break one;

                    default:
                        System.out.println("You have been incorrect command");
                        System.out.println("Choice next operation");
                        choice = scan.nextInt();
                }
            }

        }

    }
}
