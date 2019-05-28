package com.briup.dao.mapperInterface;

import com.briup.bean.EsShopcar;
import com.briup.bean.EsShopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsShopcarMapper {
    int countByExample(EsShopcarExample example);

    int deleteByExample(EsShopcarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EsShopcar record);

    int insertSelective(EsShopcar record);

    List<EsShopcar> selectByExample(EsShopcarExample example);

    EsShopcar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EsShopcar record, @Param("example") EsShopcarExample example);

    int updateByExample(@Param("record") EsShopcar record, @Param("example") EsShopcarExample example);

    int updateByPrimaryKeySelective(EsShopcar record);

    int updateByPrimaryKey(EsShopcar record);
}