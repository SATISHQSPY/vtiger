package jAVApgm;

public class AddDIGITofSingleNUMBER {

	public static void main(String[] args) {
		
		//Take a number
		//seprate the number by modulus and division
		//add individual of that number
	
	int num=121;
	int sum=0;
	int rem=0;
	while (num>0) {
		
	rem=num%10;
	sum=sum+(rem%10);
						// sum=sum+rem;
	num=num/10;
	
	
	}
	
	System.out.println(sum);
		
	}
	
	
}
