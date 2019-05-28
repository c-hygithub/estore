package com.briup.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.EsShopcar;
import com.briup.bean.EsShopcarExample;
import com.briup.bean.EsShopcaritemExample;
import com.briup.common.MybatisSqlSessionFactory;
import com.briup.dao.mapperInterface.EsShopcarMapper;

public class EsShopcarSeviceImpl implements IEsShopcarService{

	private SqlSession session= MybatisSqlSessionFactory.getSession();
	private EsShopcarMapper mapper =session .getMapper(EsShopcarMapper.class); 
	private EsShopcarExample example = new EsShopcarExample();
	@Override
	public void addShopCar(EsShopcar shopcar) {
		// TODO Auto-generated method stub
		mapper.insert(shopcar);
		session.commit();
	}

	@Override
	public List<EsShopcar> findAllShopcarList() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(example);
	}

	@Override
	public List<EsShopcar> findShopCarByCustomerId(Integer custid) {
		// TODO Auto-generated method stub
		 example.createCriteria().andCustomerIdEqualTo(new BigDecimal(custid));
		 return mapper.selectByExample(example);
	}

	@Override
	public void deleteShopCar(Integer custid) {
		// TODO Auto-generated method stub
		example.createCriteria().andCustomerIdEqualTo(new BigDecimal(custid));
		mapper.deleteByExample(example);
		
	}

}
