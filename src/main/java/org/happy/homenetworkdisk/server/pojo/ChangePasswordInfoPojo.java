package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;

@Data
public class ChangePasswordInfoPojo {
    private String oldPwd;
    private String newPwd;
    private String time;
}
