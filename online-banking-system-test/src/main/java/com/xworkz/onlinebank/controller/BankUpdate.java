package com.xworkz.onlinebank.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.onlinebank.entity.CustomerEntity;

public class BankUpdate {
	public static void main(String[] args) {
		System.out.println("Invoked Update main method");
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		System.out.println("Enter existing email to update: ");
		String existingEmail = sc.next();
		Query query = manager.createNamedQuery("updateDetailsByEmail");
		query.setParameter("email", existingEmail);
		List<CustomerEntity> result = query.getResultList();
		System.out.println("----------Before Update----------");
		System.out.println(result);

		if (!result.isEmpty()) {
			for (CustomerEntity cu : result) {
				CustomerEntity en = manager.find(CustomerEntity.class, cu.getId());
				en.setContactNumber(5546736533L);
				en.setAnnualIncome(75000.00);
				en.setAddress("india");
			}
			manager.getTransaction().commit();
		}
		System.out.println("----------After Update----------");
		System.out.println(result);
		sc.close();
	}
}
