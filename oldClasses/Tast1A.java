 class Task1A{
 	public void showDetails(int bill, int paid){

 		//int x = 644;
 		//System.out.println(x/100+x%100/10+x%100%10);

 		int two,five,ten,fifty,twenty,change;
 		two = 0;
 		five = 0;
 		ten = 0;
 		twenty=0;
 		fifty = 0;
 		change=paid-bill;
 		if(change>=50){
 			fifty=change/50;
 			change-=(fifty*50);
 		}
 		if(change>=20){
 			twenty=change/20;
 			change-=(twenty*20);
 		}
 		if (change>=10) {
 			ten=change/10;
 			change-=(ten*10);
 		}
 		if (change>=5) {
 			five=change/5;
 			change-=(five*5);
 		}
 		if (change>=2) {
 			two=change/2;
 			change-=(two*2);
 		}

 		System.out.println("50 = "+fifty);
 		System.out.println("20 = "+twenty);
 		System.out.println("10 = "+ten);
 		System.out.println("5 = "+five);
 		System.out.println("2 = "+two);		
 		
 	}
 }




 //System.out.println(x%100);