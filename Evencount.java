package evencount;

import java.util.Scanner;

public class Evencount {
	public void count(int number){
		if(number>=2){
			for(int a=2; a<=number;a=a+2){
				System.out.print(a);
				if(a==number||a==(number-1)){
					break;
				}
				System.out.print(",");
			}
		}
		else{
			System.out.println("Wrong Input, the number your input should be an positive integer number and also greater than 1.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please input an positive integer number");
		int number=in.nextInt();
		Evencount numbercount=new Evencount();
		numbercount.count(number);
		in.close();
	}

}
