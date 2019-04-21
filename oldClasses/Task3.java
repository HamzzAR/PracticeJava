import java.io.*;
 
 class Task3{
 	public void showDetails(int bill, int paid){

 		//int x = 644;
 		//System.out.println(x/100+x%100/10+x%100%10);

 		int one,two,five,ten,fifty,balance,twenty;
 		one = 0;
 		two = 0;
 		five = 0;
 		ten = 0;
 		twenty =0;
 		fifty = 0;
 		balance=paid-bill;
 		if(balance>=50){
 			fifty=balance/50;
 			balance-=(fifty*50);
 		}
 		if(balance>=20){
 			twenty=balance/20;
 			balance-=(twenty*20);
 		}

 		System.out.println("1 = "+one);
 		System.out.println("2 = "+two);
 		System.out.println("5 = "+five);
 		System.out.println("10 = "+ten);
 		System.out.println("50 = "+fifty);
 		
 	}
 }




 //System.out.println(x%100);