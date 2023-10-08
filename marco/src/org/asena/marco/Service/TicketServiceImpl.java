package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.TicketUCService;
import org.asena.marco.Entity.Ticket;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TicketServiceImpl extends baseUCServiceImpl<Ticket> implements TicketUCService
{

	@Override
	@Transactional
	public String Add(Ticket entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Ticket Edit(Ticket entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Ticket entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
