package com.sh.com;

public class Test extends Thread
{
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("hjh");
		}
public static void main(String[] args) {
	new Test().start();
	System.out.println("jhj");
}
}
