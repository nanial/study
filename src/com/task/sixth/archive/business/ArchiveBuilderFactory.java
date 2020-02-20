package com.task.sixth.archive.business;

import com.task.sixth.archive.apiBusiness.ArchiveBuilder;

public class ArchiveBuilderFactory {
    
    private static  ArchiveBuilderFactory instance;

    private ArchiveBuilderFactory() {
    }

    public static ArchiveBuilderFactory getInstance() {

        if(instance == null){
            instance = new ArchiveBuilderFactory();
        }
        return instance;
    }
    public static ArchiveBuilder getArchiveBuilder(){
        return ArchiveBuilderImpl.getInstance();
    }

}
