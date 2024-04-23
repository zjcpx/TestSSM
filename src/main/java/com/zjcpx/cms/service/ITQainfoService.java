package com.zjcpx.cms.service;

import com.zjcpx.cms.pojo.TQainfo;
import com.zjcpx.cms.pojo.TaotaoResult;

/**
 * PackageName:com.zjcpx.cms.service
 * PROJECT_NAME:TestSSM
 * ClassName: ITQainfoService
 * Package: com.zjcpx.cms.service
 *
 * @Author zjcxp.com
 * @Create 2024/4/23 16:45
 * @Version 1.0
 * Description:
 */
public interface ITQainfoService {

    TaotaoResult getTQainfo(String fieldName);
}
