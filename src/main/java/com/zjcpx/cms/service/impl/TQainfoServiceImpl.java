package com.zjcpx.cms.service.impl;

import com.zjcpx.cms.mapper.TQainfoMapper;
import com.zjcpx.cms.pojo.TQainfo;
import com.zjcpx.cms.pojo.TQainfoExample;
import com.zjcpx.cms.pojo.TaotaoResult;
import com.zjcpx.cms.service.ITQainfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PackageName:com.zjcpx.cms.service.impl
 * PROJECT_NAME:TestSSM
 * ClassName: TQainfoServiceImpl
 * Package: com.zjcpx.cms.service.impl
 *
 * @Author zjcxp.com
 * @Create 2024/4/23 16:47
 * @Version 1.0
 * Description:
 */

@Service
public class TQainfoServiceImpl implements ITQainfoService {

    @Autowired
    private TQainfoMapper mapper;

    @Override
    public TaotaoResult getTQainfo(String fieldName) {
        TQainfoExample example = new TQainfoExample();
        TQainfoExample.Criteria criteria = example.createCriteria();
        criteria.andFieldnameEqualTo(fieldName);
        List<TQainfo> tQainfos = mapper.selectByExample(example);
        return TaotaoResult.ok(tQainfos.get(0));
    }
}
