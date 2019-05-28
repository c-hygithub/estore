package com.briup.dao.mapperInterface;

import com.briup.bean.EsBook;
import com.briup.bean.EsBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsBookMapper {
    int countByExample(EsBookExample example);

    int deleteByExample(EsBookExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EsBook record);

    int insertSelective(EsBook record);

    List<EsBook> selectByExample(EsBookExample example);

    EsBook selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EsBook record, @Param("example") EsBookExample example);

    int updateByExample(@Param("record") EsBook record, @Param("example") EsBookExample example);

    int updateByPrimaryKeySelective(EsBook record);

    int updateByPrimaryKey(EsBook record);
}