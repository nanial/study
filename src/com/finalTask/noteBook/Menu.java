package com.finalTask.noteBook;

import com.finalTask.noteBook.apiBusiness.NotebookManager;
import com.finalTask.noteBook.apiDao.NotebookDao;
import com.finalTask.noteBook.business.NotebookBuilderFactory;
import com.finalTask.noteBook.business.NotebookManagerImpl;
import com.finalTask.noteBook.dao.NotebookDaoImpl;
import com.finalTask.noteBook.domain.Note;
import com.finalTask.noteBook.domain.Notebook;
import com.finalTask.noteBook.filter.Filter;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    Notebook not = new NotebookBuilderFactory().getNotebookBuilder().getNotebook();
    NotebookDao nd = new NotebookDaoImpl();
    NotebookManager nm = new NotebookManagerImpl(nd);

    public void service() {

        System.out.println("Input 1 for add in notebook new note," +
                " 2 for search note per theme," +
                " 3 for search note per date, 4 for search certain word, 5 for escape");
        try (@SuppressWarnings("")
             Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();

            while (true) {

                switch (choice) {

                    case 1:

                        System.out.println("Input theme of note, please");
                        String theme =  new Scanner(System.in).nextLine();
                        System.out.println("Input date of note in format 'YYYY-MM-DD', please");
                        Scanner scanDate = new Scanner(System.in);

                        while (!scanDate.hasNext("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|"
                                + "[13579][26])))-02-29)$"
                                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$")){

                            System.out.println("Input date of note in format 'YYYY-MM-DD', please");
                            scanDate.next();
                        }
                        String dateOfEdit = scanDate.next("^((2000|2400|2800|(19|2[0-9](0[48]|"
                                + "[2468][048]|[13579][26])))-02-29)$"
                                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

                        System.out.println("Input Email");
                        Scanner scanEmail = new Scanner(System.in);

                        while (!scanEmail.hasNext("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*" +
                                "@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$")){

                            System.out.println("Input correct Email");
                            scanEmail.next();
                        }
                        String email = scanEmail.next("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*" +
                                "@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");

                        System.out.println("Write the message, please");
                        String message =  new Scanner(System.in).nextLine();

                        nm.writeInFileNote(not.addNewNote(new Note(theme, dateOfEdit,
                                email, message)));

                        System.out.println("Choice next operation");

                        while (!scan.hasNextInt()){

                            System.out.println("Choice next operation");
                            scan.next();
                        }
                        choice = scan.nextInt();

                        break;

                    case 2:

                        System.out.println("Input theme of note, please");
                        String themePerSearch =  new Scanner(System.in).nextLine();

                        nm.getListNote(new Filter(themePerSearch, null, null, null));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 3:

                        System.out.println("Input date of note, please");
                        String datePerSearch =  new Scanner(System.in).nextLine();

                        nm.getListNote(new Filter( null, LocalDate.parse(datePerSearch),
                                null, null));
                        System.out.println("Choice next operation, please");
                        choice = scan.nextInt();
                        break;

                    case 4:

                        System.out.println("Input the word, please");
                        String wordPerSearch =  new Scanner(System.in).nextLine();

                        nm.getListNote(new Filter(wordPerSearch));
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

}
