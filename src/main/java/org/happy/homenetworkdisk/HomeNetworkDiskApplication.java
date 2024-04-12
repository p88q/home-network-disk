package org.happy.homenetworkdisk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeNetworkDiskApplication {

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            try {
                UIRunner.build();// 以界面模式启动HomeNetWorkDisk。
            } catch (Exception e) {
                // 提示：如果无法以图形界面启动，那么可能是由于资源引用失败或开发环境配置导致的，
                // 您可以根据此处捕获的异常对其进行调试。
                System.out.println(new String(
                        "错误！无法以图形界面模式启动HomeNetWorkDisk，您的操作系统可能不支持图形界面。您可以尝试使用命令模式参数“-console”来启动并开始使用HomeNetWorkDisk。".getBytes()));
            }
        } else {
            ConsoleRunner.build(args);// 以控制台模式启动HomeNetWorkDisk。
        }
        SpringApplication.run(HomeNetworkDiskApplication.class, args);
    }

}
