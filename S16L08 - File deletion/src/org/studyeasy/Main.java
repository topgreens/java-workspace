package org.studyeasy;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("studyeasy\\team.txt");
		if(file.delete()){
			System.out.println("Deletion is succussful");
		}else{
			System.out.println("Error while deleting");
		}

	}
}
