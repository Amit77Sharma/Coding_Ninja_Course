package Generics;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

class BubbleSort<T extends Comparable<? super T>>{
	T[] array;
	BubbleSort(T[] array){
		this.array=array;
	}
	
	public void swap(int j, T[] array) {
		T temp=array[j];
		array[j]=array[j+1];
		array[j+1]=temp;
		
	}
	
	public void Bubble() {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j].compareTo(array[j+1])>0) {
					swap(j,array);
				}
			}
		}
	}
}

public class GnericBubbleSort{
	public static void main(String args[]) {
		Integer[] arr={10,5,3,1,6};
		BubbleSort<Integer> bubble=new BubbleSort<Integer>(arr);
		bubble.Bubble();
		for(int s:arr) {
			System.out.println(s);
		}
	}
}



