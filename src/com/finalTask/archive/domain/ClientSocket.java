package com.finalTask.archive.domain;

import com.finalTask.archive.apiBusiness.ArchiveManager;
import com.finalTask.archive.apiDao.ArchiveDao;
import com.finalTask.archive.business.ArchiveManagerImpl;
import com.finalTask.archive.dao.ArchiveDaoImpl;
import com.finalTask.archive.filter.Filter;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientSocket {

    static ArrayList<Customer> customers = new Customers().fillListOfCustomer();

    public static void userService() {

    }

    public static ArrayList<Portfolio> adminPanel(ArrayList<Portfolio> portfolios) {


        ArchiveDao archD = new ArchiveDaoImpl();
        ArchiveManager am = new ArchiveManagerImpl(archD);

      /*  try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter for admin");
            String position = scan.nextLine();

            for (Customer c : customers) {

                if (c.getPosition().equals(position)) {

                    if (c.getRole() == Role.ADMIN) {*/

        //scanner with switch

        am.updatePortfolio(portfolios,
                1, "Geography",//for example
                45, 9.5);

        Portfolio portfolio = am.createPortfolio("Fiodor",
                "Mikhoylov", 62,
                "Archaeology", 2.6);
        portfolio.setIdOfStudent(portfolios.size() + 1);
        portfolios.add(portfolio);

        am.searchCertainPortfolio(portfolios, new Filter(0, "Geography"));
        //end switch
                       /* for (Portfolio p : portfolios) {

                            System.out.println(p.toString());
                        }

                    }
                }

            }

        }*/
        return portfolios;
    }

    public static void main(String[] args) {

        ArrayList<Portfolio> portfolios = new ArrayList<>();

        try (Socket clientSocket = new Socket()) {

            clientSocket.connect(new InetSocketAddress("localhost", 8080), 3000);

            ObjectInputStream ois =
                    new ObjectInputStream(clientSocket.getInputStream());

            ObjectOutputStream oos =
                    new ObjectOutputStream(clientSocket.getOutputStream());


            try {
                    portfolios.addAll((ArrayList<Portfolio>) ois.readObject());

            } catch (ClassNotFoundException cnf) {

                    cnf.getMessage();
            }


            for (Portfolio p : portfolios) {

                System.out.println(p.toString());
            }
            System.out.println("///////////////////////////");

            adminPanel(portfolios);

            System.out.println("//////////////////////");

            for (Portfolio p : portfolios) {

                System.out.println(p.toString());
            }

            portfolios = adminPanel(portfolios);


            oos.writeObject(portfolios);

        } catch (IOException io) {

            io.getMessage();
        }

    }
}