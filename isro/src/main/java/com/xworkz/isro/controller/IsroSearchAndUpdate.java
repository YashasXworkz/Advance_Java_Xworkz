package com.xworkz.isro.controller;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.isro.entity.IsroEntity;

public class IsroSearchAndUpdate {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		IsroEntity entity = manager.find(IsroEntity.class, 3);

		if (entity != null) {
			EntityTransaction transaction = manager.getTransaction();
			System.out.println("----------Before--------------");
			System.out.println(entity);
			transaction.begin();
			entity.setChairman("madhavan nair");
			entity.setNoOfCentre(25);
			System.out.println("----------After---------------");
			System.out.println(entity);
			manager.merge(entity);
			transaction.commit();
			manager.close();
		} else {
			System.out.println("entity is null");
		}
	}
}
