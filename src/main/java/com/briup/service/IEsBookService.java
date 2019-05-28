package com.briup.service;

import java.util.List;

import com.briup.bean.EsBook;

/**
 * 
 * @author CuiGX
 *   用来写一些书表的操作
 */
public interface IEsBookService {
	//查询所有的书籍信息
	List<EsBook> findAllBooks();
}
