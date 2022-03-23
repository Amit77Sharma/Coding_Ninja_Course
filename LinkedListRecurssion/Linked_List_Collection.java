
// In this program we will see the linked list of java.....

package LinkedListRecurssion;
import java.util.LinkedList;
public class Linked_List_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Items fruits=new Items();
		LinkedList<Object> list=new LinkedList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int length=list.size();
		for(int i=0; i<length; i++) {
			System.out.println(list.get(i));
		}
		list.addFirst(10);
		list.addLast(60);
		list.add(2,70);
		length=list.size();
		for(int i=0; i<length; i++) {
			System.out.print(list.get(i)+" ");
		}
		list.clear();
		System.out.println();
		length=list.size();
		System.out.println(length);
		list.add(new Items());
		length=list.size();
//		for(int i=0;i<length; i++) {
//			for(int j=0; i<list.get(0).get(i); j++) {
//				System.out.println(list.get(i).get(j));
//			}
//		}

	}
}
