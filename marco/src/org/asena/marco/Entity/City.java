package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@NamedQuery(name="City.findAll", query="SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	private Integer countryid;

	private String name;

	private Integer provinceid;

	//bi-directional many-to-one association to Route
	@OneToMany(mappedBy="city1")
	private List<Route> routes1;

	//bi-directional many-to-one association to Route
	@OneToMany(mappedBy="city2")
	private List<Route> routes2;

	public City() {
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

	public Integer getCountryid() {
		return this.countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getProvinceid() {
		return this.provinceid;
	}

	public void setProvinceid(Integer provinceid) {
		this.provinceid = provinceid;
	}

	public List<Route> getRoutes1() {
		return this.routes1;
	}

	public void setRoutes1(List<Route> routes1) {
		this.routes1 = routes1;
	}

	public Route addRoutes1(Route routes1) {
		getRoutes1().add(routes1);
		routes1.setCity1(this);

		return routes1;
	}

	public Route removeRoutes1(Route routes1) {
		getRoutes1().remove(routes1);
		routes1.setCity1(null);

		return routes1;
	}

	public List<Route> getRoutes2() {
		return this.routes2;
	}

	public void setRoutes2(List<Route> routes2) {
		this.routes2 = routes2;
	}

	public Route addRoutes2(Route routes2) {
		getRoutes2().add(routes2);
		routes2.setCity2(this);

		return routes2;
	}

	public Route removeRoutes2(Route routes2) {
		getRoutes2().remove(routes2);
		routes2.setCity2(null);

		return routes2;
	}

}