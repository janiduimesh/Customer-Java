package com.newcontact;

public class customer {
	
	
	private  String id;
	private  String name;
	private  String phone;
	private  String email;
	private  String address;
	private  String cname;
	
	public customer(String id2,String name,String phone,String email,String address,String cname) {
		
		this.id=id2;
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.address=address;
		this.cname=cname;
		
		
	}
	
	public  String getid() {
		return id;
	}
	
	public  String getName() {
		return name;
	}
	
	public  String getPhone() {
		return phone;
	}
	
	public  String getEmail() {
		return email;
	}
	
	public  String getAddress() {
		return address;
	}
	
	public  String getCname() {
		return cname;
	}

}
