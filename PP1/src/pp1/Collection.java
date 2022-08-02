package pp1;
import java.util.ArrayList;
import java.util.Iterator;  
public class Collection
{

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("star"); 
		list.add("earth");  
		list.add("sun");  
		list.add("moon");  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
}  