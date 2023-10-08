
package org.asena.marco.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.marco.Entity.Customerstatus;
import org.asena.marco.ServiceInterface.CustomerstatusUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "CustomerstatusMB")
@ViewScoped

public class CustomerstatusMB extends baseManagedBeanController<Customerstatus> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public CustomerstatusMB()
	{
	}


	//Services Deceleration
	@Autowired
	private CustomerstatusUCService CustomerstatusService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Customerstatus();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = CustomerstatusService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				CustomerstatusService.Edit(baseEntity);
			else
				result = CustomerstatusService.Add(baseEntity);

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
	public void Remove(Customerstatus baseEntity)
	{
		try
		{
			CustomerstatusService.Remove(baseEntity);
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
