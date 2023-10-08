package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.PaymentmethodUCService;
import org.asena.marco.Entity.Paymentmethod;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PaymentmethodServiceImpl extends baseUCServiceImpl<Paymentmethod> implements PaymentmethodUCService
{

	@Override
	@Transactional
	public String Add(Paymentmethod entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Paymentmethod Edit(Paymentmethod entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Paymentmethod entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
