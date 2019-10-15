package com.task.sixth.noteBook.dao;

import com.task.sixth.noteBook.Comparator.NoteComparator;
import com.task.sixth.noteBook.domain.Note;
import com.task.sixth.noteBook.apiDao.NotebookDao;
import com.task.sixth.noteBook.filter.Filter;

import java.beans.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class NotebookDaoImpl implements NotebookDao {

    @Override
    public ArrayList<Note> getListNote(Filter filter) {

        ArrayList<Note> notes = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\study\\src\\com\\task\\sixth\\noteBook\\notes.txt")));

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

                    for (Note n : this.sortDate()) {

                        if(n.getEmail().equals(filter.getEmail())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getMessage() != null){

                    for (Note n : this.sortDate()) {

                        if(n.getMessage().equals(filter.getMessage())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getTheme() != null){

                    for (Note n : this.sortDate()) {

                        if(n.getTheme().equals(filter.getTheme())){

                            System.out.println(n.toString());
                        }
                    }
                }
                if(filter.getCertainWord() != null){

                    for (Note n : this.sortDate()) {

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
                    ("D:\\study\\java\\study\\src\\com\\task\\sixth\\noteBook\\notes.txt")));

            encoder.setPersistenceDelegate(LocalDate.class, new PersistenceDelegate() {

                @Override
                protected Expression instantiate(Object oldInstance, Encoder out) {
                    return new Expression(oldInstance, LocalDate.class, "parse",
                            new Object[]{oldInstance.toString()});
                }
            });

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

        encoder.writeObject(notes);
        encoder.close();
    }

    @Override
    public Set<Note> sortDate() {
        Set<Note> noteSet = new TreeSet<>(new NoteComparator());
        noteSet.addAll(this.getListNote(null));
        return noteSet;
    }
}
