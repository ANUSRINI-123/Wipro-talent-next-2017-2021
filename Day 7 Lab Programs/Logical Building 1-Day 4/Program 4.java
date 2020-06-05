import java.io.*;
import  java.util.*;
import java.lang.*;
class UserMainCode
{
  public int secondLastDigitOf(int input1)
  {
    if(input1<10 && input1>0)
		{
			return -1;
		}
		else if(input1<0)
		{
			int sum=0,sum1=0;
			sum = input1 % 100;
			sum1=sum/10;
			return Math.abs(sum1);
		}
		else
		{
			int sum=0,sum1=0;
			sum = input1 % 100;
			sum1=sum/10;
			return (sum1);
		}
	}
}

