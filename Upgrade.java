package BasicPrograms;
import java.util.*;

public class Upgrade 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String gpu = "Gtx 770 Nvidia";
		String cpu = "Intel i5 ";
		String speakers = "Hp Desktop Speakers ";
		String ram = "6 gigs";
		String hd = "500 gb" ;
		String adc = "Standard Adc";
		
		double gpuCost = 299.99 ;
		double cpuCost = 299.99 ;
		double speakersCost = 19.99 ;	
		double ramCost = 39.99 ;
		double hdCost = 49.99;
		double adcCost = 39.99 ;
		double total = gpuCost + cpuCost + speakersCost + ramCost + hdCost + adcCost ;
		
		String ugpu;
		String ucpu;
		String uspeakers;
		String uram;
		String uhd;
		String uadc;
		
		double ugpuCost;
		double ucpuCost;
		double uspeakersCost;	
		double uramCost;
		double uhdCost;
		double uadcCost;
				
		System.out.println("Current System Configuration is"); 
		
		System.out.printf("%s", gpu);
		System.out.printf(" for %.2f \n", gpuCost );
		
		System.out.printf("%s", cpu);
		System.out.printf(" for %.2f \n", cpuCost );
		
		System.out.printf("%s", speakers);
		System.out.printf(" for %.2f \n", speakersCost );
		
		System.out.printf("%s", ram);
		System.out.printf(" for %.2f \n", ramCost );
		
		System.out.printf("%s", hd);
		System.out.printf(" for %.2f \n", hdCost );
		
		System.out.printf("%s", adc);
		System.out.printf(" for %.2f \n", adcCost );
		
		System.out.printf("Total for build is: %.2f \n", total );
	
		System.out.printf("Please Enter upgrade for gpu : \n");
		ugpu = scan.nextLine();
					
		System.out.printf("Please Enter upgrade for cpu : \n");
		ucpu = scan.nextLine();
		
		System.out.printf("Please Enter upgrade for speakers : \n");
		uspeakers = scan.nextLine();
		
		System.out.printf("Please Enter upgrade for ram : \n");
		uram = scan.nextLine();
		
		System.out.printf("Please Enter upgrade for hd : \n");
		uhd = scan.nextLine();
		
		System.out.printf("Please Enter upgrade for adc : \n");
		uadc = scan.nextLine();
		
		System.out.printf("Please Enter Cost for new gpu: ");
		ugpuCost = scan.nextDouble();
		
		System.out.printf("Please Enter Cost for new cpu : ");
		ucpuCost = scan.nextDouble();
		
		System.out.printf("Please Enter Cost for new speakers : ");
		uspeakersCost = scan.nextDouble();
		
		System.out.printf("Please Enter Cost for new ram : ");
		uramCost = scan.nextDouble();
		
		System.out.printf("Please Enter Cost for new hd : ");
		uhdCost = scan.nextDouble();
		
		System.out.printf("Please Enter Cost for new adc : ");
		uadcCost = scan.nextDouble();
		
		System.out.printf("New gpu is %s", ugpu);
		System.out.printf(" for %.2f$ \n", ugpuCost );
		
		System.out.printf("New cpu %s", ucpu);
		System.out.printf(" for %.2f$ \n", ucpuCost );
		
		System.out.printf("New speakers %s", uspeakers);
		System.out.printf(" for %.2f$ \n", uspeakersCost );
		
		System.out.printf("New ram %s", uram);
		System.out.printf(" for %.2f$ \n", uramCost );
		
		System.out.printf("New hd  %s", uhd);
		System.out.printf(" for %.2f$ \n", uhdCost );
		
		System.out.printf("New adc  %s", uadc);
		System.out.printf(" for %.2f$ \n", uadcCost );
		
		double uTotal = ugpuCost + ucpuCost + uspeakersCost + uramCost + uhdCost + uadcCost;
		
		System.out.printf("Total for New Build is : %.2f$" ,uTotal);
		scan.close();
	}

}

//Choose a better processor, more RAM, a different hard disk drive, an audio card, a video card, and speakers