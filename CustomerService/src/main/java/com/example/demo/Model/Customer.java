package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer
{
	@Id 
	private String cid;
	private String cname;
	private String cemail;
	private String cpass;
	private String ccpass;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public String getCcpass() {
		return ccpass;
	}
	public void setCcpass(String ccpass) {
		this.ccpass = ccpass;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cpass=" + cpass + ", ccpass="
				+ ccpass + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cid, String cname, String cemail, String cpass, String ccpass) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.cpass = cpass;
		this.ccpass = ccpass;
	}
	
	

}
