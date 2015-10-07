package max;

import java.util.Scanner;

public class Max {
	void findMax(String []numlist1){
		int max = Integer.parseInt(numlist1[0]);
		for(int i=1;i<(numlist1.length);i++){
			int[]numberlist=new int[numlist1.length-1];
			numberlist[i-1]=Integer.parseInt(numlist1[i]);
			if(numberlist[i-1]>=max){
				max=numberlist[i-1];
			}
		}
		System.out.println("MAX number is "+max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a list of numbers，use , between numbers");
		System.out.println("Like: 2,3,12,34,112");
		Scanner in=new Scanner(System.in);
		String numlist=in.nextLine();
		String []numlist1=numlist.split(",");
		in.close();
		Max max=new Max();
		max.findMax(numlist1);
		
	
	}

}
