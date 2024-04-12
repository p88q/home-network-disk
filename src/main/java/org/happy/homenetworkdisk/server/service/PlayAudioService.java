package org.happy.homenetworkdisk.server.service;

import javax.servlet.http.HttpServletRequest;

public interface PlayAudioService {
    String getAudioInfoListByJson(final HttpServletRequest request);
}
