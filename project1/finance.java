import java.util.Scanner;

public class finance{
   public static void main(String args[]){
	 System.out.println("Enter the Income this month");
      Scanner my_scan = new Scanner(System.in);
      int my_val = my_scan.nextInt();
      System.out.println("The integer is "+my_val);
System.out.println("NEC is "+(my_val/100)*55);
System.out.println("FFA is "+(my_val/100)*10);
System.out.println("EDU is "+(my_val/100)*10);
System.out.println("LTSS is "+(my_val/100)*10);
System.out.println("PLAY is "+(my_val/100)*10);
System.out.println("GIVE is "+(my_val/100)*10);
   
   }
}