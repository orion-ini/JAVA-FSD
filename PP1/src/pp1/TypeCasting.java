package pp1;
public class TypeCasting 
{
    public static void main(String[] args) 
	{
    	    //implicit type casting 
    	    int MGC = 4;
    	    double AN = MGC; // Implicit casting: int to double
            System.out.println(MGC);
    	 	System.out.println(AN);

    	 	//explicit type casting 
    	 	 double IAF = 9.99;
    	     int IA = (int) IAF; // Explicit casting: double to int
             System.out.println(IAF);
    	     System.out.println(IA);
	}

}

