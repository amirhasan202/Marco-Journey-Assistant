package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.ServicetypeUCService;
import org.asena.marco.Entity.Servicetype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ServicetypeServiceImpl extends baseUCServiceImpl<Servicetype> implements ServicetypeUCService
{

	@Override
	@Transactional
	public String Add(Servicetype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Servicetype Edit(Servicetype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Servicetype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
