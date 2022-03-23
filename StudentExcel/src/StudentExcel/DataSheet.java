package StudentExcel;
public class DataSheet {
	private String name;
	private String roll;
	private int physic;
	private int chemistry;
	private int math;
	//default constructor ============
	public DataSheet() {
		
	}
	//parameterise constructor=======================
	public DataSheet(String name, String roll, int physic, int chemistry, int math) {
		this.name = name;
		this.roll = roll;
		if(physic<0 || physic>100) {
			this.physic=50;
		}else {
			this.physic = physic;
		}
		if(chemistry<0 || chemistry>100) {
			this.chemistry=50;
		}else {
			this.chemistry = chemistry;
		}
		if(math<0 || math>100) {
			this.math=50;
		}else {
			this.math = math;
		}
	}
	//lets create the getter and setter ====================
	public String getName() {
		return name;
	}
	public String getRoll() {
		return roll;
	}
	public int getPhysic() {
		return physic;
	}
	public void setPhysic(int physic) {
		if(physic<0 || physic>100) {
			this.physic=50;
		}else{
			this.physic = physic;
		}
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		if(chemistry<0 || chemistry>100) {
			this.chemistry=50;
		}else {
			this.chemistry = chemistry;
		}
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math<0 || math>100) {
			this.math=50;
		}else {
			this.math = math;
		}
	}
	
	@Override
	public String toString() {
		return "" + name + "\t" + roll + "\t" + physic + "\t" + chemistry
				+ "\t\t" + math + "";
	}
}
