package com.kanbanboard.entity;

public class UserSingInDTO {
	private String email;
    private String pwd;
    
    public UserSingInDTO() {
		super();
	}
	
	public UserSingInDTO(String email, String pwd ) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
