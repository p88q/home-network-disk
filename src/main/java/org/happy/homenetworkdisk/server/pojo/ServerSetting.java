package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;
import org.happy.homenetworkdisk.server.enumeration.LogLevel;
import org.happy.homenetworkdisk.server.enumeration.VCLevel;

import java.util.List;

@Data
public class ServerSetting {
    private boolean mustLogin;
    private VCLevel vc;
    private int buffSize;
    private LogLevel log;
    private int port;
    private String fsPath;
    private boolean fileChain;
    private boolean changePassword;
    private List<ExtendStores> extendStores;

    public boolean isMustLogin() {
        return this.mustLogin;
    }

    public boolean isOpenFileChain() {
        return fileChain;
    }

    public boolean isAllowChangePassword() {
        return changePassword;
    }
}
