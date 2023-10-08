package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	//bi-directional many-to-one association to Bookingstatus
	@ManyToOne
	@JoinColumn(name="statusid")
	private Bookingstatus bookingstatus;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;

	//bi-directional many-to-one association to Returnrule
	@ManyToOne
	@JoinColumn(name="returnruleid")
	private Returnrule returnrule;

	//bi-directional many-to-one association to Servicetype
	@ManyToOne
	@JoinColumn(name="servicetypeid")
	private Servicetype servicetype;

	//bi-directional many-to-one association to Ticket
	@ManyToOne
	@JoinColumn(name="serviceid")
	private Ticket ticket;

	public Booking() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Bookingstatus getBookingstatus() {
		return this.bookingstatus;
	}

	public void setBookingstatus(Bookingstatus bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Returnrule getReturnrule() {
		return this.returnrule;
	}

	public void setReturnrule(Returnrule returnrule) {
		this.returnrule = returnrule;
	}

	public Servicetype getServicetype() {
		return this.servicetype;
	}

	public void setServicetype(Servicetype servicetype) {
		this.servicetype = servicetype;
	}

	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}