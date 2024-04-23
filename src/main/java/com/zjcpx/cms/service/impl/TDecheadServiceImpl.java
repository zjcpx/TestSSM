package com.zjcpx.cms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjcpx.cms.mapper.TDecheadMapper;
import com.zjcpx.cms.pojo.BootStrapTableResult;
import com.zjcpx.cms.pojo.TDechead;
import com.zjcpx.cms.pojo.TDecheadExample;
import com.zjcpx.cms.pojo.TaotaoResult;
import com.zjcpx.cms.service.ITdecheadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PackageName:com.zjcpx.cms.service.impl
 * PROJECT_NAME:TestSSM
 * ClassName: TDecheadServiceImpl
 * Package: com.zjcpx.cms.service.impl
 *
 * @Author zjcxp.com
 * @Create 2024/4/15 14:36
 * @Version 1.0
 * Description:
 */
@Service
public class TDecheadServiceImpl implements ITdecheadService {

    @Autowired
    private TDecheadMapper mapper;

    public TDechead queryTDechead(int id) {
        TDechead tDechead = mapper.selectByPrimaryKey(id);
        return tDechead;
    }

    @Override
    public TaotaoResult insertTDechead(TDechead tDechead) {
        int insert = mapper.insert(tDechead);
            return TaotaoResult.ok();
    }

    @Override
    public List<TDechead> getAllTDecheads() {
        TDecheadExample example = new TDecheadExample();
        List<TDechead> tDecheads = mapper.selectByExample(example);
        return tDecheads;
    }

    @Override
    public BootStrapTableResult pagingQuery(int page, int rows, String sortName, String sordOrder) {
        TDecheadExample example = new TDecheadExample();
        sortName = sortName== null ? " id" : sortName;
        example.setOrderByClause(sortName + " "+sordOrder);
        PageHelper.startPage(page, rows);
        List<TDechead> tDecheads = mapper.selectByExample(example);
        BootStrapTableResult result = new BootStrapTableResult();
        result.setResultList(tDecheads);
        PageInfo<TDechead> info = new PageInfo<>(tDecheads);
        result.setTotalPage(info.getTotal() / rows + 1);
        result.setCount(info.getTotal());
        result.setMsg("成功");
        result.setCode("200");
        result.setPage(page);
        result.setRows(rows);
        return result;
    }
}
