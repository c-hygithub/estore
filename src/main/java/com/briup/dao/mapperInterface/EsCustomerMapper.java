package com.briup.dao.mapperInterface;

import com.briup.bean.EsCustomer;
import com.briup.bean.EsCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsCustomerMapper {
    int countByExample(EsCustomerExample example);

    int deleteByExample(EsCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EsCustomer record);

    int insertSelective(EsCustomer record);

    List<EsCustomer> selectByExample(EsCustomerExample example);

    EsCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EsCustomer record, @Param("example") EsCustomerExample example);

    int updateByExample(@Param("record") EsCustomer record, @Param("example") EsCustomerExample example);

    int updateByPrimaryKeySelective(EsCustomer record);

    int updateByPrimaryKey(EsCustomer record);
}