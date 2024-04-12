package org.happy.homenetworkdisk.server.model;

import lombok.Data;

@Data
public class Folder {
    private String folderId;
    private String folderName;
    private String folderCreationDate;
    private String folderCreator;
    private String folderParent;
    private int folderConstraint;
}
