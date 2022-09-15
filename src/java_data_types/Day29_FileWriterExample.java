package java_data_types;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day29_FileWriterExample {

	public static void main(String[] args) throws IOException {
		// Step 1 : Create an object of the file class
		File f = new File("C:\\Users\\noela\\eclipse-workspace\\Java_Basics\\data\\file.txt");
		// Step 2 : Create an object of the FileWriter class and pass the f object as an argument
		FileWriter fw = new FileWriter(f);
		//Step 3 : Use the fw object to write in the file
		fw.write("Hello, today we are learning fileWriter class");
		//adding a new line
		fw.write("\n");
		fw.write("Some more text.");
		//Step 4 : We have to make sure to close the file
		fw.close();
		

	}

}
