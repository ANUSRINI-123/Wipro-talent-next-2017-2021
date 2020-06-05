import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int isPrime(int input1)
	{
		int num, count, i;
    		n=1;
    		count=0;
		while (count < input1)
		{
      			n=n+1;
      			for (i = 2; i <= n; i++)
			{ 
        			if (n % i == 0)
				{
         				break;
     				}
    			}
      			if ( i == n)
			{
        			count = count+1;
      			}
    		}
    		return  n;
    	}
}
		
