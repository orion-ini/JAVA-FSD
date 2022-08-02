package string;
public class StringToStringBuilder 
{

	public static void main(String[] args) 
	{
		String strs[] = {"earth", "mars", "pluto", "Jupiter", "Saturn", "Neptune" };
	      StringBuilder sb = new StringBuilder();
	      sb.append(strs[0]);
	      sb.append(" "+strs[1]);
	      sb.append(" "+strs[2]);
	      sb.append(" "+strs[3]);
	      sb.append(" "+strs[4]);
	      sb.append(" "+strs[5]);
	      System.out.println(sb.toString());


	}

}
