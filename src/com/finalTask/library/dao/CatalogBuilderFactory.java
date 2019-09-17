package com.finalTask.library.dao;

import com.finalTask.library.apiDao.CatalogBuilder;

public class CatalogBuilderFactory {

    public static CatalogBuilder getCatalogBuilder(){

        return CatalogBuilderImpl.getInstance();
    }
}
