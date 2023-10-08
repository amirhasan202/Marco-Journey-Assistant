package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.BookingUCService;
import org.asena.marco.Entity.Booking;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookingServiceImpl extends baseUCServiceImpl<Booking> implements BookingUCService
{

	@Override
	@Transactional
	public String Add(Booking entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Booking Edit(Booking entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Booking entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
