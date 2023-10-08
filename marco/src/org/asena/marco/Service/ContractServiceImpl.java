package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.ContractUCService;
import org.asena.marco.Entity.Contract;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ContractServiceImpl extends baseUCServiceImpl<Contract> implements ContractUCService
{

	@Override
	@Transactional
	public String Add(Contract entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Contract Edit(Contract entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Contract entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
