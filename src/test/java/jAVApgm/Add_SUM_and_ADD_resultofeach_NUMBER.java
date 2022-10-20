package jAVApgm;

public class Add_SUM_and_ADD_resultofeach_NUMBER {
	public static void main(String[] args) {
		
	
int num=2534;

{

while (num>9)
{
		int sum=0;

	while(num!=0)// 														2534(t)    253(t) 25(t) 1(t)              14(t)		1(t)			
	{																		// 0+4=4	4+3=7	7+5=13 13+1=14       0+4=4		4+1=5
	
	sum=sum+num%10;																	//253 25 2 0									1	0
	num=num/10;																	//												
	}
num=sum;																	//num=14									num=5
System.out.println("sum of addition" +" "+ sum);
}	
System.out.println("final sum" +num);
}
	}
}
