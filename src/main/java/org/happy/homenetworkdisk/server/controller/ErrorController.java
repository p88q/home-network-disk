package org.happy.homenetworkdisk.server.controller;

import org.happy.homenetworkdisk.printer.Printer;
import org.happy.homenetworkdisk.server.util.FileBlockUtil;
import org.happy.homenetworkdisk.server.util.LogUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;

@ControllerAdvice
public class ErrorController {
	@Resource
	private FileBlockUtil fbu;
	@Resource
	private LogUtil lu;

	@ExceptionHandler({ Exception.class })
	public void handleException(final Exception e) {
		this.lu.writeException(e);
		this.fbu.checkFileBlocks();
		Printer.instance
				.print("\u5904\u7406\u8bf7\u6c42\u65f6\u53d1\u751f\u9519\u8bef\uff1a\n\r------\u4fe1\u606f------\n\r"
						+ e.getMessage() + "\n\r------\u4fe1\u606f------");
	}
}
