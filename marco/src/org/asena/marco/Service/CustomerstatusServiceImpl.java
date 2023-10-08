package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.CustomerstatusUCService;
import org.asena.marco.Entity.Customerstatus;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerstatusServiceImpl extends baseUCServiceImpl<Customerstatus> implements CustomerstatusUCService
{

	@Override
	@Transactional
	public String Add(Customerstatus entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Customerstatus Edit(Customerstatus entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Customerstatus entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
