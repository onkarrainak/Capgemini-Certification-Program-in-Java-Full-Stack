package com.hibernatemapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_11787") // table created automatically.
public class School {
	@Id // primary key.
	@GeneratedValue(strategy = GenerationType.AUTO) // id auto genrated.
	private int id;
	private String name;
	private String city;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "school [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public School(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
}