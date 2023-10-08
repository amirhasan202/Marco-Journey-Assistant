package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the presenter database table.
 * 
 */
@Entity
@NamedQuery(name="Presenter.findAll", query="SELECT p FROM Presenter p")
public class Presenter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	private Integer contractid;

	private Integer identificationid;

	private String name;

	private Integer typeid;

	//bi-directional many-to-one association to Trip
	@OneToMany(mappedBy="presenter")
	private List<Trip> trips;

	public Presenter() {
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

	public Integer getContractid() {
		return this.contractid;
	}

	public void setContractid(Integer contractid) {
		this.contractid = contractid;
	}

	public Integer getIdentificationid() {
		return this.identificationid;
	}

	public void setIdentificationid(Integer identificationid) {
		this.identificationid = identificationid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	public Trip addTrip(Trip trip) {
		getTrips().add(trip);
		trip.setPresenter(this);

		return trip;
	}

	public Trip removeTrip(Trip trip) {
		getTrips().remove(trip);
		trip.setPresenter(null);

		return trip;
	}

}