package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.PresentertypeUCService;
import org.asena.marco.Entity.Presentertype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PresentertypeServiceImpl extends baseUCServiceImpl<Presentertype> implements PresentertypeUCService
{

	@Override
	@Transactional
	public String Add(Presentertype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Presentertype Edit(Presentertype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Presentertype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
