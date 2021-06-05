import java.io.*;
import java.util.*;
class Hello{

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new FileReader("inputs"));
		String name = reader.readLine();
		System.out.println(name);
		reader.close();


	}
}