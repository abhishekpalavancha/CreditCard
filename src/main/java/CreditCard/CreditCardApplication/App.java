package CreditCard.CreditCardApplication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Abhishek
 *
 */
public class App {
	static UserInformation run = new UserInformation();
	static Scanner inputscanner = new Scanner(System.in);
	static String input = "";

	public static void main(String[] args) {
		if (args.length > 0) {
			if (args.length == 1) {
				ProcessFilebyName(args[0]);
			} else {
				processInput(args);
			}
		}
		else {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			String line;

			try {
				while ((line = stdin.readLine()) != null && line.length() != 0 || stdin.ready()) {
					String[] input = line.split(" ");

					if (input[0].contains(("txt"))) {
						ProcessFilebyName(input[0]);
					} else {
						processInput(input);
					}
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				
			}
		}
		run.display();
	}
    
	//read file
	public static void ProcessFilebyName(String fileName) {
		try {
			FileInputStream fstream = new FileInputStream(fileName);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = null;
			while ((strLine = br.readLine()) != null) {
                //print file data
				run.formatInput(strLine);
			}
			in.close();

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void processInput(String[] input) {
		String inputToParse = new String();
		for (int i = 0; i < input.length; i++) {
			inputToParse = inputToParse + input[i] + " ";
			if (input[i].contains("$")) {
				run.formatInput(inputToParse);
				inputToParse = "";
			}

		}
	}
}
