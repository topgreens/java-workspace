package org.studyeasy;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		{
			File directory = new File("c:\\studyeasy\\author\\chaand");
			directory.mkdirs();
			System.out.println("directory created");
			File file = new File("c:\\studyeasy\\author\\chaand\\test.txt");
			file.createNewFile();
			System.out.println("File created");
			
		}
	}
}
