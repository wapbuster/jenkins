package com.example.docker.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "countries")
public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4028050265053668507L;

	@Id
	@Column(name = "country_id")
	@Size(max = 2, message = "Country Id can be only 2 chars")
	private String country_id;

	@Column(name = "country_name")
	private String country_name;

	@Column(name = "region_id")
	private Integer region_id;

	public Country() {
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
}