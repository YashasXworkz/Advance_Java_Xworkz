package com.xworkz.sc.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.sc.entity.SCEntity;

public class SCSearchAndUpdate {
	public static void main(String[] args) {
		System.out.println("Invoked main method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		SCEntity entity = manager.find(SCEntity.class, 1);
		transaction.begin();

		if (entity != null) {
			entity.setFamousPlace("Iskcon Temple");
			entity.setPublicWifiAvailable(true);
			manager.merge(entity);
			System.out.println("Updated");
		} else {
			System.out.println("entity is null");
		}
		transaction.commit();
		manager.close();
	}
}
