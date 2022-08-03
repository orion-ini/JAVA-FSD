package operation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {

	

		File file = new File("/Users/universe/Desktop/cosmos.txt");
		Scanner scan = new Scanner(file);

		String fileContent = "The universe is a mystery";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter("/Users/universe/Desktop/cosmos.txt");
		writer.write(fileContent);
		writer.close();

	}

}
