package Queue;
import java.util.Scanner;
public class UsingQueue {

	public static void main(String[] args) throws QueueException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue_using_Array queu=new Queue_using_Array();
		queu.enqueue(20);
		System.out.println(queu.size());
		queu.enqueue(10);
		System.out.println(queu.size());
		queu.enqueue(10);
		System.out.println(queu.size());
		queu.enqueue(10);
		System.out.println(queu.size());
		queu.enqueue(10);
		System.out.println(queu.size());
		queu.enqueue(90);
		System.out.println("size"+" "+queu.size());
		queu.dequeue();
		System.out.println(queu.size());
		System.out.println(queu.isEmpty());
		System.out.println(queu.front());
		System.out.println(queu.rear());
		queu.dequeue();
		System.out.println(queu.size());
		queu.dequeue();
		System.out.println(queu.size());
		queu.dequeue();
		System.out.println(queu.size());

	}

}
