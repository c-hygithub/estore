package com.briup.dao.mapperInterface;

import com.briup.bean.EsShopcaritem;
import com.briup.bean.EsShopcaritemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsShopcaritemMapper {
    int countByExample(EsShopcaritemExample example);

    int deleteByExample(EsShopcaritemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EsShopcaritem record);

    int insertSelective(EsShopcaritem record);

    List<EsShopcaritem> selectByExample(EsShopcaritemExample example);

    EsShopcaritem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EsShopcaritem record, @Param("example") EsShopcaritemExample example);

    int updateByExample(@Param("record") EsShopcaritem record, @Param("example") EsShopcaritemExample example);

    int updateByPrimaryKeySelective(EsShopcaritem record);

    int updateByPrimaryKey(EsShopcaritem record);
}