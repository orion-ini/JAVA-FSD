package verse;
import java.util.*;
public class RemoveElement{
   public static void main(String[] args) 
   {
       try (Scanner s = new Scanner(System.in)) 
       {
           System.out.println("Enter the number of elements:");
           int n = s.nextInt();
           System.out.println("Enter the elements one by one:");
           Queue < Integer > q = new LinkedList <> ();
           for (int i = 0; i < n; i++) 
           {
               int x = s.nextInt();
               q.add(x); 
           System.out.println("Enter the element to be removed");
           int k = s.nextInt();
           int found = 0;
           ArrayList < Integer > v = new ArrayList <> ();
          
           while (!q.isEmpty()) 
           {
               if (q.peek() == k && found == 0) 
               { 
                   q.remove();
                   found = 1; 
               
               } else 
               { 
                   v.add(q.peek());
                   q.remove();
               }
           }
           if (found == 0) { 
               System.out.println("K NOT PRESENT IN THE QUEUE");
           }
     
           else 
           {
               for (int i1 = 0; i1 < v.size(); i1++) 
               {
                   q.add(v.get(i1));
               }
              
               while (!q.isEmpty()) {
                   System.out.print(q.peek() + " ");
                   q.remove();
               }
               System.out.println();
           }
       }
   }
}
}