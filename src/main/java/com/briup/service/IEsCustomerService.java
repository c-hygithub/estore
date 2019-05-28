package com.briup.service;

import java.util.List;

import com.briup.bean.EsCustomer;
import com.briup.bean.EsCustomerExample;

/**
 * @author CuiGX
 *对用户表做一些操作
 *包含：登录   注册
 */
public interface IEsCustomerService {
	/**
	 * 登录
	 */
	List<EsCustomer> customerLoging(String name, String password);
	
	
	/**
	 * 注册
	 */
	void cutomerRegister(EsCustomer customer);
	
}
