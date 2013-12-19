package tw.elliot.model;

import java.util.Date;

public class User {
	private String id;
	private String name;
	private String phone;
	private Date birthday;
	public User() {
		super();
	}
	
	public User(String id, String name, String phone) {
		this(id, name, phone, new Date());
	}
	
	public User(String id, String name, String phone, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.birthday = birthday;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
