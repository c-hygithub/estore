package com.briup.service;

import java.util.List;

import com.briup.bean.EsBook;
import com.briup.bean.EsBookExample;
import com.briup.common.MybatisSqlSessionFactory;
import com.briup.dao.mapperInterface.EsBookMapper;

public class EsBookServiceImpl implements IEsBookService{

	@Override
	public List<EsBook> findAllBooks() {
	    EsBookMapper mapper = MybatisSqlSessionFactory.getSession().getMapper(EsBookMapper.class);
		EsBookExample example = new EsBookExample();
		/*return MybatisSqlSessionFactory.
				      getSession().
				      getMapper(EsBookMapper.class).
					  selectByExample(new EsBookExample());*/

		return mapper.selectByExample(example);
	}

}
