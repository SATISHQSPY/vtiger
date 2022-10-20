package com.modifyVTIGER;

import java.util.Random;


public class randomNUM {
public static int generateRANnum()
{
	Random r =new Random();
	int ranNUM =r.nextInt(11);
	System.out.println(ranNUM);
	return ranNUM;
	
}
}
