package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.StatustypeUCService;
import org.asena.marco.Entity.Statustype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StatustypeServiceImpl extends baseUCServiceImpl<Statustype> implements StatustypeUCService
{

	@Override
	@Transactional
	public String Add(Statustype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Statustype Edit(Statustype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Statustype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
