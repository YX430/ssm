package com.jnu.domain;

public class PartyManager {
	/*
	 * 此处已于数据库中属性名对齐
	 * 
	 * */
	private String manager_id;
	private String manager_name;
	private String manager_password;
	private String unit_id;
	private String manager_phone;
	
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_password() {
		return manager_password;
	}
	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}
	public String getManager_phone() {
		return manager_phone;
	}
	public void setManager_phone(String manager_phone) {
		this.manager_phone = manager_phone;
	}
	
	@Override
	public String toString() {
		return "PartyManager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", manager_password=" + manager_password
				+ ", unit_id=" + unit_id + ", manager_phone=" + manager_phone +  "]";
	}
	
	
}
