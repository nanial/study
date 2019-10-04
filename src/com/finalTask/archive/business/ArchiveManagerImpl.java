package com.finalTask.archive.business;

import com.finalTask.archive.apiBusiness.ArchiveManager;
import com.finalTask.archive.apiDao.ArchiveDao;
import com.finalTask.archive.domain.Portfolio;
import com.finalTask.archive.filter.Filter;

import java.util.ArrayList;


public class ArchiveManagerImpl implements ArchiveManager {

    private ArchiveDao dao;

    public ArchiveManagerImpl(ArchiveDao dao){

        this.dao = dao;
    }

    @Override
    public ArrayList<Portfolio> getListFiles(Filter filter) {
        return dao.getListFiles(filter);
    }

    @Override
    public void writeInFilePortfolio(ArrayList<Portfolio> portfolios) {
        dao.writeInFilePortfolio(portfolios);
    }

    @Override
    public ArrayList<Portfolio> updatePortfolio(ArrayList<Portfolio> portfolios,
                                                int idOfStudent, String department,
                                                int numOfGroup, double averageScore) {
        return dao.updatePortfolio(portfolios, idOfStudent, department, numOfGroup, averageScore);
    }

    @Override
    public Portfolio createPortfolio(String name, String lastName, int numOfGroup, String department,
                                     double averageScore) {

        return dao.createPortfolio(name, lastName, numOfGroup, department, averageScore);
    }
}
