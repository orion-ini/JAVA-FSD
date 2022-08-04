package pp3;
public class Sum {
static int sumNatural(int n)
	{
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	
	static int suminRange(int l, int r)
	{
		return sumNatural(r) - sumNatural(l - 1);
	}

	
	public static void main(String[] args)
	{
		int l = 22, r = 36;
		System.out.println("Sum of Natural numbers from L to R is "+suminRange(l, r));

	}
	}







