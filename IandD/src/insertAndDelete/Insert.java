package insertAndDelete;
import java.util.Stack;
public class Insert {
   public static void main (String args[]) {
      Stack stack = new Stack();
      stack.push("Apple");
      stack.push("Mango");
      stack.push("Guava");
      stack.push("Pear");
      stack.push("Orange");
      System.out.println("The stack elements are: " + stack);
   }
}