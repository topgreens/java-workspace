package org.studyeasy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("Car", 4268);
		
		try(FileOutputStream fos = new FileOutputStream("studyeasy\\vehicles.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the file");
			}

		} catch (FileNotFoundException e) {
			System.out.println("ileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}

	}

}
