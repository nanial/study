package com.finalTask.archive.dao;

import com.finalTask.archive.apiDao.ArchiveDao;
import com.finalTask.archive.domain.Portfolio;
import com.finalTask.archive.filter.Filter;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;


public class ArchiveDaoImpl implements ArchiveDao {

    @Override
    public ArrayList<Portfolio> getListFiles(Filter filter) {

        ArrayList<Portfolio> portfolios = new ArrayList<>();

        try {
            XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\archive\\archive.html")));

            portfolios = (ArrayList<Portfolio>) decoder.readObject();

        } catch (IOException io) {

            io.getMessage();
        }

        return portfolios;
    }

    @Override
    public void writeInFilePortfolio(ArrayList<Portfolio> portfolios) {

        XMLEncoder encoder = null;
        try {
            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream
                    ("D:\\study\\java\\study\\src\\com\\finalTask\\archive\\archive.html")));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        encoder.writeObject(portfolios);
        encoder.close();
    }

            @Override
    public ArrayList<Portfolio> updatePortfolio(ArrayList<Portfolio> portfolios,
                                                int idOfStudent, String department,
                                                int numOfGroup, double averageScore) {

                for (Portfolio p : portfolios) {

                    if (p.getIdOfStudent() == idOfStudent){

                        p.setDepartment(department);
                        p.setNumOfGroup(numOfGroup);
                        p.setAverageScore(averageScore);
                    }
                }
        return portfolios;

    }

    @Override
    public Portfolio createPortfolio(String name, String lastName, int numOfGroup, String department,
                                     double averageScore) {
        return new Portfolio(name, lastName, numOfGroup, department, averageScore);
    }

}
