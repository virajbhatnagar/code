import java.io.*;
import java.util.*;
class Hello{


	public static void printName(){
		System.out.println("Sherlock");
	}

	public static void main(String[] args) throws IOException{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println(name);
		reader.close();

		Hello.printName();


	}
}