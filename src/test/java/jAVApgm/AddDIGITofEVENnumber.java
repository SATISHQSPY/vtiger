package jAVApgm;

public class AddDIGITofEVENnumber {

	public static void main(String[] args) {
	 
		//Take a number
				//seprate the number by modulus 
		//select even number only
		//seprate the number and divide for next number
				//add that number
	int num=2543;
int	sum=0;
	int rem=0;
	while (num!=0)
	{
		rem=num%10;
	
		if(rem%2==0)
		{
	sum=sum+rem;
		}
	num=num/10;
		}
		System.out.println(sum);
	}

}
