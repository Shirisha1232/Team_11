package com.capg.boot.delivery.bean;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Products {
	
	@Id
	private int pid;
    private String pname;
    private BigDecimal price;
	private int quantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Products(int pid, String pname, BigDecimal price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Products() {
		
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	

}
