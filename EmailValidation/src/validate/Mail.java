package validate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class Mail
{
	public static boolean isValid(String email)
	{
		String er = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@" +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern em = Pattern.compile(er);
		if (email == null)
			return false;
		return em.matcher(email).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> val = new ArrayList<>();
			
		val.add("universe@gmail.com");
		val.add("verse@gmail.com ");
			
		for(String i : val){
			if (isValid(i))
				System.out.println(i + " - Yes");
			else
				System.out.println(i + " - No");
		}
	}
}


