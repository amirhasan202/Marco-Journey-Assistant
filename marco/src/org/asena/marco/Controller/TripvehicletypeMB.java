
package org.asena.marco.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.marco.Entity.Tripvehicletype;
import org.asena.marco.ServiceInterface.TripvehicletypeUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "TripvehicletypeMB")
@ViewScoped

public class TripvehicletypeMB extends baseManagedBeanController<Tripvehicletype> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public TripvehicletypeMB()
	{
	}


	//Services Deceleration
	@Autowired
	private TripvehicletypeUCService TripvehicletypeService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Tripvehicletype();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = TripvehicletypeService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				TripvehicletypeService.Edit(baseEntity);
			else
				result = TripvehicletypeService.Add(baseEntity);

			ResetBaseObject();


			if (result.length() >= 1)
				JSFHelper.addInfoMessage(result);
			else
				JSFHelper.addInfoMessage("عملیات ثبت / ویرایش اطلاعات با موفقیت انجام شد");

		}
		catch (Exception ex)
		{
			CallCatch(ex);
		}

	}




	//UC: Remove
	public void Remove(Tripvehicletype baseEntity)
	{
		try
		{
			TripvehicletypeService.Remove(baseEntity);
			ResetBaseObject();
			JSFHelper.addInfoMessage("عملیات حذف اطلاعات با موفقیت انجام شد.");
		}
		catch (Exception ex)
		{
			CallCatch(ex);
		}
	}




	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    Setters & Getters
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    Setters & Getters




}
