package org.happy.homenetworkdisk.server.model;

import lombok.Data;

/**
 * <h2>文件系统相关设置项的模型</h2>
 * <p>该模型用于描述文件系统数据库中的PROPERTIES表。</p>
 *
 * @version 1.0
 */
@Data
public class Propertie {

    private String propertieKey;
    private String propertieValue;
}
