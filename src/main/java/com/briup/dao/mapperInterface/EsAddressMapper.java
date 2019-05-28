package com.briup.dao.mapperInterface;

import com.briup.bean.EsAddress;
import com.briup.bean.EsAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsAddressMapper {
    int countByExample(EsAddressExample example);

    int deleteByExample(EsAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EsAddress record);

    int insertSelective(EsAddress record);

    List<EsAddress> selectByExample(EsAddressExample example);

    EsAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EsAddress record, @Param("example") EsAddressExample example);

    int updateByExample(@Param("record") EsAddress record, @Param("example") EsAddressExample example);

    int updateByPrimaryKeySelective(EsAddress record);

    int updateByPrimaryKey(EsAddress record);
}