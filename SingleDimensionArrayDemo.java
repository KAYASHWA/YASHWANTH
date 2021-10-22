package arrays;

public class SingleDimensionArrayDemo {
	public static void main(String[] args) {
		int[] x = new int[6];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30; 
		x[3] = 40;
		x[4] = 50;
		x[5] = 60;
	   
		System.out.println(x[3]);
	    System.out.println(x[5]);
	
 

	for(int num:x){
		System.out.println(num);
	}

	System.out.println();System.out.println("Even index value");for(
	int i = 0;i<x.length;i++)
	{
	// print even index values
	if (i % 2 == 0) {
		System.out.println(x[i]);
	}

	System.out.println("Odd Index values");
	for (int i = 0; i < x.length; i++) {
		// print Odd index values
		if (i % 2!= 0) {
			System.out.println(x[i]);
		}
