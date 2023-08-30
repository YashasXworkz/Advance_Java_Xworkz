package com.xworkz.sc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "city_info")
@SecondaryTables({ @SecondaryTable(name = "city_info2"), @SecondaryTable(name = "city_info3") })
@NamedQuery(name = "findByFamousPlace", query = "SELECT sc FROM SCEntity sc")
@NamedQuery(name = "deleteById", query = "DELETE FROM SCEntity sc WHERE sc.id=2")
public class SCEntity implements Serializable {
	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "c_name", table = "city_info2")
	private String cityName;

	@Column(name = "c_population", table = "city_info2")
	private long population;

	@Column(name = "c_mayor", table = "city_info2")
	private String mayor;

	@Column(name = "c_noOfLibraries", table = "city_info2")
	private int NoOfLibraries;

	@Column(name = "c_famousPlace", table = "city_info2")
	private String famousPlace;

	@Column(name = "c_noOfShopMalls", table = "city_info2")
	private int NoOfShoppingMalls;

	@Column(name = "c_cctvAvailability", table = "city_info3")
	private boolean isCCTVAvailable;

	@Column(name = "c_helplineNo", table = "city_info3")
	private long helplineNumber;

	@Column(name = "c_publicWifiAvailability", table = "city_info3")
	private boolean isPublicWifiAvailable;

	public SCEntity(String cityName, long population, String mayor, int noOfLibraries, String famousPlace,
			int noOfShoppingMalls, boolean isCCTVAvailable, long helplineNumber, boolean isPublicWifiAvailable) {
		super();
		this.cityName = cityName;
		this.population = population;
		this.mayor = mayor;
		NoOfLibraries = noOfLibraries;
		this.famousPlace = famousPlace;
		NoOfShoppingMalls = noOfShoppingMalls;
		this.isCCTVAvailable = isCCTVAvailable;
		this.helplineNumber = helplineNumber;
		this.isPublicWifiAvailable = isPublicWifiAvailable;
	}
}
