package com.sahil.java.InterviewQuestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author sahil
 * 
 */
public class Serialization implements Serializable {

	private static final String File_Location = "G:/Serialization/serialization.txt";

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		String text = "Hi I am Sahil";

		FileOutputStream fos = new FileOutputStream(File_Location);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(text);
		System.out.println("writing success...");
		readObject();
	}

	/**
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static void readObject() throws IOException, ClassNotFoundException {

		FileInputStream FIS = new FileInputStream(File_Location);
		ObjectInputStream OIS = new ObjectInputStream(FIS);

		String data = (String) OIS.readObject();
		System.out.println("reading success.." + data);

	}
}
