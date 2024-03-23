package kr.co.sist.day0320;

import java.sql.Date;

public class LoginResultVO {
	
	private String name;
	private Date input_date;
	
	public LoginResultVO() {
	}

	public LoginResultVO(String name, Date input_date) {
		this.name = name;
		this.input_date = input_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getInput_date() {
		return input_date;
	}

	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}

	@Override
	public String toString() {
		return "LoginResultVO [name=" + name + ", input_date=" + input_date + "]";
	}

}	// class