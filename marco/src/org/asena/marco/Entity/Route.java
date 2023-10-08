package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the route database table.
 * 
 */
@Entity
@NamedQuery(name="Route.findAll", query="SELECT r FROM Route r")
public class Route implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String description;

	private String destination;

	private Long length;

	private String name;

	private String origin;

	private Long routecode;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name="destinationcityid")
	private City city1;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name="origincityid")
	private City city2;

	//bi-directional many-to-one association to Routedifficulty
	@ManyToOne
	@JoinColumn(name="difficultyid")
	private Routedifficulty routedifficulty;

	//bi-directional many-to-one association to Routetype
	@ManyToOne
	@JoinColumn(name="typeid")
	private Routetype routetype;

	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="route")
	private List<Ticket> tickets;

	//bi-directional many-to-one association to Trip
	@OneToMany(mappedBy="route")
	private List<Trip> trips;

	public Route() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Long getLength() {
		return this.length;
	}

	public void setLength(Long length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Long getRoutecode() {
		return this.routecode;
	}

	public void setRoutecode(Long routecode) {
		this.routecode = routecode;
	}

	public City getCity1() {
		return this.city1;
	}

	public void setCity1(City city1) {
		this.city1 = city1;
	}

	public City getCity2() {
		return this.city2;
	}

	public void setCity2(City city2) {
		this.city2 = city2;
	}

	public Routedifficulty getRoutedifficulty() {
		return this.routedifficulty;
	}

	public void setRoutedifficulty(Routedifficulty routedifficulty) {
		this.routedifficulty = routedifficulty;
	}

	public Routetype getRoutetype() {
		return this.routetype;
	}

	public void setRoutetype(Routetype routetype) {
		this.routetype = routetype;
	}

	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setRoute(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setRoute(null);

		return ticket;
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	public Trip addTrip(Trip trip) {
		getTrips().add(trip);
		trip.setRoute(this);

		return trip;
	}

	public Trip removeTrip(Trip trip) {
		getTrips().remove(trip);
		trip.setRoute(null);

		return trip;
	}

}