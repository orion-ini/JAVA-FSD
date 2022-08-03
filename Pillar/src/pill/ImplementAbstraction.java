package pill;
abstract class verse{  
	   verse(){System.out.println("Universe is created");}  
	   abstract void run();  
	   void time(){System.out.println("It was created with a BigBang");}  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class uni extends verse{  
	 void run(){System.out.println("The Universe is forever expanding");}  
	 }  
	public class ImplementAbstraction {

		public static void main(String[] args) {
			verse obj = new uni();  
			  obj.run();  
			  obj.time();  

		}

	}
