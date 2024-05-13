package onkar.Core_Java_File_handling;

import java.io.File;
import java.io.IOException;

public class Files_Exp {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/Edubridgeindia/DayToDay/Core_Java/src/onkar/Core_Java_File_handling/demo3.txt");
		if (file.createNewFile()) {
			System.out.println("File Created.");
		} else {
			System.out.println("File exists...");
		}
	}

}
