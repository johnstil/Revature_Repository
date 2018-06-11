package question20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DataFileDemo {

	public static void main(String[] args) {
		String file;
		String string;
		String[] subString;
		
		file = "Data.txt";
		
		try(FileWriter fr = new FileWriter(file)){
			string = "Mickey:Mouse:35:Arizona\r\n";
			string += "Hulk:Hogan:50:Virginia\r\n";
			string += "Roger:Rabbit:22:California\r\n";
			string += "Wonder:Woman:18:Montana\r\n";
			fr.write(string);
		}catch(IOException exc) {
			System.out.println("I/O Exception found!!");
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			subString = br.readLine().split(":");
			System.out.println("Name: " + subString[0] + " " + subString[1]);
			System.out.println("Age: " + subString[2]);
			System.out.println("State: " + subString[3] + " State");
		}catch(IOException exc) {
			System.out.println("I/O Exception found!!");
		}
	}

}
