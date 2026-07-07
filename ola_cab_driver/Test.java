package com.rohan.ola_cab_driver;


//class Test1 extends Thread
//{
//	public void run()
//	{
//		for(int i=0; i<=10; i++)
//		{
//			System.out.println("Hello Welcome here.."+i);
//		}
//		
//		System.out.println(Thread.currentThread().getName());
//	}
//}
class Test
{
	public static void main(String[] args) 
	{
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Task one");
			}
		}.start();
		
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Task two");
			}
		}.start();
		
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Task 3");
			}
		}.start();

		
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Task 4");
			}
		}.start();

		
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Task 5");
			}
		}.start();

		
		new Thread()
		{
			@Override
			public void run()
			{
				System.out.println("Task 6");
			}
		}.start();


	}
}
