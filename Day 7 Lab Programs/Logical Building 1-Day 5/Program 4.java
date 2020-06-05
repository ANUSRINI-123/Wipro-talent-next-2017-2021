import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int countEvensOdds(int input1,int input2,int input3,int input4,int input5,String input6)
	{
		int arr[]={input1,input2,input3,input4,input5};
		int even=0,odd=0;
		String str=new String("even");
		if(str==input6)
		{
			for(int i=0;i<5;i++)
			{
				if(arr[i]%2==0)
				{
					even=even+1;
				}
			}
			return even;
		}
	
		else
		{
			for(int i=0;i<5;i++)
			{
				if(arr[i]%2!=0)
				{
					odd=odd+1;
				}
		
			}
			return odd;
		}
	}
}
