package com.xworkz.isro.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "isro_info")
@NamedQuery(name = "findAll", query = "SELECT en FROM IsroEntity en")
@NamedQuery(name = "findById", query = "SELECT en FROM IsroEntity en WHERE id=:id")
@NamedQuery(name = "updateChairmanByHeadQuarter", query = "UPDATE IsroEntity en SET en.chairman=:chairman WHERE en.headquarter=:headquarter")
@NamedQuery(name = "deleteById", query = "DELETE FROM IsroEntity en WHERE en.id=:id")
public class IsroEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String chairman;
	private int established;
	private String headquarter;
	private int noOfCentre;
	private String satelliteName;
	private String spaceStation;
	private String spaceDay;
	private String launchVehicle;
	private String upcomingMission;

	public IsroEntity(String chairman, int established, String headquarter, int noOfCentre, String satelliteName,
			String spaceStation, String spaceDay, String launchVehicle, String upcomingMission) {
		this.chairman = chairman;
		this.established = established;
		this.headquarter = headquarter;
		this.noOfCentre = noOfCentre;
		this.satelliteName = satelliteName;
		this.spaceStation = spaceStation;
		this.spaceDay = spaceDay;
		this.launchVehicle = launchVehicle;
		this.upcomingMission = upcomingMission;
	}
}
