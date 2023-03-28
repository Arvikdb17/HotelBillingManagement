package hotelbillingmanagement;

import java.util.*;

public class Hotel {
	public static void main(String[] args) {
		Scanner sc1=new Scanner (System.in);
		int qty;
		int amt,billamt=0,i;
		System.out.println("Hotel Alsham");
		do {
		System.out.println("1. Dosa");
		System.out.println("2. Sambar");
		System.out.println("3. Aappam");
		System.out.println("4. idly");
		System.out.println("5. Vada");
		System.out.println("Please select you Food");
		int ch=sc1.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Dosa qty?");
			qty=sc1.nextInt();
			amt=qty*10;
			billamt=billamt+amt;
			break;
		case 2:	
			System.out.println("sambar qty?");
			qty=sc1.nextInt();
			amt=qty*10;
			billamt=billamt+amt;
			break;
		case 3:
			System.out.println("Aappam qty?");
			qty=sc1.nextInt();
			amt=qty*10;
			billamt=billamt+amt;
			break;
		case 4:
			System.out.println("idly qty?");
			qty=sc1.nextInt();
			amt=qty*10;
			billamt=billamt+amt;
			break;
		case 5:
			System.out.println("Vada qty?");
			qty=sc1.nextInt();
			amt=qty*10;
			billamt=billamt+amt;
			break;
		default:
			System.out.println("invalid food please select food from the choice");
			break;
			
		}
		System.out.println("if you want to continue press 1 or press 0");
		 i=sc1.nextInt();
		}while(i==1);
		System.out.println("Total Bill Amount ="+billamt);
	}

}
