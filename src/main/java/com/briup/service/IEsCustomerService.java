package com.briup.service;

import java.util.List;

import com.briup.bean.EsCustomer;
import com.briup.bean.EsCustomerExample;

/**
 * @author CuiGX
 *���û�����һЩ����
 *��������¼   ע��
 */
public interface IEsCustomerService {
	/**
	 * ��¼
	 */
	List<EsCustomer> customerLoging(String name, String password);
	
	
	/**
	 * ע��
	 */
	void cutomerRegister(EsCustomer customer);
	
}
