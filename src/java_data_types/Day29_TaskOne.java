package java_data_types;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day29_TaskOne {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\noela\\eclipse-workspace\\Java_Basics\\data\\Day29_Task1.txt");
		FileWriter fw = new FileWriter(f);
		System.out.println("Please enter some text and i will save it to a file");
		Scanner a = new Scanner(System.in);
		String userInput = a.next();
		fw.write(userInput);
		fw.close();

	}

}
