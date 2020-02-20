package com.task.sixth.archive.domain;

//создайте клиент-серверное приложение “Архив”.
//Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
//него изменения, или создать новое дело.
//Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.
//• Формат хранения данных на сервере – xml-файлы.

import com.task.sixth.archive.apiBusiness.ArchiveManager;
import com.task.sixth.archive.apiDao.ArchiveDao;
import com.task.sixth.archive.bean.Archive;
import com.task.sixth.archive.bean.Portfolio;
import com.task.sixth.archive.business.ArchiveBuilderFactory;
import com.task.sixth.archive.business.ArchiveManagerImpl;
import com.task.sixth.archive.dao.ArchiveDaoImpl;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class  ServerSocket {


    public static void main(String[] args) {

        Archive arch = ArchiveBuilderFactory.getInstance().getArchiveBuilder().getArchive();
        ArchiveDao archD = new ArchiveDaoImpl();
        ArchiveManager am = new ArchiveManagerImpl(archD);

        am.writeInFilePortfolio(arch.base());


        while (true) {

            try (java.net.ServerSocket serverSocket = new java.net.ServerSocket(8080)) {

                Socket clientSocket = serverSocket.accept();

                BufferedWriter writer =
                        new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                writer.write("HTTP/1.0 200 OK");
                writer.newLine();
                writer.write("Content-type: text/html\n" + "\n");

                ObjectOutputStream oos =
                        new ObjectOutputStream(clientSocket.getOutputStream());

                ObjectInputStream ois =
                        new ObjectInputStream(clientSocket.getInputStream());


                oos.writeObject(am.getListPortfolios());


                ArrayList<Portfolio> portfolios = new ArrayList<>();

                try {
                    portfolios.addAll((ArrayList<Portfolio>) ois.readObject());

                } catch (ClassNotFoundException cnf) {

                    cnf.getMessage();
                }

                for (Portfolio p : portfolios) {

                    System.out.println(p.toString());
                }

                am.writeInFilePortfolio(portfolios);

                clientSocket.close();

            } catch (IOException io) {
                io.getMessage();
            }
        }
    }
}