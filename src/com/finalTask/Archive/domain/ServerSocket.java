package com.finalTask.Archive.domain;

//создайте клиент-серверное приложение “Архив”.
//Общие требования к заданию:
//• В архиве хранятся Дела (например, студентов). Архив находится на сервере.
//• Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
//него изменения, или создать новое дело.
//Требования к коду лабораторной работы:
//• Для реализации сетевого соединения используйте сокеты.
//• Формат хранения данных на сервере – xml-файлы.

import java.net.*;
import java.io.*;

public class ServerSocket {

    public static void main(String[] args) {

        while (true) {

            try (java.net.ServerSocket serverSocket = new java.net.ServerSocket(8080)){

                Socket clientSocket = serverSocket.accept();

                BufferedWriter writer =
                       new BufferedWriter( new OutputStreamWriter(clientSocket.getOutputStream()));
                writer.write("HTTP/1.0 200 OK");

                writer.newLine();
                writer.write("Content-type: text/html\n" + "\n" +
                        "<h1>Yoo </h1>\n");
                writer.write("<h1>You are client</h1>");
                writer.newLine();
                writer.write("<h2>Welcome! </h2>");
                writer.flush();

                BufferedReader bufferedReader = new BufferedReader
                        (new InputStreamReader(clientSocket.getInputStream()));

                String request = bufferedReader.readLine();
                String response = "<h2>you have been asked " + request + "</h2>";
                writer.write(response);
                writer.flush();

                bufferedReader.close();
                writer.close();
                clientSocket.close();

            } catch (IOException io) {
                io.getMessage();
            }
        }
    }
}
