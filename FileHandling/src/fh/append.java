package fh;
import java.io.*;

class append{


	public static void appendStrToFile(String fileName,
									String str)
	{
	
		try {

			
			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName, true));

		
			out.write(str);
		
			out.close();
		}

	
		catch (IOException e) {

			System.out.println("exception occurred" + e);
		}
	}

	
	public static void main(String[] args) throws Exception
	{
		
		String fileName = "Cosmos.txt";

	
		try {

			
			BufferedWriter out = new BufferedWriter(
				new FileWriter(fileName));

		
			out.write("THE UNIVERSE IS VAST :\n");

	
			out.close();
		}


		catch (IOException e) {

	
			System.out.println("Exception Occurred" + e);
		}

		
		String str = "The earth and humans are a tiny spec amongst trillios of stars and other life forms which exists";

	
		appendStrToFile(fileName, str);


		try {
			BufferedReader in = new BufferedReader(
				new FileReader("Cosmos.txt"));

			String mystring;

		
			while ((mystring = in.readLine()) != null) {
				System.out.println(mystring);
			}
		}

		
		catch (IOException e) {
			System.out.println("Exception Occurred" + e);
		}
	}
}

