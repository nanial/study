package com.finalTask.archive.business;

import com.finalTask.archive.apiBusiness.ArchiveBuilder;

public class ArchiveBuilderFactory {

    public static ArchiveBuilder getArchiveBuilder(){
        return ArchiveBuilderImpl.getInstance();
    }

}
