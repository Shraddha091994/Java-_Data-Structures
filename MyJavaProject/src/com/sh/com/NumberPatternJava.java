package com.sh.com;

public class NumberPatternJava {
	public static void main(String[] args) {
		int cont=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				cont=cont+1;
						System.out.print(cont + "  ");
			}
			System.out.println();
				
		}
	}

}
