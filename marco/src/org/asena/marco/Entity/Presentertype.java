package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the presentertype database table.
 * 
 */
@Entity
@NamedQuery(name="Presentertype.findAll", query="SELECT p FROM Presentertype p")
public class Presentertype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	private String name;

	public Presentertype() {
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

}