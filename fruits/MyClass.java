package fruits;
import java.util.ArrayList;
import java.util.Scanner;
public class MyClass  {
	
	public static Fruits findMaximumPriceByRating(Fruits arr[], int rating) {
		int max = 0;
		Fruits f1=null;
		for(Fruits f:arr) {
			if(f.getRating()>rating) {
				if(f.getPrice()>max) {
					f1=f;
				}
			}
		}
		return f1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Fruits> fruits=new ArrayList<Fruits>();
		Scanner sc=new Scanner(System.in);
		int Rating;
		Fruits arr[]=new Fruits[4];
		for(int i=0; i<4; i++) {
			int fruitId=sc.nextInt();
			sc.nextLine();
			String fruitName=sc.nextLine();
			int price=sc.nextInt();
			sc.nextLine();
			int rating=sc.nextInt();
			arr[i]=new Fruits(fruitId,fruitName,price,rating);
		}
		Rating=sc.nextInt();
		Fruits f2=findMaximumPriceByRating(arr,Rating);
		if(f2!=null) {
			System.out.println(f2.getFruitId());
		}
		else {
			System.out.println("No such Fruit");
		}
	}

}
