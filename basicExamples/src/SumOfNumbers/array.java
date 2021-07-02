package SumOfNumbers;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {10,20,30,40,50};
		int array2[] = new int[10];
		System.arraycopy(array1, 0, array2, 0, array1.length);
		array1[3]=25;
		System.out.println("array elements");
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		

	}

}
