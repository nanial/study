package com.finalTask.library.business;

import com.finalTask.library.apiBusiness.CatalogBuilder;

public class CatalogBuilderFactory {

    public static CatalogBuilder getCatalogBuilder(){

        return CatalogBuilderImpl.getInstance();
    }
}
