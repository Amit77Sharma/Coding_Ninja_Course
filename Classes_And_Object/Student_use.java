package Classes_And_Object;


//here in trhis main class we will create the object of student here int this class for use its property

public class Student_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();
		//or we can crete object luke this 
		Student s3;
		s3=new Student();
		Student s2=new Student();
		s1.setname("ajir");
		s2.setname("ajit");
		s1.setrollno(10);
		s2.setrollno(20);
		
		System.out.println(s1.getname()+" "+s2.getname());
		System.out.println(s1.getrollno()+" "+s2.getrollno());//here s2.rollno shows error due to the access modifier we used
		//in the other class is private 
		Test object=new Test();
		object.set(10, 20);
		object.display();
	}

}
