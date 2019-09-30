package com.finalTask.Archive.business;

import com.finalTask.Archive.apiBusiness.ArchiveBuilder;

public class ArchiveBuilderFactory {

    public static ArchiveBuilder getArchiveBuilder(){
        return ArchiveBuilderImpl.getInstance();
    }
}
