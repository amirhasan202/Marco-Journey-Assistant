package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.RoutetypeUCService;
import org.asena.marco.Entity.Routetype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RoutetypeServiceImpl extends baseUCServiceImpl<Routetype> implements RoutetypeUCService
{

	@Override
	@Transactional
	public String Add(Routetype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Routetype Edit(Routetype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Routetype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
