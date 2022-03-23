package InterfaceKeyword;

public class CarData extends Vechicle implements CarInterface, VechicleInterface {

	
		// TODO Auto-generated method stub
		
		public boolean isMotarised()
		{
			return true;
		}
		
		public String getCompany()
		{
			return "BMW";
		}
		
		public int getgear()
		{
			return 8;
		}
}
