package InterfaceKeyword;

public class VechicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vechicle v=new Vechicle();
		VechicleInterface v1;
		//v1=new Vechicle();
		//v1.getCompany();
		//v1.isMotarised();
		CarData d=new CarData();
		int n=d.getgear();
		System.out.println(n);
		d.getCompany();
		d.isMotarised();
	}

}
