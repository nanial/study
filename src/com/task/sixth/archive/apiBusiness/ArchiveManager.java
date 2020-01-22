package com.task.sixth.archive.apiBusiness;

import com.task.sixth.archive.bean.Portfolio;
import com.task.sixth.archive.filter.Filter;
import java.util.ArrayList;


public interface ArchiveManager {

    ArrayList<Portfolio> getListPortfolios();
    void writeInFilePortfolio(ArrayList<Portfolio> portfolios);
    ArrayList<Portfolio> updatePortfolio(ArrayList<Portfolio> portfolios,
                         int idOfStudent, String department,
                         int numOfGroup, double averageScore);
    Portfolio createPortfolio(String name, String lastName, int numOfGroup, String department,
                              double averageScore);
    void searchCertainPortfolio(ArrayList<Portfolio> portfolios, Filter filter);
}
