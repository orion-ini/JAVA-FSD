package exe;
class MyCustomException extends Exception  
{  
    
}  
    
public class CustomExceptions {

	public static void main(String[] args) {
		 try  
	        {  
	            // throw an object of user defined exception  
	            throw new MyCustomException();  
	        }  
	        catch (MyCustomException excep)  
	        {  
	            System.out.println("Caught the exception");  
	            System.out.println(excep.getMessage());  
	        }  
	  
	        System.out.println("Custom Exception implemented");    

	}

}
