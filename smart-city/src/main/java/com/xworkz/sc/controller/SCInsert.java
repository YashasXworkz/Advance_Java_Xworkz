package com.xworkz.sc.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.sc.entity.SCEntity;

public class SCInsert {
	public static void main(String[] args) {
		System.out.println("Invoked main method");
		SCEntity scEntity = new SCEntity("Bengaluru", 14608000L, "M Gautham Kumar", 466, "Lalbagh", 25, true, 100, false);
		SCEntity scEntity2 = new SCEntity("Mysore", 1365000L, "Shivakumar", 249, "Mysore Palace", 6, true, 100, false);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(scEntity);
		manager.persist(scEntity2);
		transaction.commit();
		manager.close();
	}
}
