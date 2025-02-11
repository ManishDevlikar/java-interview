package com.interview_questionsandconcept.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Species species = new Species(1, "P.domesticus", "Animal");
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("species.txt"));
		outputStream.writeObject(species);
		System.out.println("object written on file " + species);

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("species.txt"));
		Species object = (Species) inputStream.readObject();
		System.out.println(object.getKingdom());
	}

}
