package entities;

import java.util.Set;

public class Region {
	private int id;
	private String name;
	private Set<Country> countries;
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
	public Set<Country> getCountries() {
		return countries;
	}
	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}
	
	

}
