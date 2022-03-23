package Stack;

public class stackUse_LL {

	public static void main(String[] args) throws stackException {
		// TODO Auto-generated method stub
		stackUsing_LL<Integer> stak=new stackUsing_LL<Integer>();
		stak.push(20);
		stak.push(10);
		stak.pop();
		stak.top();
		stak.isEmpty();
		System.out.println(stak.size());
	}

}
