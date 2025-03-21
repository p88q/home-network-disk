package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;
import org.happy.homenetworkdisk.server.model.Node;

/**
 * <h2>一种专门针对视频格式的封装</h2>
 * <p>该封装除了具备node对象的属性外，额外增加了“needEncode”属性，其值为“Y”或“N”，用于代表是否需要进行转码。</p>
 *
 * @version 1.0
 */
@Data
public class VideoInfo extends Node {

    private String needEncode;

    public VideoInfo(Node n) {
        this.setFileId(n.getFileId());
        this.setFileName(n.getFileName());
        this.setFileParentFolder(n.getFileParentFolder());
        this.setFilePath(n.getFilePath());
        this.setFileSize(n.getFileSize());
        this.setFileCreationDate(n.getFileCreationDate());
        this.setFileCreator(n.getFileCreator());
    }
}
