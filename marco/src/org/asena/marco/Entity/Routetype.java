package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the routetype database table.
 * 
 */
@Entity
@NamedQuery(name="Routetype.findAll", query="SELECT r FROM Routetype r")
public class Routetype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Long code;

	private String routename;

	//bi-directional many-to-one association to Route
	@OneToMany(mappedBy="routetype")
	private List<Route> routes;

	public Routetype() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getRoutename() {
		return this.routename;
	}

	public void setRoutename(String routename) {
		this.routename = routename;
	}

	public List<Route> getRoutes() {
		return this.routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public Route addRoute(Route route) {
		getRoutes().add(route);
		route.setRoutetype(this);

		return route;
	}

	public Route removeRoute(Route route) {
		getRoutes().remove(route);
		route.setRoutetype(null);

		return route;
	}

}