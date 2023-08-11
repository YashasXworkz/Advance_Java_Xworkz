package com.xworkz.ganeshfest.dto;

import lombok.Data;

@Data
public class GaneshDTO {
	private int id;
	private float ganeshHeight;
	private int ganeshWeight;
	private String area;
	private String prasada;
	private boolean permissionGranted;
	private int noOfDays;
	private String poojariName;
}
