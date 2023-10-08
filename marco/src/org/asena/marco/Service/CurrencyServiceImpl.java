package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.CurrencyUCService;
import org.asena.marco.Entity.Currency;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CurrencyServiceImpl extends baseUCServiceImpl<Currency> implements CurrencyUCService
{

	@Override
	@Transactional
	public String Add(Currency entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Currency Edit(Currency entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Currency entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
