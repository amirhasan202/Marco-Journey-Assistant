package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.ClassificationUCService;
import org.asena.marco.Entity.Classification;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClassificationServiceImpl extends baseUCServiceImpl<Classification> implements ClassificationUCService
{

	@Override
	@Transactional
	public String Add(Classification entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Classification Edit(Classification entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Classification entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
