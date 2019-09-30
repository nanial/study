package com.finalTask.Archive.domain;
import java.io.*;
import java.net.*;

public class ClientSocket {

    public static void main(String[] args) {

        try(Socket clientSocket = new Socket("127.0.0.1", 8080)){

            BufferedReader bufferedReader = new BufferedReader
                    (new InputStreamReader(clientSocket.getInputStream()));
            String message = bufferedReader.readLine();
            System.out.println(message);

            BufferedWriter writer= new BufferedWriter(
                    new OutputStreamWriter(clientSocket.getOutputStream()));
            writer.write("Get me some information");
            writer.newLine();
            writer.flush();

            writer.close();
            bufferedReader.close();

        }catch (IOException io){
            io.getMessage();
        }
    }
}
