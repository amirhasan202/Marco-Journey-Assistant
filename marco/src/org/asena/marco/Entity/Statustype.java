package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the statustype database table.
 * 
 */
@Entity
@NamedQuery(name="Statustype.findAll", query="SELECT s FROM Statustype s")
public class Statustype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	private String name;

	//bi-directional many-to-one association to Customerstatus
	@OneToMany(mappedBy="statustype")
	private List<Customerstatus> customerstatuses;

	public Statustype() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Customerstatus> getCustomerstatuses() {
		return this.customerstatuses;
	}

	public void setCustomerstatuses(List<Customerstatus> customerstatuses) {
		this.customerstatuses = customerstatuses;
	}

	public Customerstatus addCustomerstatus(Customerstatus customerstatus) {
		getCustomerstatuses().add(customerstatus);
		customerstatus.setStatustype(this);

		return customerstatus;
	}

	public Customerstatus removeCustomerstatus(Customerstatus customerstatus) {
		getCustomerstatuses().remove(customerstatus);
		customerstatus.setStatustype(null);

		return customerstatus;
	}

}