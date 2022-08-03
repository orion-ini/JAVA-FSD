package pill;
class Area {
	  int length;
	  int breadth;
	Area(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }
	  public void getArea() {
	    int area = length * breadth;
	    System.out.println("The Area is : " + area);
	  }
	}

	public class Encapsulate {
	   public static void main(String[] args) {
			 Area rectangle = new Area(5, 6);
			    rectangle.getArea();
	     }

	}
