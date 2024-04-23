package com.zjcpx.cms.mapper;

import com.zjcpx.cms.pojo.TDechead;
import com.zjcpx.cms.pojo.TDecheadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TDecheadMapper {
    int countByExample(TDecheadExample example);

    int deleteByExample(TDecheadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TDechead record);

    int insertSelective(TDechead record);

    List<TDechead> selectByExample(TDecheadExample example);

    TDechead selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TDechead record, @Param("example") TDecheadExample example);

    int updateByExample(@Param("record") TDechead record, @Param("example") TDecheadExample example);

    int updateByPrimaryKeySelective(TDechead record);

    int updateByPrimaryKey(TDechead record);
}