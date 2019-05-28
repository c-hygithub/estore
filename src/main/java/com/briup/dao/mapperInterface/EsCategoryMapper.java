package com.briup.dao.mapperInterface;

import com.briup.bean.EsCategory;
import com.briup.bean.EsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsCategoryMapper {
    int countByExample(EsCategoryExample example);

    int deleteByExample(EsCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EsCategory record);

    int insertSelective(EsCategory record);

    List<EsCategory> selectByExample(EsCategoryExample example);

    EsCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EsCategory record, @Param("example") EsCategoryExample example);

    int updateByExample(@Param("record") EsCategory record, @Param("example") EsCategoryExample example);

    int updateByPrimaryKeySelective(EsCategory record);

    int updateByPrimaryKey(EsCategory record);
}