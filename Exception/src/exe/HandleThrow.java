package exe;
public class HandleThrow {
	  
    public static void validate(int age) {  
        if(age<18) {  
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("I like Astrophysics");    
        }  
        else {  
            System.out.println("I dont like Astrophysics");  
        }  
    }  
    //main method  
    public static void main(String args[]){  
        //calling the function  
        validate(13);  
        System.out.println("throw is implemented");    
  }    
}    