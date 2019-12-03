package com.jnu.domain;

public class PartyMember {
	/*
	 * 此处已于数据库中属性名对齐
	 * 
	 * */
	private String user_id;
	private String user_name;
	private String user_password;
	private String unit_id;
	private String user_phone;	
	private String user_idcard;
	private String activist_date;
	private String candidate_date;
	private Boolean is_prepared_member;
	private Integer lecture_score;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_idcard() {
		return user_idcard;
	}
	public void setUser_idcard(String user_idcard) {
		this.user_idcard = user_idcard;
	}
	public String getActivist_date() {
		return activist_date;
	}
	public void setActivist_date(String activist_date) {
		this.activist_date = activist_date;
	}
	public String getCandidate_date() {
		return candidate_date;
	}
	public void setCandidate_date(String candidate_date) {
		this.candidate_date = candidate_date;
	}
	public Boolean getIs_prepared_member() {
		return is_prepared_member;
	}
	public void setIs_prepared_member(Boolean is_prepared_member) {
		this.is_prepared_member = is_prepared_member;
	}
	public Integer getLecture_score() {
		return lecture_score;
	}
	public void setLecture_score(Integer lecture_score) {
		this.lecture_score = lecture_score;
	}
	@Override
	public String toString() {
		return "PartyMember [user_id=" + user_id + ", user_name=" + user_name + ", user_password=" + user_password
				+ ", unit_id=" + unit_id + ", user_phone=" + user_phone + ", user_idcard=" + user_idcard
				+ ", activist_date=" + activist_date + ", candidate_date=" + candidate_date + ", is_prepared_member="
				+ is_prepared_member + ", lecture_score=" + lecture_score + "]";
	}
	
	
}
