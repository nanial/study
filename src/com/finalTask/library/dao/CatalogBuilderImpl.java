package com.finalTask.library.dao;

import com.finalTask.library.apiDao.CatalogBuilder;
import com.finalTask.library.domain.MyCatalog;

public class CatalogBuilderImpl implements CatalogBuilder {

    private MyCatalog catalog;
    private static CatalogBuilderImpl instance;

    private CatalogBuilderImpl(){

        this.catalog = new MyCatalog();
    }

    synchronized public static CatalogBuilderImpl getInstance() {

        if (instance == null){

            instance = new CatalogBuilderImpl();
        }
        return instance;
    }
    @Override
    public MyCatalog getCatalog() {
        return catalog;
    }

}
