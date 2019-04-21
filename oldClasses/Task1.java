import java.io.*;

class Task1{
 	public void showDetails(int bill, int paid){

 		//int x = 644;
 		//System.out.println(x/100+x%100/10+x%100%10);

 		int one,two,five,ten,fifty;
 		one = 0;
 		two = 0;
 		five = 0;
 		ten = 0;
 		fifty = 0;

 		int change = paid - bill;
 		if (change <=99) {
 			int leftNo = (change/10)*10;
 			int rightNo =change%10;

 			while (true) {
 				if (leftNo>=50) {
 					leftNo-=50;
 					fifty++;
 				}
 				else if (leftNo>=10) {
 					leftNo-=10;
 					ten++;
 				}

 				if (leftNo==0) {
 						break;
 					}
 			}

 			while(true){
 				if (rightNo>=5) {
 					rightNo-=5;
 					five++;
 				}
 				else if(rightNo>=2) {
 					rightNo-=2;
 					two++;
 				} else{
 					rightNo-=1;
 					one++;
 				}

 				if (rightNo==0) {
 					break;
 				}
 			}
 		}

 		System.out.println("1 = "+one);
 		System.out.println("2 = "+two);
 		System.out.println("5 = "+five);
 		System.out.println("10 = "+ten);
 		System.out.println("50 = "+fifty);
 		
 	}
 }




 //System.out.println(x%100);