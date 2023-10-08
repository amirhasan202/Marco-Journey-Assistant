package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.CustomerUCService;
import org.asena.marco.Entity.Customer;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CustomerServiceImpl extends baseUCServiceImpl<Customer> implements CustomerUCService
{

	@Override
	@Transactional
	public String Add(Customer entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Customer Edit(Customer entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Customer entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
