package com.task.sixth.archive.business;

import com.task.sixth.archive.apiBusiness.ArchiveManager;
import com.task.sixth.archive.apiDao.ArchiveDao;
import com.task.sixth.archive.bean.Portfolio;
import com.task.sixth.archive.filter.Filter;

import java.util.ArrayList;


public class ArchiveManagerImpl implements ArchiveManager {

    private ArchiveDao dao;

    public ArchiveManagerImpl(ArchiveDao dao){

        this.dao = dao;
    }

    @Override
    public ArrayList<Portfolio> getListPortfolios() {
        return dao.getListPortfolios();
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

    @Override
    public void searchCertainPortfolio(ArrayList<Portfolio> portfolios, Filter filter) {

        dao.searchCertainPortfolio(portfolios, filter);
    }
}
