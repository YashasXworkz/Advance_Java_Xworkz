package com.xworkz.fileoper;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTO implements Serializable {
	private String name;
	private int age;
	private String gender;
}
