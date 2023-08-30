package com.xworkz.isro.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.isro.entity.IsroEntity;

public class IsroDelete {
	public static void main(String[] args) {
		System.out.println("Invoked main method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		IsroEntity entity = manager.find(IsroEntity.class, 1);
		System.out.println(entity);

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(entity);
		transaction.commit();
		manager.close();
	}
}
