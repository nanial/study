package com.finalTask.archive.apiBusiness;

import com.finalTask.archive.domain.Portfolio;
import com.finalTask.archive.filter.Filter;
import java.util.ArrayList;


public interface ArchiveManager {

    ArrayList<Portfolio> getListFiles(Filter filter);
    void writeInFilePortfolio(ArrayList<Portfolio> portfolios);
    ArrayList<Portfolio> updatePortfolio(ArrayList<Portfolio> portfolios,
                         int idOfStudent, String department,
                         int numOfGroup, double averageScore);
    Portfolio createPortfolio(String name, String lastName, int numOfGroup, String department,
                              double averageScore);
}
