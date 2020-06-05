import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int addLastDigits(int input1,int input2)
  {
    int sum=0,sum1=0,sum2=0;
		if(input1>10 && input2>10)
		{
			sum=input1%10;
			sum1=input2%10;
			sum2=sum+sum1;
		}
		else if(input1<0 && input2<0)
		{
		  sum=input1%10;
			sum1=input2%10;
			sum2=Math.abs(sum+sum1);
		}
		else if(input1<0 || input2<0)
		{
			sum=input1%10;
			sum1=input2%10;
			sum2=Math.abs(sum+sum1);
		}
		else if((input1<10 && input1>0)&& (input2<10 && input2>0))
		{
			sum2=input1+input2;
		}
		return sum2;
   }
}
