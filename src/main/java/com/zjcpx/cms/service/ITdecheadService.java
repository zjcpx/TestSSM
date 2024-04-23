package com.zjcpx.cms.service;

import com.zjcpx.cms.pojo.BootStrapTableResult;
import com.zjcpx.cms.pojo.TDechead;
import com.zjcpx.cms.pojo.TaotaoResult;

import java.util.List;

/**
 * PackageName:com.zjcpx.cms.service
 * PROJECT_NAME:TestSSM
 * ClassName: ITdecheadService
 * Package: com.zjcpx.cms.service
 *
 * @Author zjcxp.com
 * @Create 2024/4/15 14:34
 * @Version 1.0
 * Description:
 */
public interface ITdecheadService {

    TDechead queryTDechead(int id);

    TaotaoResult insertTDechead(TDechead tDechead);

    List<TDechead> getAllTDecheads();

    BootStrapTableResult pagingQuery(int page, int rows, String sortName, String sordOrder);
}
