package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contract database table.
 * 
 */
@Entity
@NamedQuery(name="Contract.findAll", query="SELECT c FROM Contract c")
public class Contract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	@Temporal(TemporalType.DATE)
	private Date completiondate;

	private String contractfile;

	@Temporal(TemporalType.DATE)
	private Date startingdate;

	public Contract() {
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

	public Date getCompletiondate() {
		return this.completiondate;
	}

	public void setCompletiondate(Date completiondate) {
		this.completiondate = completiondate;
	}

	public String getContractfile() {
		return this.contractfile;
	}

	public void setContractfile(String contractfile) {
		this.contractfile = contractfile;
	}

	public Date getStartingdate() {
		return this.startingdate;
	}

	public void setStartingdate(Date startingdate) {
		this.startingdate = startingdate;
	}

}