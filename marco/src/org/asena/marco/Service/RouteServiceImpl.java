package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.RouteUCService;
import org.asena.marco.Entity.Route;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RouteServiceImpl extends baseUCServiceImpl<Route> implements RouteUCService
{

	@Override
	@Transactional
	public String Add(Route entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Route Edit(Route entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Route entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
