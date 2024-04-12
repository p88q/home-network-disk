package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;
import org.happy.homenetworkdisk.server.model.Folder;
import org.happy.homenetworkdisk.server.model.Node;

import java.util.List;

/**
 * <h2>加载后续文件列表数据所用的封装类</h2>
 * <p>该类用于封装文件视图（列表）的后续数据，以便页面进行分段加载。相当于文件夹视图的“尾巴”。</p>
 *
 * @version 1.0
 */
@Data
public class RemainingFolderView {

    private List<Folder> folderList;
    private List<Node> fileList;
}
