package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.PresenterUCService;
import org.asena.marco.Entity.Presenter;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PresenterServiceImpl extends baseUCServiceImpl<Presenter> implements PresenterUCService
{

	@Override
	@Transactional
	public String Add(Presenter entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Presenter Edit(Presenter entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Presenter entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
