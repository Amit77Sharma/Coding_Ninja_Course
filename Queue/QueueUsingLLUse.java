package Queue;
import java.util.Scanner;
public class QueueUsingLLUse {

	public static void main(String[] args) throws QueueIsEmpty {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		QueueUsingLL<Integer> queu=new QueueUsingLL<Integer>();
		queu.enqueue(10);
		System.out.println(queu.size());
		queu.enqueue(30);
		queu.enqueue(50);
		System.out.println(queu.size());
		System.out.println(queu.front());
		queu.dequeue();
		System.out.println(queu.size());
		System.out.println(queu.front());
		System.out.println(queu.rear());

	}

}
