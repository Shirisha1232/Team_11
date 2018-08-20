package com.capg.boot.delivery.bean;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class ProductStatus {
	
	@Id
	private int pid;
	private String pstatus;
	private int quantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ProductStatus(int pid, String pstatus, int quantity) {
		super();
		this.pid = pid;
		this.pstatus = pstatus;
		this.quantity = quantity;
	}
	public ProductStatus() {
		
	}
	@Override
	public String toString() {
		return "ProductStatus [pid=" + pid + ", pstatus=" + pstatus + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
