package log4jdemo2;

import org.testng.annotations.Test;

public class addTC {
		@Test
		public void display()
		{
			System.out.println("TC added");
		}
		
		@Test
		public void branch()
		{
			System.out.println("Develop branch added");
		}
		@Test
		public void branch1()
		{
			System.out.println("Develop again added branch added");
		}
}
