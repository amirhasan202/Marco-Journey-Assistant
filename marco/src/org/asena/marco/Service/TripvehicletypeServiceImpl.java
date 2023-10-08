package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.TripvehicletypeUCService;
import org.asena.marco.Entity.Tripvehicletype;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TripvehicletypeServiceImpl extends baseUCServiceImpl<Tripvehicletype> implements TripvehicletypeUCService
{

	@Override
	@Transactional
	public String Add(Tripvehicletype entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Tripvehicletype Edit(Tripvehicletype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Tripvehicletype entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
