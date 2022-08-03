package pill;
class Universe{  
void bigbang(){System.out.println("The universe was created due to bigbang");}  
}  
class time extends Universe{  
void arena(){System.out.println("There are billions of stars in the universe");}  
}  
public class inherit {

	public static void main(String[] args) {
		time d=new time();  
		d.bigbang();  
		d.arena();  
	}

}
