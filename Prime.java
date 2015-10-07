package prime;

import java.util.Scanner;

public class Prime {
	void check(int num){
		if(num>1){
			int i;
			for(i = 2; i<=(num/2);i++){
				if(num%i==0){
					System.out.println(num+" is not prime");
					break;
				}
			}
			if(i>num/2){
				System.out.println(num+" is prime");
			}
		}
		else if(num==1){
			System.out.println("1 is not prime");
		}
		else
			System.out.println("please input the right number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input an positive integer number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Prime prime=new Prime();
		prime.check(num);
		in.close();

	}

}
