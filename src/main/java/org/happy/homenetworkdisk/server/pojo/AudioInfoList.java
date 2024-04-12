package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;

import java.util.List;

@Data
public class AudioInfoList {
    private List<AudioInfo> as;
    private int index;
}
