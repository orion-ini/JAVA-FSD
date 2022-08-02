package pp2;
public class implementRunnable implements Runnable {  
	  
    @Override  
    public void run() 
    {  
        System.out.println("Amazing");  
    }  
   
    public static void main(String[] args) 
    {  
    	implementRunnable ex = new implementRunnable();  
        Thread t1= new Thread(ex);  
        t1.start();  
        System.out.println("The universe is ");  
    }  
}  