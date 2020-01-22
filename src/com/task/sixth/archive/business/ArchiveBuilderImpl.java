package com.task.sixth.archive.business;

import com.task.sixth.archive.apiBusiness.ArchiveBuilder;
import com.task.sixth.archive.bean.Archive;

public class ArchiveBuilderImpl implements ArchiveBuilder {

    private Archive archive;
    private static ArchiveBuilderImpl instance;

    public ArchiveBuilderImpl() {

        this.archive = new Archive();
    }

    synchronized public static ArchiveBuilderImpl getInstance(){

        if(instance == null){

            instance = new ArchiveBuilderImpl();
        }
        return instance;
    }

    @Override
    public Archive getArchive() {
        return archive;
    }
}
