package com.callor.app.exec;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exec08 {
	
	public static void main(String[] args) throws IOException {
		String filename = "src/com/callor/app/exec/data.txt";
		InputStream is = new FileInputStream(filename);
		Scanner scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		scan.close();
		is.close();
	}
}
