package com.briup.service;

import java.util.List;

import com.briup.bean.EsShopcar;

/**
 * 
 * @author CuiGX
 * �����������ﳵ�����ɾ�Ĳ�
 */
public interface IEsShopcarService {
	//��ӹ��ﳵ
	void addShopCar(EsShopcar shopcar);
	//��ѯ���еĹ��ﳵ
	List<EsShopcar> findAllShopcarList();
	//�����û���idȥ��ѯ���ﳵ
	List<EsShopcar> findShopCarByCustomerId(Integer custid);
	//ɾ�����ﳵ
	void deleteShopCar(Integer custid);
	
}
