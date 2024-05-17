package onkar.Core_Java_File_handling;

import java.io.File;

public class FilesMethod {
	public static void main(String args[]) {
		File fileObj = new File("D:/Edubridgeindia/DayToDay/Core_Java/src/onkar/Core_Java_File_handling/demo.txt");
        if (fileObj.exists()) {
            System.out.println("\nSpecified file path: " + fileObj.getAbsolutePath());
            System.out.println("\nIs the file Writable: " + fileObj.canWrite());
            // checking whether the file is Readable or not
            System.out.println("\nIs the file Readable " + fileObj.canRead());
            // retrieving file name
            System.out.println("\nFile name: " + fileObj.getName());
            // retrieving file size
            System.out.println("\nFile size (in bytes) " + fileObj.length());
            File fileDirObj = new File("D:/Edubridgeindia/DayToDay/Core_Java/src/onkar/Core_Java_File_handling");
            String[] fileList = fileDirObj.list();
            System.out.println("list of files available in the directory");
            // displaying here the list of files available in the directory
            for (int i = 0; i < fileList.length; i++) {
                System.out.print("\n" + fileList[i]);
            }
            System.out.println("\n");
        } else {
            System.out.println("Specified file does not exist.");
        }
		
	}

}
