package com.capg.boot.ShippingDetailsBoot.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShippingDetails {

	@Id
	@Column(name="orderId")
	private int orderId;
	@Column(name="fullName")
	private String fullName;
	private String email;
	@Column(name="contactNo")
	private String contactNo;
	private String pincode;
	@Column(name="buildingName")
	private String buildingName;
	private String area;
	private String landmark;
	private String city;
	private String state;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ShippingDetails(int orderId, String fullName, String email,
			String contactNo, String pincode, String buildingName, String area,
			String landmark, String city, String state) {
		super();
		/* this.orderId = orderId; */
		this.fullName = fullName;
		this.email = email;
		this.contactNo = contactNo;
		this.pincode = pincode;
		this.buildingName = buildingName;
		this.area = area;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
	}

	public ShippingDetails() {

	}

	@Override
	public String toString() {
		return "ShippingDetails [orderId=" + orderId + ", fullName=" + fullName
				+ ", email=" + email + ", contactNo=" + contactNo
				+ ", pincode=" + pincode + ", buildingName=" + buildingName
				+ ", area=" + area + ", landmark=" + landmark + ", city="
				+ city + ", state=" + state + "]";
	}

}
