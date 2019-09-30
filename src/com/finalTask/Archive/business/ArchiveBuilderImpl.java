package com.finalTask.Archive.business;

import com.finalTask.Archive.apiBusiness.ArchiveBuilder;
import com.finalTask.Archive.domain.Archive;

public class ArchiveBuilderImpl implements ArchiveBuilder {

    private Archive archive;
    private static ArchiveBuilderImpl instance;

    public ArchiveBuilderImpl() {

        this.archive = new Archive();
    }

    public static ArchiveBuilderImpl getInstance(){

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
