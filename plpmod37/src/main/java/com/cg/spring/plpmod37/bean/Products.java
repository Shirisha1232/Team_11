package com.cg.spring.plpmod37.bean;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int p_id;
	
	private String p_name;
	private String p_companyName;
	private BigDecimal p_price;
	private Date p_dateofmanufacturing;
	private String p_type;
	private int m_id;
	private int coupon_id;
	private  int quantity;
	public Products(int p_id, String p_name, String p_companyName, BigDecimal p_price, Date p_dateofmanufacturing,
			String p_type, int m_id, int coupon_id, int quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_companyName = p_companyName;
		this.p_price = p_price;
		this.p_dateofmanufacturing = p_dateofmanufacturing;
		this.p_type = p_type;
		this.m_id = m_id;
		this.coupon_id = coupon_id;
		this.quantity = quantity;
	}
	
public Products() {}

public int getP_id() {
	return p_id;
}

public void setP_id(int p_id) {
	this.p_id = p_id;
}

public String getP_name() {
	return p_name;
}

public void setP_name(String p_name) {
	this.p_name = p_name;
}

public String getP_companyName() {
	return p_companyName;
}

public void setP_companyName(String p_companyName) {
	this.p_companyName = p_companyName;
}

public BigDecimal getP_price() {
	return p_price;
}

public void setP_price(BigDecimal p_price) {
	this.p_price = p_price;
}

public Date getP_dateofmanufacturing() {
	return p_dateofmanufacturing;
}

public void setP_dateofmanufacturing(Date p_dateofmanufacturing) {
	this.p_dateofmanufacturing = p_dateofmanufacturing;
}

public String getP_type() {
	return p_type;
}

public void setP_type(String p_type) {
	this.p_type = p_type;
}

public int getM_id() {
	return m_id;
}

public void setM_id(int m_id) {
	this.m_id = m_id;
}

public int getCoupon_id() {
	return coupon_id;
}

public void setCoupon_id(int coupon_id) {
	this.coupon_id = coupon_id;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}  




  
}
