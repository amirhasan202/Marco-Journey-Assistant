package org.asena.marco.Service;

import org.asena.marco.ServiceInterface.RoutedifficultyUCService;
import org.asena.marco.Entity.Routedifficulty;
import org.asena.baseService.baseUCServiceImpl;
import org.asena.common.exception.gException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class RoutedifficultyServiceImpl extends baseUCServiceImpl<Routedifficulty> implements RoutedifficultyUCService
{

	@Override
	@Transactional
	public String Add(Routedifficulty entity) throws Exception, gException 
	{
		//do Business Logic HERE


		return super.Add(entity);
	}



	@Override
	@Transactional
	public Routedifficulty Edit(Routedifficulty entity)  throws Exception,gException
	{

		//do Business Logic HERE


		return super.Edit(entity);
	}



	@Override
	@Transactional
	public void Remove(Routedifficulty entity)  throws Exception,gException
	{

		//do Business Logic HERE


		super.Remove(entity);
	}


}
