package org.happy.homenetworkdisk.server.model;

import lombok.Data;

/**
 * <h2>文件节点模型</h2>
 * <p>该模型描述了HomeNetWorkDisk文件管理机制中的一个文件节点，从而生成一个文件的抽象对象，所有外部操作均应基于此对象进行而不是直接操作文件块。
 * 该模型对应了文件系统数据库中的FILE表。</p>
 *
 * @version 1.0
 */
@Data
public class Node {
    // 可返回前端的字段
    private String fileId;
    private String fileName;
    private String fileSize;
    private String fileParentFolder;
    private String fileCreationDate;
    private String fileCreator;

    // 不需要返回前端、仅应在后端中使用的字段
    private transient String filePath;

}
