package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the routedifficulty database table.
 * 
 */
@Entity
@NamedQuery(name="Routedifficulty.findAll", query="SELECT r FROM Routedifficulty r")
public class Routedifficulty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	//bi-directional many-to-one association to Route
	@OneToMany(mappedBy="routedifficulty")
	private List<Route> routes;

	public Routedifficulty() {
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

	public List<Route> getRoutes() {
		return this.routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

	public Route addRoute(Route route) {
		getRoutes().add(route);
		route.setRoutedifficulty(this);

		return route;
	}

	public Route removeRoute(Route route) {
		getRoutes().remove(route);
		route.setRoutedifficulty(null);

		return route;
	}

}