package Basic_java;
import java.util.Scanner;
public class sum_Of_two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0; i<n1; i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        for(int i=0; i<n2; i++)
        {
            arr2[i]=sc.nextInt();
        }
        //sc.close();
        int[] output=new int[n1>n2?n1:n2];
        int size1=arr1.length-1;
        int size2=arr2.length-1;
        int size3=output.length-1;
        int carry=0;
        while(size3>=0)
        {
            int d=carry;
            if(size1>=0)
            {
                d=d+arr1[size1];
            }
            if(size2>=0)
            {
                d=d+arr2[size2];
            }
            carry=d/10;
            d=d%10;
            output[size3]=d;
            size1--;
            size2--;
            size3--;
        }
        if(carry!=0)
        {
            System.out.print(carry);
            
        }
        for(int i=0; i<output.length; i++)
        {
            System.out.print(output[i]);
        }

	}

}
