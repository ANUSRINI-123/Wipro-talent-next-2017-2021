import java.io.*;
import  java.util.*;
class UserMainCode
{
public int nnGenerator(String input1)
{
int i,j;
		String a="";
		int[] x=new int[input1.length()];
		for(i=0;i<x.length;i++)
		{
			x[i]=Integer.parseInt(String.valueOf(input1.charAt(i)));
		} 
		for(i=0;i<x.length;i++)
		{
			int sum=x[i];
			if(x[i]%2!=0)
			{
				for( j=i+1;j<x.length;j++)
				{
					if(sum%2!=0)
					{
						sum=sum+x[j];
					}
					else
					{
						break;
					}
				}
				i=j-1;
				a=a+Integer.toString(sum);
			}
			else
			{
				for(j=i+1;j<x.length;j++)
				{
					if(sum%2==0)
					{
						sum=sum+x[j];
					}
					else
					{
						break;
					}

				}
				i=j-1;
				a=a+Integer.toString(sum);
			}
		}
		return Integer.parseInt(a);
	}
}

		
