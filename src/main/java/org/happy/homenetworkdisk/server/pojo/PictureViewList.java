package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PictureViewList {
    private List<PictureInfo> pictureViewList;
    private int index;
}
