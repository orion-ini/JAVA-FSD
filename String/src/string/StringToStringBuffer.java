package string;
public class StringToStringBuffer 
{

	public static void main(String[] args) 
	{
		 StringBuffer sb = new StringBuffer();
		 
	        sb.append("Earth is the planet we live on.");
	 
	        sb.append("\nIt is the only planet in our Solar System with liquid water on its surface.");
	 
	        sb.append("\nIt is also the only planet we know to have life on it.");
	        	
	 
	        String str = sb.toString();
	 
	         System.out.println("conversion of " + " String to StringBuffer \n\n" + str);
	               

	}

}

