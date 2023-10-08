package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.TripUCService;
import org.asena.marco.Entity.Trip;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TripServiceImpl extends baseUCServiceImpl<Trip> implements TripUCService
{

	@Override
	@Transactional
	public String Add(Trip entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Trip Edit(Trip entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Trip entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
