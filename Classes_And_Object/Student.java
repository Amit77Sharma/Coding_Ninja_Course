package Classes_And_Object;

/*
 * here we have just created the class of name Student means it can only contain the properties of the student 
 *by creating class it doesn't mean that wee have created the objects..
 *Tocreate the object we have to create the saperate class of it.
 *here we are creating the template...  
 */
public class Student {
	//here we are writing the properties of the student 
	
	private String name;
	private int rollno;
	public void setname(String s)
	{
		if(s.equals("amit"))
		{
			return;
		}
		name=s;
	}
	public String getname()
	{
		return name;
	}
	public void setrollno(int num)
	{
		if(num<=0)
		{
			return;
		}
		rollno=num;
	}
	public int getrollno()
	{
		return rollno;
	}
	//bysetting thr rollno private it will deny the access to the other class who wants to use this
	//property of this class....
	//like 
	///private int rollno;
	

}
