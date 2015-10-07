package modifycounta;

import java.util.Scanner;

public class CountLetter {
	void counta(String word,String a){
		int count=0;
		for(int i=0; i<word.length(); i++){
			String test=word.substring(i, i+1);	
			if(test.equals(a)){
				count++;
			}
		}
		if(count>=1)
				System.out.println(word+" has "+count+" "+a+".");
		else
			System.out.println(word+" has no '"+a+"'.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a word or sentence");
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		System.out.println("Please input a character you want to count");
		String a=in.nextLine();
		in.close();
		CountLetter count=new CountLetter();
		count.counta(word,a);
	}

}
