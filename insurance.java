Cimport java.util.Scanner;
public class insurance{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String word=sc.next();
		Float rate=sc.nextFloat();
		int claim=sc.nextInt();
		Float percentage_amount=0.0f;
		int pc=50;           //processing charge
        Float tbd=0.0f;     //total before discount
        Float ncb=0.0f;    //no claim bonus =10% for domestic and for Commercial=15%
        Float fp=0.00f;   //  final premium
                           //Domestic
		if(word.equals("Domestic")){
			if(rate<100000){
				if(claim==0){
					percentage_amount=percentage_amount+0.3f/100*rate;
					tbd=tbd+percentage_amount+50; 
					ncb=ncb+10.0f/100*tbd;
					fp= tbd-ncb;
					System.out.printf("%.2f", fp);
				
				}
				else {
					percentage_amount=percentage_amount+0.3f/100*rate;
					tbd=tbd+percentage_amount+50;
					System.out.printf("%.2f", tbd);
					                    }

			}   
			else {
				if(claim==0){
					percentage_amount=percentage_amount+0.25f/100*rate;
					tbd=tbd+percentage_amount+50;
					ncb=ncb+10.0f/100*tbd;
					fp= tbd-ncb;
					System.out.printf("%.2f", fp);				
				}
				else {
					percentage_amount=percentage_amount+0.25f/100*rate;
					tbd=tbd+percentage_amount+50;
					System.out.printf("%.2f", tbd);					
				}
			}
		}
		//Commercial
		else if(word.equals("Commercial")){
			if(rate<250000){
				if(claim==0){
					percentage_amount=percentage_amount+0.5f/100*rate;
					tbd=tbd+percentage_amount+80;
					ncb=ncb+15.0f/100*tbd;
					fp= tbd-ncb;
					System.out.printf("%.2f", fp);			
				}
				else {
					percentage_amount=percentage_amount+0.5f/100*rate;
					tbd=tbd+percentage_amount+80;
					System.out.printf("%.2f", tbd);				
                 }
			}
			else {
				if(claim==0){
					percentage_amount=percentage_amount+0.75f/100*rate;
					tbd=tbd+percentage_amount+80;
					ncb=ncb+15.0f/100*tbd;
					fp= tbd-ncb;
					System.out.printf("%.2f", fp);				
				}
				else {
					percentage_amount=percentage_amount+0.75f/100*rate;
					tbd=tbd+percentage_amount+80;
					System.out.printf("%.2f", tbd);
				}
			}
		}
		
	}
}