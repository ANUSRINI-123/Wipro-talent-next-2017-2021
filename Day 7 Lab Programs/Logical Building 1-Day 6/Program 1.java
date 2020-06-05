import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int isPrime(int input1)
  	{
     		boolean flag=true;
		for(int i=2;i<=input1/2;i++)
		{
			if(input1%i==0)
			{
				flag=false;
				break;
			}

		}
		if(flag)
		{
			return 2;

		}
		else
		{
			return 1;
		}
	}
}
