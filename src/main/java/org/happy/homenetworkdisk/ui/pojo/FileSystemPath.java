package org.happy.homenetworkdisk.ui.pojo;

import lombok.Data;

import java.io.File;

@Data
public class FileSystemPath {

    public static final String MAIN_FILE_SYSTEM_NAME = "主文件系统";
    public static final String EXTEND_STORES_NAME = "扩展存储区";

    private String type;
    private File path;
    private short index;

}
