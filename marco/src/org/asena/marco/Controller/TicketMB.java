
package org.asena.marco.Controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.asena.baseService.JPAOp;
import org.asena.common.JSFHelper;
import org.asena.common.baseManagedBeanController;
import org.asena.common.exception.gException;
import org.asena.marco.Entity.Ticket;
import org.asena.marco.ServiceInterface.TicketUCService;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "TicketMB")
@ViewScoped

public class TicketMB extends baseManagedBeanController<Ticket> implements Serializable
{
	private static final long serialVersionUID = 7175212628505956385L;

	public TicketMB()
	{
	}


	//Services Deceleration
	@Autowired
	private TicketUCService TicketService;




	//base Object, relations Lists (1-* objects)




	@Override
	protected void ResetBaseObject()
	{
		super.ResetBaseObject();

		// new Base Object 
		baseEntity = new Ticket();

		// new other Objects and set them into Base object



		// refresh Lists
		baseEntityList = TicketService.FindAll("id", JPAOp.Asc);
	}




	//UC: Add/Edit
	public void AddEdit() throws gException
	{
		String result = "";
		try
		{
			if (isedit)
				TicketService.Edit(baseEntity);
			else
				result = TicketService.Add(baseEntity);

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
	public void Remove(Ticket baseEntity)
	{
		try
		{
			TicketService.Remove(baseEntity);
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
