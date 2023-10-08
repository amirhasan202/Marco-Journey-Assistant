package org.asena.marco.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String address;

	private Integer code;

	private Long creditcartnumber;

	@Column(name="\"identificationcardID\"")
	private Integer identificationcardID;

	private String name;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="customer")
	private List<Booking> bookings;

	//bi-directional many-to-one association to Customerstatus
	@OneToMany(mappedBy="customer")
	private List<Customerstatus> customerstatuses;

	public Customer() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Long getCreditcartnumber() {
		return this.creditcartnumber;
	}

	public void setCreditcartnumber(Long creditcartnumber) {
		this.creditcartnumber = creditcartnumber;
	}

	public Integer getIdentificationcardID() {
		return this.identificationcardID;
	}

	public void setIdentificationcardID(Integer identificationcardID) {
		this.identificationcardID = identificationcardID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setCustomer(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setCustomer(null);

		return booking;
	}

	public List<Customerstatus> getCustomerstatuses() {
		return this.customerstatuses;
	}

	public void setCustomerstatuses(List<Customerstatus> customerstatuses) {
		this.customerstatuses = customerstatuses;
	}

	public Customerstatus addCustomerstatus(Customerstatus customerstatus) {
		getCustomerstatuses().add(customerstatus);
		customerstatus.setCustomer(this);

		return customerstatus;
	}

	public Customerstatus removeCustomerstatus(Customerstatus customerstatus) {
		getCustomerstatuses().remove(customerstatus);
		customerstatus.setCustomer(null);

		return customerstatus;
	}

}