package digits;

import java.util.Scanner;

public class Digits {
	void findDigits(int num){
		int digit=1;
		int lastnum=0;
		int testnum=num;
		do{
			lastnum=(int)(testnum/10);
			if(lastnum!=0)
				digit=digit+1;
			else
				break;
			testnum=lastnum;
		}while(testnum!=0);
		if(digit>1){
			System.out.println(num+" has "+digit+" digits");
		}
		else if(digit==1){
			System.out.println(num+" has "+digit+" digit");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input an positive integer number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Digits digits=new Digits();
		digits.findDigits(num);
		in.close();
	}

}
