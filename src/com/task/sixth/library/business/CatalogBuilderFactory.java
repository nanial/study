package com.task.sixth.library.business;

import com.task.sixth.library.apiBusiness.CatalogBuilder;

public class CatalogBuilderFactory {

    public static CatalogBuilder getCatalogBuilder(){

        return CatalogBuilderImpl.getInstance();
    }
}
