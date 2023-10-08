package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the trip database table.
 * 
 */
@Entity
@NamedQuery(name="Trip.findAll", query="SELECT t FROM Trip t")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Time begeningtime;

	@Temporal(TemporalType.DATE)
	private Date biginingdate;

	private Integer code;

	@Temporal(TemporalType.DATE)
	private Date completiondate;

	private Time completiontime;

	private Integer duration;

	private Integer durationunitid;

	private String name;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="trip")
	private List<Ticket> tickets;

	//bi-directional many-to-one association to Presenter
	@ManyToOne
	@JoinColumn(name="presenterid")
	private Presenter presenter;

	//bi-directional many-to-one association to Route
	@ManyToOne
	@JoinColumn(name="routid")
	private Route route;

	//bi-directional many-to-one association to Triptype
	@ManyToOne
	@JoinColumn(name="typeid")
	private Triptype triptype;

	//bi-directional many-to-one association to Tripvehicletype
	@ManyToOne
	@JoinColumn(name="vehicletypeid")
	private Tripvehicletype tripvehicletype;

	public Trip() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Time getBegeningtime() {
		return this.begeningtime;
	}

	public void setBegeningtime(Time begeningtime) {
		this.begeningtime = begeningtime;
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

	public Date getCompletiondate() {
		return this.completiondate;
	}

	public void setCompletiondate(Date completiondate) {
		this.completiondate = completiondate;
	}

	public Time getCompletiontime() {
		return this.completiontime;
	}

	public void setCompletiontime(Time completiontime) {
		this.completiontime = completiontime;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getDurationunitid() {
		return this.durationunitid;
	}

	public void setDurationunitid(Integer durationunitid) {
		this.durationunitid = durationunitid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setTrip(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setTrip(null);

		return ticket;
	}

	public Presenter getPresenter() {
		return this.presenter;
	}

	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Triptype getTriptype() {
		return this.triptype;
	}

	public void setTriptype(Triptype triptype) {
		this.triptype = triptype;
	}

	public Tripvehicletype getTripvehicletype() {
		return this.tripvehicletype;
	}

	public void setTripvehicletype(Tripvehicletype tripvehicletype) {
		this.tripvehicletype = tripvehicletype;
	}

}