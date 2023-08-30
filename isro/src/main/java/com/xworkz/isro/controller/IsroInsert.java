package com.xworkz.isro.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.isro.entity.IsroEntity;

public class IsroInsert {
	public static void main(String[] args) {
		System.out.println("Invoked main method");
		IsroEntity isro1 = new IsroEntity("sivan", 1969, "bengaluru", 15, "Mangalyaan", "isro", "sept 24", "GSLV Mk III",
				"Chandrayaan-3");
		IsroEntity isro2 = new IsroEntity("kiran kumar", 1972, "thiruvananthapuram", 10, "Chandrayaan-1", "isro", "jul 2",
				"PSLV-C37", "Aditya-L1");
		IsroEntity isro3 = new IsroEntity("madhavan nair", 1980, "mumbai", 20, "Chandrayaan-2", "isro", "oct 22", "GSLV Mk II",
				"Gaganyaan");
		IsroEntity isro4 = new IsroEntity("radhakrishnan", 1990, "delhi", 25, "INSAT-3DR", "isro", "dec 11", "PSLV-C45",
				"Shukrayaan-1");
		IsroEntity isro5 = new IsroEntity("satheesh reddy", 1995, "chennai", 30, "GSAT-7A", "isro", "apr 1", "GSLV Mk III",
				"Mars Orbiter Mission 2");
		IsroEntity isro6 = new IsroEntity("kailasavadivoo sivan", 2000, "hyderabad", 35, "GSAT-29", "isro", "may 15", "PSLV-C46",
				"NISAR");
		IsroEntity isro7 = new IsroEntity("kiran kumar", 2005, "kolkata", 40, "RISAT-2B", "isro", "aug 8", "GSLV Mk II",
				"Astrosat-2");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(isro1);
		manager.persist(isro2);
		manager.persist(isro3);
		manager.persist(isro4);
		manager.persist(isro5);
		manager.persist(isro6);
		manager.persist(isro7);
		transaction.commit();
		manager.close();
	}
}
