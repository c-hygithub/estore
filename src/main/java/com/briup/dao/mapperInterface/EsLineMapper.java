package com.briup.dao.mapperInterface;

import com.briup.bean.EsLine;
import com.briup.bean.EsLineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsLineMapper {
    int countByExample(EsLineExample example);

    int deleteByExample(EsLineExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EsLine record);

    int insertSelective(EsLine record);

    List<EsLine> selectByExample(EsLineExample example);

    EsLine selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EsLine record, @Param("example") EsLineExample example);

    int updateByExample(@Param("record") EsLine record, @Param("example") EsLineExample example);

    int updateByPrimaryKeySelective(EsLine record);

    int updateByPrimaryKey(EsLine record);
}