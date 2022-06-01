package array; //521

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]arr1= {'J','A','V','A'};
		
		//방법0
		char[]arr0 = new char[10];
		for(int i = 0; i<4; i++) {
			arr0[i] = arr1[i];
		}
		for(int i=0; i<4; i++) {
			System.out.println(arr0[i]);
		}//arrays클래스에서 이게 구현되어져있음
		
		
		//방법1
		char[]arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[]arr3 = Arrays.copyOfRange(arr1,1,3);
		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[]arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(arr4.toString());//16진수로 나타내는,,
		System.out.println(arr4);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
		
	}
	

}
