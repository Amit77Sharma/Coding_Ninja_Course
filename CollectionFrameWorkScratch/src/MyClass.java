
import java.util.Scanner;
public class MyClass {

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
			System.out.println("Np spaces");
		}else {
			System.out.println(countspace);
		}
	}

}
