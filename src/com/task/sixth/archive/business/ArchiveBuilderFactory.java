package com.task.sixth.archive.business;

import com.task.sixth.archive.apiBusiness.ArchiveBuilder;

public class ArchiveBuilderFactory {

    public static ArchiveBuilder getArchiveBuilder(){
        return ArchiveBuilderImpl.getInstance();
    }

}
