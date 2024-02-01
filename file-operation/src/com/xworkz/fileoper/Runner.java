package com.xworkz.fileoper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Invoked main method");
		DTO dto = new DTO("Yashas", 23, "male");

		FileOutputStream f = new FileOutputStream("myObjects.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);

		o.writeObject(dto);
		System.out.println("Success");

		FileInputStream fi = new FileInputStream("myObjects.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);

		DTO dto2 = (DTO) oi.readObject();
		System.out.println(dto2);
	}
}
