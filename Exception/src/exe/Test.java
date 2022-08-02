package exe;
import java.io.IOException;  
class Cosmic{  
 void method()throws IOException{  
  throw new IOException("An error has occured");  
 }  
}  
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{  
		     Cosmic m=new Cosmic();  
		     m.method();  
		    }catch(Exception e){System.out.println("exception handled");}     
		  
		    System.out.println("The earth is a very small stage in the Cosmic Arena. ");  

	}

}
