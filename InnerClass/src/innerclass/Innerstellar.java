package innerclass;
import innerclass.Outside.Inside;

class Outside
{
	int a = 0;
	class Inside
	{
		int b = 1;
	}
}
public class Innerstellar
{

	public static void main(String[] args)
	{
		Outside o = new Outside();
		Outside.Inside i = o.new Inside();
		System.out.println(o.a+" "+i.b);

	}

}
