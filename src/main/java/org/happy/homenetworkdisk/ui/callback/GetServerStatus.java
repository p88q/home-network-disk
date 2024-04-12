package org.happy.homenetworkdisk.ui.callback;

import org.happy.homenetworkdisk.server.enumeration.LogLevel;
import org.happy.homenetworkdisk.server.enumeration.VCLevel;
import org.happy.homenetworkdisk.ui.pojo.FileSystemPath;

import java.util.List;

public interface GetServerStatus {
    int getPropertiesStatus();

    boolean getServerStatus();

    int getPort();

    String getInitProt();

    int getBufferSize();

    String getInitBufferSize();

    LogLevel getLogLevel();

    LogLevel getInitLogLevel();

    VCLevel getVCLevel();

    VCLevel getInitVCLevel();

    String getFileSystemPath();

    String getInitFileSystemPath();

    boolean getMustLogin();

    boolean isAllowChangePassword();

    boolean isOpenFileChain();

    List<FileSystemPath> getExtendStores();

    int getMaxExtendStoresNum();
}
