package com.zjcpx.cms.mapper;

import com.zjcpx.cms.pojo.TQainfo;
import com.zjcpx.cms.pojo.TQainfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQainfoMapper {
    long countByExample(TQainfoExample example);

    int deleteByExample(TQainfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TQainfo record);

    int insertSelective(TQainfo record);

    List<TQainfo> selectByExample(TQainfoExample example);

    TQainfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TQainfo record, @Param("example") TQainfoExample example);

    int updateByExample(@Param("record") TQainfo record, @Param("example") TQainfoExample example);

    int updateByPrimaryKeySelective(TQainfo record);

    int updateByPrimaryKey(TQainfo record);
}