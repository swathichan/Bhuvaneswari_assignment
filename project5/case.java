import java.util.Scanner;

public class Case{  
public static void main(String args[]){ 

String s1="Mary has a little dog. she calls him Pun";  
String s1upper=s1.toUpperCase();  
System.out.println(s1upper);  
 
String s1lower=s1.toLowerCase();  
System.out.println(s1lower);
 String firstLetStr = s1.substring(0, 1);
String remLetStr = s1.substring(1);            
           firstLetStr = firstLetStr.toUpperCase();
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.println(firstLetterCapitalizedName);
String s1title=s1.toLowerCase();  
System.out.println(s1title);


}

}  
