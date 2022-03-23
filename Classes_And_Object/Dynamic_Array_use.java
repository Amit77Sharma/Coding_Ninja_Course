package Classes_And_Object;

public class Dynamic_Array_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynamic_Array d=new Dynamic_Array();
		
		for(int i=0; i<100; i++)
		{
			d.add(i*2);
		}
		System.out.println(d.size());
		System.out.println(d.get(99));
		System.out.println(d.removelast());
		System.out.println(d.size());
		while(!d.isEmpty())
		{
			System.out.println(d.removelast());
			System.out.println("Size is -"+d.size());
		}
		
	}

}
