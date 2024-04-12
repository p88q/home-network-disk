package org.happy.homenetworkdisk.server.pojo;

import lombok.Data;

import java.util.List;

/**
 * <h2>上传文件检查结果封装</h2>
 * <p>
 * 该POJO用于封装一次上传文件前置检查的结果，并以JSON格式传回前端。其中包括字段：
 * checkResult（代表结果，如为hasExistsNames则存在同名文件，如为permitUpload则可直接上传）、
 * uploadKey（代表上传凭证，必须使用该凭证上传）
 * 和pereFileNameList（重名列表，仅当checkResult为hasExistsNames时需要检查，否则可忽略）
 * </p>
 *
 * @version 1.0
 */
@Data
public class CheckUploadFilesRespons {

    private String checkResult;//检查结果
    private List<String> pereFileNameList;//重复列表
    private String overSizeFile;//超限文件
    private String maxUploadFileSize;//最大上传体积
}
