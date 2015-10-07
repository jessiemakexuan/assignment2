package counta;

import java.util.Scanner;

public class Counta {
	void counta(String word){
		int count=0;
		for(int i=0; i<word.length(); i++){
			String test=word.substring(i, i+1);	
			if(test.equals("a")){
				count++;
			}
		}
		if(count>=1)
				System.out.println(word+" has "+count+" 'a'.");
		else
			System.out.println(word+" has no 'a'.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a word or sentence to let us count 'a'.");
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		Counta count=new Counta();
		count.counta(word);
		in.close();

	}

}
