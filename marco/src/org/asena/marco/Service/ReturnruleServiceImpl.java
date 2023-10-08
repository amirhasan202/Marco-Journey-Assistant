package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.ReturnruleUCService;
import org.asena.marco.Entity.Returnrule;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ReturnruleServiceImpl extends baseUCServiceImpl<Returnrule> implements ReturnruleUCService
{

	@Override
	@Transactional
	public String Add(Returnrule entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Returnrule Edit(Returnrule entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Returnrule entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
