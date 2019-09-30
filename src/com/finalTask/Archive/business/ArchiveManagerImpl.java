package com.finalTask.Archive.business;

import com.finalTask.Archive.apiBusiness.ArchiveManager;
import com.finalTask.Archive.apiDao.ArchiveDao;
import com.finalTask.Archive.dao.ArchiveDaoImpl;
import com.finalTask.Archive.domain.Portfolio;
import com.finalTask.Archive.filter.Filter;

import java.util.Set;

public class ArchiveManagerImpl implements ArchiveManager {

    private ArchiveDao dao;

    public ArchiveManagerImpl(ArchiveDao dao){

        this.dao = dao;
    }

    @Override
    public Set<Portfolio> getListFiles(Filter filter) {
        return dao.getListFiles(filter);
    }

    @Override
    public void writeInFilePortfolio(Set<Portfolio> portfolios) {
        dao.writeInFilePortfolio(portfolios);
    }

    @Override
    public void updatePortfolio(int idOfStudent) {
        dao.updatePortfolio(idOfStudent);
    }

    @Override
    public Portfolio createPortfolio() {
        return dao.createPortfolio();
    }
}
