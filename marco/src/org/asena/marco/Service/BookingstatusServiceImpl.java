package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.BookingstatusUCService;
import org.asena.marco.Entity.Bookingstatus;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookingstatusServiceImpl extends baseUCServiceImpl<Bookingstatus> implements BookingstatusUCService
{

	@Override
	@Transactional
	public String Add(Bookingstatus entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Bookingstatus Edit(Bookingstatus entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Bookingstatus entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
