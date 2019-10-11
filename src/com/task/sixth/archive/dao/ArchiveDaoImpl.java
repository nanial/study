package com.task.sixth.archive.dao;

import com.task.sixth.archive.apiDao.ArchiveDao;
import com.task.sixth.archive.domain.Portfolio;
import com.task.sixth.archive.filter.Filter;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;


public class ArchiveDaoImpl implements ArchiveDao {

    @Override
    public ArrayList<Portfolio> getListPortfolios() {

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

    @Override
    public void searchCertainPortfolio(ArrayList<Portfolio> portfolios, Filter filter) {

        if (filter != null){

            if(filter.getLastName() != null) {

                for (Portfolio p : portfolios) {

                    if (p.getLastName().equals(filter.getLastName())) {

                        System.out.println(p.toString());
                    }
                }
            }
            if(filter.getName() != null) {

                for (Portfolio p : portfolios) {

                    if (p.getName().equals(filter.getName())) {

                        System.out.println(p.toString());
                    }
                }
            }
            if(filter.getDepartment() != null) {

                for (Portfolio p : portfolios) {

                    if (p.getDepartment().equals(filter.getDepartment())) {

                        System.out.println(p.toString());
                    }
                }
            }
            if(filter.getNumOfGroup() != 0) {

                for (Portfolio p : portfolios) {

                    if (p.getNumOfGroup() == filter.getNumOfGroup()) {

                        System.out.println(p.toString());
                    }
                }
            }
            if(filter.getIdOfStudent() != 0) {

                for (Portfolio p : portfolios) {

                    if (p.getIdOfStudent() == filter.getIdOfStudent()) {

                        System.out.println(p.toString());
                    }
                }
            }

        }
    }

}
