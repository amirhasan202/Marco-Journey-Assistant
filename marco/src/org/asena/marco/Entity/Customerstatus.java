package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the customerstatus database table.
 * 
 */
@Entity
@NamedQuery(name="Customerstatus.findAll", query="SELECT c FROM Customerstatus c")
public class Customerstatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.DATE)
	private Date biginingdate;

	private Integer code;

	@Temporal(TemporalType.DATE)
	private Date finishdate;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customer;

	//bi-directional many-to-one association to Statustype
	@ManyToOne
	@JoinColumn(name="statustypeid")
	private Statustype statustype;

	public Customerstatus() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBiginingdate() {
		return this.biginingdate;
	}

	public void setBiginingdate(Date biginingdate) {
		this.biginingdate = biginingdate;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Date getFinishdate() {
		return this.finishdate;
	}

	public void setFinishdate(Date finishdate) {
		this.finishdate = finishdate;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Statustype getStatustype() {
		return this.statustype;
	}

	public void setStatustype(Statustype statustype) {
		this.statustype = statustype;
	}

}