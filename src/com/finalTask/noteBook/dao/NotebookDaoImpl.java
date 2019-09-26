package com.finalTask.noteBook.dao;

import com.finalTask.noteBook.domain.Note;
import com.finalTask.noteBook.apiDao.NotebookDao;
import com.finalTask.noteBook.filter.Filter;

import java.beans.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class NotebookDaoImpl implements NotebookDao {

    @Override
    public ArrayList<Note> getListNote(Filter filter) {

        ArrayList<Note> notes = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\noteBook\\notes.txt")));

            notes = (ArrayList<Note>) decoder.readObject();

            if(filter != null){

                if(filter.getDateOfEdit() != null){

                    for (Note n : notes) {

                        if(n.getDateOfEdit().equals(filter.getDateOfEdit())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getEmail() != null){

                    for (Note n : notes) {

                        if(n.getEmail().equals(filter.getEmail())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getMessage() != null){

                    for (Note n : notes) {

                        if(n.getMessage().equals(filter.getMessage())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getTheme() != null){

                    for (Note n : notes) {

                        if(n.getTheme().equals(filter.getTheme())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getCertainWord() != null){

                    for (Note n : notes) {

                        if(n.getTheme().contains(filter.getCertainWord().toString()) ||
                        n.getMessage().contains(filter.getCertainWord().toString())){

                            System.out.println(n.toString());
                        }
                    }
                }
            }
        }
        catch (Exception e){

            e.getMessage();
        }
        return notes;
    }

    @Override
    public void writeInFileNote(ArrayList<Note> notes) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\noteBook\\notes.txt")));

            encoder.setPersistenceDelegate(LocalDate.class, new PersistenceDelegate() {

                @Override
                protected Expression instantiate(Object ldInstance, Encoder out) {
                    return new Expression(ldInstance, LocalDate.class, "parse",
                            new Object[]{ldInstance.toString()});
                }
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        encoder.writeObject(notes);
        encoder.close();
    }
}
