package pp1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set; 
public class Maps {

	public static void main(String[] args) 
	{
		 Map map=new HashMap();  
		   
		    map.put(1,"earth");  
		    map.put(2,"sky");  
		    map.put(3,"stars");  
		    map.put(4,"blackhole");  
		   
		    Set set=map.entrySet();
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		    Map.Entry entry=(Map.Entry)itr.next();     
		    System.out.println(entry.getKey()+" "+entry.getValue());  

          }
     }
}