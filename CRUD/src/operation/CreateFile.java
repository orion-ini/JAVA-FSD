package operation;
import java.io.IOException;  
import java.nio.file.*; 
public class CreateFile {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\creation\\code.txt"); 
		try   
		{  
		Path p= Files.createFile(path);   
		System.out.println("File Created at Path: "+p);  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();

	}

}
}