package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {

	public static String readString() {
		String str = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
		}
		return str;
	}

	public static Integer readInteger() {
		Integer inp = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			inp = Integer.parseInt(br.readLine());
		} catch (Exception ioe) {
			System.out.println("IO error trying to read your name!");
		}
		return inp;
	}
}
