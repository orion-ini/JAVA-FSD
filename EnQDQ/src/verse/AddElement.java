package verse;
import java.util.Scanner;

public class AddElement{
	
	public final static int MAX = 50;

	public static int[] queue = new int[MAX];

	public static int front = -1, rear = -1;

	public static void enqueue(int data) 
	{
		if(rear == MAX - 1) {
			System.out.print("\nQueue is Full!");
		} else {
			rear = rear + 1;
			queue[rear] = data;
			if(front == -1) 
			{
				front = 0;
			}
		}
	}

	public static void disp()  {
	    
		System.out.print("\nThe elements in the queue are:");
		if(front == -1) {
			System.out.print("\nQueue is Empty");
		} 
                else {
			for(int i = front; i <= rear; i++) {
				System.out.print(queue[i] + "  ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int data, size;
		System.out.print("Enter the size of queue: ");
		size = STDIN_SCANNER.nextInt();
		for(int i = 0; i < size; i++) 
		{
			System.out.println("\nEnter Data to Enqueue:");
			data = STDIN_SCANNER.nextInt();
			System.out.println("Enqueuing " + data);
			enqueue(data);
			disp();
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}