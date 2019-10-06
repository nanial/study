package com.finalTask.archive.domain;

import java.io.*;
import java.net.*;
import java.util.ArrayList;


public class ClientSocket {


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

            Menu menu = new Menu();
            menu.login(portfolios);

            oos.writeObject(menu.returnPortfolios);

        } catch (IOException io) {

            io.getMessage();
        }

    }
}