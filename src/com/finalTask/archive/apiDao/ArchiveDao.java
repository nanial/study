package com.finalTask.archive.apiDao;

import com.finalTask.archive.domain.Portfolio;
import com.finalTask.archive.filter.Filter;
import java.util.ArrayList;


public interface ArchiveDao {

    ArrayList<Portfolio> getListPortfolios();
    void writeInFilePortfolio(ArrayList<Portfolio> portfolios);
    ArrayList<Portfolio> updatePortfolio(ArrayList<Portfolio> portfolios,
                                         int idOfStudent, String department,
                                         int numOfGroup, double averageScore);
    Portfolio createPortfolio(String name, String lastName, int numOfGroup, String department,
                              double averageScore);
    void searchCertainPortfolio(ArrayList<Portfolio> portfolios, Filter filter);
}
