package com.finalTask.Archive.apiBusiness;

import com.finalTask.Archive.domain.Portfolio;
import com.finalTask.Archive.filter.Filter;

import java.util.Set;

public interface ArchiveManager {

    Set<Portfolio> getListFiles(Filter filter);
    void writeInFilePortfolio(Set<Portfolio> portfolios);
    void updatePortfolio(int idOfStudent);
    Portfolio createPortfolio();
}
