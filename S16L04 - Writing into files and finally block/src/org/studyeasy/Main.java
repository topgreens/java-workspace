package org.studyeasy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		{
			File file = new File("studyeasy");
			file.mkdir();
			file = new File("studyeasy\\team.txt");
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			   bw.write("Chaand");	
			   bw.newLine();
			   bw.write("Shabaz");
			   bw.newLine();
			   bw.write("Salim");
			   bw.newLine();
			   bw.write("Praful");
			   bw.newLine();
			   bw.write("Aarti");
			   System.out.println("Wrting onto the file completed");
			  
				
			} catch (IOException e) {
				System.out.println("error occured, while creating writing onto file");
			}
			
			
		}
	}
}
