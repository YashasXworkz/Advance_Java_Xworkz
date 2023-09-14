package com.xworkz.tourism.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tour_info")
@Data
@NoArgsConstructor
@NamedQueries({ @NamedQuery(name = "countAll", query = "SELECT COUNT(te) FROM TourismEntity te"),
		@NamedQuery(name = "getAll", query = "SELECT te FROM TourismEntity te") })
public class TourismEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Long phoneNo;
	private String places;
	private Long aadhaarNo;
	private String pan;
	private Integer age;
}
