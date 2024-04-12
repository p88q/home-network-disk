package org.happy.homenetworkdisk;

import org.happy.homenetworkdisk.printer.Printer;
import org.happy.homenetworkdisk.server.ctl.HomeNetWorkDiskCtl;
import org.happy.homenetworkdisk.server.enumeration.LogLevel;
import org.happy.homenetworkdisk.server.enumeration.VCLevel;
import org.happy.homenetworkdisk.server.pojo.ExtendStores;
import org.happy.homenetworkdisk.server.pojo.ServerSetting;
import org.happy.homenetworkdisk.server.util.ConfigureReader;
import org.happy.homenetworkdisk.server.util.ServerTimeUtil;
import org.happy.homenetworkdisk.ui.callback.GetServerStatus;
import org.happy.homenetworkdisk.ui.callback.UpdateSetting;
import org.happy.homenetworkdisk.ui.module.ServerUIModule;
import org.happy.homenetworkdisk.ui.pojo.FileSystemPath;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <h2>UI界面模式启动器</h2>
 * <p>
 * 该启动器将以界面模式启动HomeNetWorkDisk，请执行静态build()方法开启界面并初始化HomeNetWorkDisk服务器引擎。
 * </p>
 * 
 * @version 1.0
 */
public class UIRunner {

	private static UIRunner ui;
	
	// 实例化图形界面并显示它，同时将图形界面的各个操作与服务器控制器对应起来。
	private UIRunner() throws Exception {
		Printer.init(true);
		final ServerUIModule ui = ServerUIModule.getInsatnce();
		HomeNetWorkDiskCtl ctl = new HomeNetWorkDiskCtl();// 服务器控制层，用于连接UI与服务器内核
		ServerUIModule.setStartServer(() -> ctl.start());
		ServerUIModule.setOnCloseServer(() -> ctl.stop());
		ServerUIModule.setGetServerTime(() -> ServerTimeUtil.getServerTime());
		ServerUIModule.setGetServerStatus(new GetServerStatus() {

			@Override
			public boolean getServerStatus() {
				// TODO 自动生成的方法存根
				return ctl.started();
			}

			@Override
			public int getPropertiesStatus() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getPropertiesStatus();
			}

			@Override
			public int getPort() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getPort();
			}

			@Override
			public boolean getMustLogin() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().mustLogin();
			}

			@Override
			public LogLevel getLogLevel() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getLogLevel();
			}

			@Override
			public String getFileSystemPath() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getFileSystemPath();
			}

			@Override
			public int getBufferSize() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getBuffSize();
			}

			@Override
			public VCLevel getVCLevel() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getVCLevel();
			}

			@Override
			public List<FileSystemPath> getExtendStores() {
				List<FileSystemPath> fsps = new ArrayList<FileSystemPath>();
				for (ExtendStores es : ConfigureReader.instance().getExtendStores()) {
					FileSystemPath fsp = new FileSystemPath();
					fsp.setIndex(es.getIndex());
					fsp.setPath(es.getPath());
					fsp.setType(FileSystemPath.EXTEND_STORES_NAME);
					fsps.add(fsp);
				}
				return fsps;
			}


			@Override
			public LogLevel getInitLogLevel() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getInitLogLevel();
			}

			@Override
			public VCLevel getInitVCLevel() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getInitVCLevel();
			}

			@Override
			public String getInitFileSystemPath() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getInitFileSystemPath();
			}

			@Override
			public String getInitProt() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getInitPort();
			}

			@Override
			public String getInitBufferSize() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getInitBuffSize();
			}

			@Override
			public boolean isAllowChangePassword() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().isAllowChangePassword();
			}

			@Override
			public boolean isOpenFileChain() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().isOpenFileChain();
			}

			@Override
			public int getMaxExtendStoresNum() {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().getMaxExtendstoresNum();
			}
		});
		ServerUIModule.setUpdateSetting(new UpdateSetting() {

			@Override
			public boolean update(ServerSetting s) {
				// TODO 自动生成的方法存根
				return ConfigureReader.instance().doUpdate(s);
			}
		});
		ui.show();
	}

	/**
	 * 
	 * <h2>以UI模式运行HomeNetWorkDisk</h2>
	 * <p>
	 * 执行该方法后，HomeNetWorkDisk将立即显示服务器主界面（需要操作系统支持图形界面）并初始化服务器引擎，等待用户点击按钮并触发相应的操作。
	 * 该方法将返回本启动器的唯一实例。
	 * </p>
	 *
	 * @return UIRunner 本启动器唯一实例
	 * @throws Exception 
	 */
	public static UIRunner build() throws Exception {
		if (UIRunner.ui == null) {
			UIRunner.ui = new UIRunner();
		}
		return UIRunner.ui;
	}
}
