package com.hibernate.mappings.entity;
// Generated Jun 9, 2023, 12:23:06 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "ravi")
public class Customer implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", unique = true, nullable = false)
	private long customerId;
	
	@OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
	
	private Address address;
	@Column(name = "customer_first_name")
	private String customerFirstName;
	@Column(name = "customer_last_name")
	private String customerLastName;
	@Column(name = "customer_number")
	private Long customerNumber;

	@Column(name = "customer_email")
	private String customerEmail;
	@Temporal(TemporalType.DATE)
	@Column(name = "customer_dob")
	private Date customerDob;
	@Column(name = "customer_gender")
	private String customerGender;
	@ManyToMany(cascade = CascadeType.ALL)

	private Set<Items> items = new HashSet<Items>(0);
	@OneToMany( mappedBy = "customer",cascade = CascadeType.ALL)
	
	private Set<OrdersTable> orders = new HashSet<OrdersTable>(0);

	public Customer() {
	}

	public Customer(long customerId) {
		this.customerId = customerId;
	}

	public Customer(long customerId, Address address, String customerFirstName, String customerLastName,
			Long customerNumber, String customerEmail, Date customerDob, String customerGender, Set<Items> items,
			Set<OrdersTable> orders) {
		this.customerId = customerId;
		this.address = address;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerNumber = customerNumber;
		this.customerEmail = customerEmail;
		this.customerDob = customerDob;
		this.customerGender = customerGender;
		this.items = items;
		this.orders = orders;
	}

	public long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCustomerFirstName() {
		return this.customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return this.customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public Long getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "customer_dob", length = 10)
	public Date getCustomerDob() {
		return this.customerDob;
	}

	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}

	public String getCustomerGender() {
		return this.customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public Set<Items> getItems() {
		return this.items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	public Set<OrdersTable> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<OrdersTable> orders) {
		this.orders = orders;
	}

}
