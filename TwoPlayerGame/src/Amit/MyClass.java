package Amit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//public class MyClass {
//
//	public static void findMinPriceByType(ArrayList<Flower> array,String str) {
//		Collections.sort(array);
//		if(array.get(0).getFlowerId()==0) {
//			System.out.println("null");
//			
//		}else {
//			System.out.println(array.get(0).getFlowerId());
//		}
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		ArrayList<Flower> array=new ArrayList<Flower>();
//		for(int i=0; i<4; i++) {
//			int flowerId=sc.nextInt();
//			sc.nextLine();
//			String flowerName=sc.nextLine();
//			int price=sc.nextInt();
//			sc.nextLine();
//			int rating=sc.nextInt();
//			sc.nextLine();
//			String type=sc.nextLine();
//			Flower flower=new Flower(flowerId,flowerName,price,rating,type);
//			array.add(flower);
//		}
//		String str=sc.nextLine();
//		findMinPriceByType(array,str);
//	}
//
//}
//
import java.util.Scanner;
class MyClass {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int countspace=0;
		for(Character c:ch) {
			if(c==' ') {
				countspace++;
			}
		}
		if(countspace==0) {
			System.out.println("No spaces");
		}else {
			System.out.println(countspace);
		}
	}

}