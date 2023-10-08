
package org.asena.marco.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.marco.Entity.Presentertype;
import org.asena.marco.ServiceInterface.PresentertypeUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "PresentertypeMB")
@ViewScoped

public class PresentertypeMB extends baseManagedBeanController<Presentertype> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public PresentertypeMB()
	{
	}


	//Services Deceleration
	@Autowired
	private PresentertypeUCService PresentertypeService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Presentertype();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = PresentertypeService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				PresentertypeService.Edit(baseEntity);
			else
				result = PresentertypeService.Add(baseEntity);

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
	public void Remove(Presentertype baseEntity)
	{
		try
		{
			PresentertypeService.Remove(baseEntity);
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
