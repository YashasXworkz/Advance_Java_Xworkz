package com.xworkz.onlinebank.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.onlinebank.entity.CustomerEntity;

public class BankInsert {
	public static void main(String[] args) {
		System.out.println("Invoked Insert main method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println(factory);
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		CustomerEntity custEntity = new CustomerEntity("Yashas", "S", "yashas@gmail.com", 7765486633L,
				LocalDate.of(2000, 04, 22), 35000.00, "Bengaluru", "BSc", "A+", 1234567890L, "Savings", "Active");
		System.out.println(custEntity);
		manager.persist(custEntity);
		manager.getTransaction().commit();
		manager.clear();
	}
}
