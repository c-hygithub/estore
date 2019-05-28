package com.briup.service;

import java.util.List;

import com.briup.bean.EsShopcar;

/**
 * 
 * @author CuiGX
 * 用来描述购物车表的增删改查
 */
public interface IEsShopcarService {
	//添加购物车
	void addShopCar(EsShopcar shopcar);
	//查询所有的购物车
	List<EsShopcar> findAllShopcarList();
	//根据用户的id去查询购物车
	List<EsShopcar> findShopCarByCustomerId(Integer custid);
	//删除购物车
	void deleteShopCar(Integer custid);
	
}
