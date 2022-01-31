import java.util.*;
public class TaxCalculator {
	
	public static void taxCalc(float tax, float num) {
		float total;
		total=num*(tax/100);
		System.out.println("Tax amount : "+total);
	}
	
	public static void main(String[]args) {
		float num;
		float tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your CTC for which tax should be calculated");
		num=sc.nextFloat();
		if(num<=180000) {
			tax=0;
			System.out.println("Tax Amount : "+tax);
		}
		else if((num>=180001)&&(num<=300000)){
			tax=10;
			taxCalc(tax,num);
		}
		else if((num>=300001)&&(num<=500000)) {
			tax=20;
			taxCalc(tax,num);
		}
		else if((num>=500001)&&(num<=1000000)) {
			tax=30;
			taxCalc(tax,num);
		}
	}

}
