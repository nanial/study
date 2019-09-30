package com.finalTask.Archive.dao;

import com.finalTask.Archive.apiDao.ArchiveDao;
import com.finalTask.Archive.domain.Portfolio;
import com.finalTask.Archive.filter.Filter;

import java.util.Set;

public class ArchiveDaoImpl implements ArchiveDao {
    @Override
    public Set<Portfolio> getListFiles(Filter filter) {
        return null;
    }

    @Override
    public void writeInFilePortfolio(Set<Portfolio> portfolios) {

    }

    @Override
    public void updatePortfolio(int idOfStudent) {

    }

    @Override
    public Portfolio createPortfolio() {
        return null;
    }
}
