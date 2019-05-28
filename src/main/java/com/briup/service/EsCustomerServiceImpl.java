package com.briup.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.briup.bean.EsCustomer;
import com.briup.bean.EsCustomerExample;
import com.briup.common.MybatisSqlSessionFactory;
import com.briup.dao.mapperInterface.EsCustomerMapper;

public class EsCustomerServiceImpl implements IEsCustomerService{


	private EsCustomerMapper mapper ;
	public List<EsCustomer> customerLoging(String name, String password) {
		
		EsCustomerExample example = new EsCustomerExample();
		example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(password);
		//给mappler赋值。
		mapper = MybatisSqlSessionFactory.getSession().getMapper(EsCustomerMapper.class);
		List<EsCustomer> list = mapper.selectByExample(example);
		return list;
	}

	public void cutomerRegister(EsCustomer customer) {
		EsCustomerMapper mapper = MybatisSqlSessionFactory.getSession().getMapper(EsCustomerMapper.class) ;
		EsCustomerExample example = new EsCustomerExample();
		List<Integer> idlist = new ArrayList<>();
		List<EsCustomer> allidlist=mapper.selectByExample(example);
		for (EsCustomer esCustomer : allidlist) {
			idlist.add(esCustomer.getId());				
		}
		Collections.sort(idlist);
		System.out.println(idlist);
		
//		先查再注册
		example.createCriteria().andNameEqualTo(customer.getName());
		List<EsCustomer> list=mapper.selectByExample(example);
		if(list!=null && list.size()!=0){
			System.out.println("不允许注册");
		}else {
			//注册	
			Integer newid = idlist.get(0)+1;
			customer.setId(newid);
			mapper.insert(customer);	
			MybatisSqlSessionFactory.getSession().commit();
			System.out.println("注册成功");
		}
		
	}

}
