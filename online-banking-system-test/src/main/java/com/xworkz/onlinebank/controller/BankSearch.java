package com.xworkz.onlinebank.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.onlinebank.entity.CustomerEntity;

public class BankSearch {
	public static void main(String[] args) {
		System.out.println("Invoked Search main method");
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		String text;
		do {
			System.out.println("""
					Enter your choice:
					1. Get all details
					2. Get Customer details by id
					3. Get Customer details by accountType
					4. Get all details by online banking is active""");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				Query query = manager.createNamedQuery("findAll");
				List<CustomerEntity> list = query.getResultList();
				System.out.println(list);
				break;
			}
			case 2: {
				System.out.println("Enter id:");
				int id = sc.nextInt();
				Query query = manager.createNamedQuery("findById");
				query.setParameter("custId", id);
				Object result = query.getSingleResult();
				System.out.println(result);
				break;
			}
			case 3: {
				System.out.println("Enter accountType:");
				String accType = sc.next().toLowerCase();
				Query query = manager.createNamedQuery("findByAccountType");
				query.setParameter("accType", accType);
				List<CustomerEntity> list = query.getResultList();
				if (!list.isEmpty()) {
					System.out.println(list);
				} else {
					System.out.println("Account type not found");
				}
				break;
			}
			case 4: {
				System.out.println("Enter online banking status (active/inactive):");
				String onlineBankStatus = sc.next().toLowerCase();
				Query query = manager.createNamedQuery("findByOnlineBankingActive");
				query.setParameter("isActive", onlineBankStatus);
				List<CustomerEntity> list = query.getResultList();
				if (!list.isEmpty()) {
					System.out.println(list);
				} else {
					System.out.println("Online bank status not found");
				}
				break;
			}
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue: y/n");
			text = sc.next();
		} while (text.equalsIgnoreCase("y"));
		sc.close();
	}
}
