package main.java.com.xworkz.airpods.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "airpods")
@Entity
@NoArgsConstructor
@NamedQuery(name = "deleteByPrice", query = "DELETE FROM AirpodsDto dto WHERE dto.price=:pr")
@NamedQuery(name = "updateColorbyName", query = "UPDATE AirpodsDto dto SET dto.color=:col WHERE dto.brandName=:nm")
@NamedQuery(name = "readAll", query = "SELECT dto FROM AirpodsDto dto")
public class AirpodsDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brandName;
	private int price;
	private String color;
	private int batteryBackup;

	public AirpodsDto(String brandName, int price, String color, int batteryBackup) {
		this.brandName = brandName;
		this.price = price;
		this.color = color;
		this.batteryBackup = batteryBackup;
	}
}
