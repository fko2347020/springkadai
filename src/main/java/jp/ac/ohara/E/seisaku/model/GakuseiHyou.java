package jp.ac.ohara.E.seisaku.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="gakuseihyou")
public class GakuseiHyou {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column(length = 64, nullable = false)
	private String studentnumber;
	
	@Column(length = 128, nullable = false)
	private String name;
	
	@Column(length = 32, nullable = false)
	private String age;
	
	@Column(length = 128, nullable = false)
	private String mail;
	
	@Column(length = 64, nullable = true)
	private String phone;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getstudentnumber() {
		return studentnumber;
	}
	
	public void setstudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getage() {
		return age;
	}
	
	public void setage(String age) {
		this.age = age;
	}
	
	public String getmail() {
		return mail;
	}
	
	public void setmail(String mail) {
		this.mail = mail;
	}
	
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
}
