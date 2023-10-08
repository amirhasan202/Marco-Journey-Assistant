package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.TriptypeUCService;
import org.asena.marco.Entity.Triptype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TriptypeServiceImpl extends baseUCServiceImpl<Triptype> implements TriptypeUCService
{

	@Override
	@Transactional
	public String Add(Triptype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Triptype Edit(Triptype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Triptype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
