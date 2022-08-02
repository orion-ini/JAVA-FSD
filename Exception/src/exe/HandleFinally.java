package exe;
public class HandleFinally {

	public static void main(String[] args) {
		try{    
		       int verse=13/1;    
			   System.out.println(verse);    
			  }    

			  catch(NullPointerException e){  
			System.out.println(e);  
			}    
			 finally {  
			System.out.println("finally block is always executed");  
			}    
			    
			System.out.println("Finally implemented");   
		
	}

}
