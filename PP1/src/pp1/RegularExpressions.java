package pp1;
import java.util.regex.Pattern;
public class RegularExpressions 
{

	public static void main(String[] args) 
	{
		
		System.out.println(Pattern.matches("unive*se", "universe"));

        System.out.println(Pattern.matches("ast*ophy*ics", "astro"));

	}

}