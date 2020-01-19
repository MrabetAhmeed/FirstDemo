package tn.educanet.firstdemo.persistence;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private int age;
	
	private String barreCode;
	
	private String adresse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBarreCode() {
		return barreCode;
	}

	public void setBarreCode(String barreCode) {
		this.barreCode = barreCode;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
