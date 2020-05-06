package JavaConcepts;

public class WrapperClass 
{
	public static void main(String[] args) 
	{
		//Wrapper Classes are Predefined Class by Java which can contain Primitive Data Type.
		
		//String ==>> Integer ==>> Int.
		String desktopPrice = "125";
		String laptopPrice = "125";
		
		int desktopFinalPrice = Integer.parseInt(desktopPrice);
		int laptopFinalPrice = Integer.parseInt(laptopPrice);
		
		int totalValue = desktopFinalPrice + laptopFinalPrice;
		
		System.out.println("The Desktop and Laptop Price is ::: " +totalValue);
		
		System.out.println("#############################################################");
		
		//String ==>> Double ==>> Double.
		String redmiPrice = "125.25";
		String iPhonePrice = "125.25";
		
		double redmiMobilePrice = Double.parseDouble(redmiPrice);
		double iPhoneMobilePrice = Double.parseDouble(iPhonePrice);
		
		double totalMobilesPrice = redmiMobilePrice + iPhoneMobilePrice;
		
		System.out.println("The Price for Mobiles are ::: " +totalMobilesPrice);
		
		System.out.println("#############################################################");
		
		//Converting Primitive Data Type to Corresponding Object Wrapper Class.
		
		//AutoBoxing. 
		int a = 10;
		Integer b = a;
		System.out.println("Primitive Data Type to Object Value ==>> AutoBoxing ::: " +b);
		
		//Boxing.
		int i = 20;
		Integer j = Integer.valueOf(i);
		System.out.println("Primitive Data Type to Object Value ==>> Boxing ::: " +j);
		
		System.out.println("#####k########################################################");
		
		//Converting Object of Wrapper Class to its Respective Primitive Type.
		
		//AutoUnBoxing.
		Integer m = 30;
		int n = m;
		System.out.println("Object Value to Primitive Data Type ==>> AutoUnBoxing ::: " +n);
		
		//UnBoxing.
		Integer x = 40;
		int y = x.intValue();
		System.out.println("Object Value to Primitive Data Type ==>>  UnBoxing ::: " +y);
		
		System.out.println("#############################################################");
	}
}
