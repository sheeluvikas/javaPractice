package com.techgig;

import java.io.IOException;
import java.util.Scanner;

public class CandidateCode {
	
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetWaterLevel(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));
    }
	
	public static int GetWaterLevel(int input1,int input2,int[] input3){

		//Write code here
        int len=input1;
		int br=input2;
		int A[][]=new int[len][br];
		
		int height[]=new int[input3.length];
		height=input3;
		int count=0;
		int num=0;
		int check=0;
		
		if(len<1 || len>10 || br<1 || br>10)
		{
			return -1;
		}
		for(int i=0;i<height.length;i++)
		{
			if(height[i]<1 || height[i]>10)
			    return -1;
		}
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<br;j++)
			{
				A[i][j]=height[count];
				count++;
			}
		}
		
		for(int i=1;i<=(len-2);i++)
		{
			for(int j=1;j<=(br-2);j++)
			{
					int min=11;
				
					if(A[i][j+1]<min)
						min=A[i][j+1];
					if(A[i+1][j]<min)
						min=A[i+1][j];
					if(A[i-1][j]<min)
						min=A[i-1][j];
					if(A[i][j-1]<min)
						min=A[i][j-1];
				
					num=min-A[i][j];
					if(num<0)
					{
						check=check+0;
					}
					else
					{
						check=check+num;
						A[i][j]=A[i][j]+num;
					}
				
				
				if((A[i][j]==A[i][j+1]) || (A[i][j]==A[i][j-1]))
				{
					if(A[i][j]==A[i][j+1])
					{
						min=11;
				
						if(A[i][j-1]<min)
							min=A[i][j-1];
						if(A[i-1][j]<min)
							min=A[i-1][j];
						if(A[i-1][j+1]<min)
							min=A[i-1][j+1];
						if((j+2)<br)
						{					
							if(A[i][j+2]<min)
							min=A[i][j+2];
						}
						if(A[i+1][j+1]<min)
							min=A[i+1][j+1];
						if(A[i+1][j]<min)
							min=A[i+1][j];
					
					
					num=min-A[i][j];
					if(num<0)
					{
						check=check+0;
					}
					else
					{
						check=check+2*num;
						A[i][j]=A[i][j]+num;
						
						A[i][j+1]=A[i][j+1]+num;
						
					}
					}
					else if(A[i][j]==A[i][j-1])
					{
						min=11;
						if((j-2)>=0)
						{
						if(A[i][j-2]<min)
							min=A[i][j-2];
						}
						if(A[i-1][j-1]<min)
							min=A[i-1][j-1];
					if(A[i-1][j]<min)
						min=A[i-1][j];
					if(A[i][j+1]<min)
						min=A[i][j+1];
					
					if(A[i+1][j-1]<min)
						min=A[i+1][j-1];
					if(A[i+1][j]<min)
						min=A[i+1][j];
					
					num=min-A[i][j];
					if(num<0)
					{
						check=check+0;
					}
					else
					{
						check=check+2*num;
						A[i][j]=A[i][j]+num;
						
							A[i][j-1]=A[i][j-1]+num;
					
					}
					}
				}
				
				if((A[i][j]==A[i+1][j]) || (A[i][j]==A[i-1][j]))
				{
					if(A[i][j]==A[i+1][j])
					{
						min=11;
				
						if(A[i-1][j]<min)
							min=A[i-1][j];
						if(A[i][j-1]<min)
							min=A[i][j-1];
					if(A[i+1][j-1]<min)
						min=A[i+1][j-1];
					if((i+2)<len)
					{					if(A[i+2][j]<min)
						min=A[i+2][j];
					}
					if(A[i][j+1]<min)
						min=A[i][j+1];
					if(A[i+1][j+1]<min)
						min=A[i+1][j+1];
					
					num=min-A[i][j];
					if(num<0)
					{
						check=check+0;
					}
					else
					{
						check=check+2*num;
						A[i][j]=A[i][j]+num;
						
						A[i+1][j]=A[i+1][j]+num;
						
					}
					}
					else if(A[i][j]==A[i-1][j])
					{
						min=11;
						if((i-2)>=0)
						{
						if(A[i-2][j]<min)
							min=A[i-2][j];
						}
						if(A[i-1][j-1]<min)
							min=A[i-1][j-1];
					if(A[i][j-1]<min)
						min=A[i][j-1];
					if(A[i+1][j]<min)
						min=A[i+1][j];
					
					if(A[i-1][j+1]<min)
						min=A[i-1][j+1];
					if(A[i][j+1]<min)
						min=A[i][j+1];
					
					num=min-A[i][j];
					if(num<0)
					{
						check=check+0;
					}
					else
					{
						check=check+2*num;
						A[i][j]=A[i][j]+num;
						
							A[i][j-1]=A[i-1][j]+num;
					
					}
					}
				}
				
			}
		
		}

		return check;
	}
}
