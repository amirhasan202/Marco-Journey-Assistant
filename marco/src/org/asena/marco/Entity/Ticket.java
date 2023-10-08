package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ticket database table.
 * 
 */
@Entity
@NamedQuery(name="Ticket.findAll", query="SELECT t FROM Ticket t")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer code;

	private double cost;

	private Integer duration;

	private Integer durationunitid;

	private String name;

	@Temporal(TemporalType.DATE)
	private Date remainingcapacity;

	private Integer totalcapacity;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="ticket")
	private List<Booking> bookings;

	//bi-directional many-to-one association to Classification
	@ManyToOne
	@JoinColumn(name="classificationid")
	private Classification classification;

	//bi-directional many-to-one association to Currency
	@ManyToOne
	@JoinColumn(name="currencyid")
	private Currency currency;

	//bi-directional many-to-one association to Paymentmethod
	@ManyToOne
	@JoinColumn(name="paymentmethodsid")
	private Paymentmethod paymentmethod;

	//bi-directional many-to-one association to Returnrule
	@ManyToOne
	@JoinColumn(name="returningruleid")
	private Returnrule returnrule;

	//bi-directional many-to-one association to Route
	@ManyToOne
	@JoinColumn(name="routeid")
	private Route route;

	//bi-directional many-to-one association to Trip
	@ManyToOne
	@JoinColumn(name="tripid")
	private Trip trip;

	public Ticket() {
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

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
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

	public Date getRemainingcapacity() {
		return this.remainingcapacity;
	}

	public void setRemainingcapacity(Date remainingcapacity) {
		this.remainingcapacity = remainingcapacity;
	}

	public Integer getTotalcapacity() {
		return this.totalcapacity;
	}

	public void setTotalcapacity(Integer totalcapacity) {
		this.totalcapacity = totalcapacity;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setTicket(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setTicket(null);

		return booking;
	}

	public Classification getClassification() {
		return this.classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Paymentmethod getPaymentmethod() {
		return this.paymentmethod;
	}

	public void setPaymentmethod(Paymentmethod paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public Returnrule getReturnrule() {
		return this.returnrule;
	}

	public void setReturnrule(Returnrule returnrule) {
		this.returnrule = returnrule;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Trip getTrip() {
		return this.trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

}