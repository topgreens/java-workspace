package org.studyeasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
			   bw.close();
				
			} catch (IOException e) {
				System.out.println("error occured, while creating writing onto file");
			}
			
			try {
				BufferedReader br = new BufferedReader(new FileReader("studyeasy\\team.txt"));
				String line;
				System.out.println("***********************");
				while((line = br.readLine()) != null){
					System.out.println(line);
				}
				br.close();
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFoundException");
			} catch (IOException e) {
				System.out.println("IOException");
			}
			
		}
	}
}
