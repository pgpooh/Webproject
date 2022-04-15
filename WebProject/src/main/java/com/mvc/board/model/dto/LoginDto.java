package com.mvc.board.model.dto;

public class LoginDto {
	private int mb_index_no;
	private String mb_id;
	private String mb_name;
	private String mb_flag;
	private String mb_brith;
	private String mb_pw;
	private String mb_email;
	private String mb_phone;
	
	public LoginDto() {
		super();
	}
	public LoginDto(int mb_index_no, String mb_id, String mb_name, String mb_flag, String mb_brith, String mb_pw,String mb_email,String mb_phone) {
		
		super();
		this.mb_index_no = mb_index_no;
		this.mb_id = mb_id;
		this.mb_name = mb_name;
		this.mb_flag = mb_flag;
		this.mb_brith = mb_brith;
		this.mb_pw = mb_pw;
		this.mb_email = mb_email;
		this.mb_phone = mb_phone;
		
	}
	public int getMb_index_no() {
		return mb_index_no;
	}
	public void setMb_index_no(int mb_index_no) {
		this.mb_index_no = mb_index_no;
	}
	
	public String getMb_id() {
		return mb_id;
	}
	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}
	
	public String getMb_name() {
		return mb_name;
	}
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	
	public String getMb_flag() {
		return mb_flag;
	}
	public void setMb_flag(String mb_flag) {
		this.mb_flag = mb_flag;
	}
	
	public String getMb_brith() {
		return mb_brith;
	}
	public void setMb_brith(String mb_brith) {
		this.mb_brith = mb_brith;
	}
	public String getMb_pw() {
		return mb_pw;
	}
	public void setMb_pw(String mb_pw) {
		this.mb_pw = mb_pw;
	}
	
	public String getMb_email() {
		return mb_email;
	}
	public void setMb_email(String mb_email) {
		this.mb_email = mb_email;
	}
	
	public String getMb_phone() {
		return mb_phone;
	}
	public void setMb_phone(String mb_phone) {
		this.mb_phone = mb_phone;
	}
}
