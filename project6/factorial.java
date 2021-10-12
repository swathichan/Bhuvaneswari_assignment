import java.util.Scanner;
class Factorial{  
 public static void main(String args[]){  
System.out.println("Enter the Number");
      Scanner my_scan = new Scanner(System.in);
      int my_val = my_scan.nextInt();
      System.out.println("The integer is "+my_val);
  int i,fact=1;  
  //int number=5;
  for(i=1;i<=my_val ;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+my_val +" is: "+fact);    
 }  
}  