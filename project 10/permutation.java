public class Permutation
{  
  
void printPermutations(int array[], int n)  
{  
for (int i = 0; i < n; i++)  
System.out.print(array[i] + " ");  
  
System.out.println();  
}  

void findPermutation(int array[], int size, int n)  
{   
if (size == 1)  
printPermutations(array, n);  
for (int i = 0; i < size; i++)   
{  
findPermutation(array, size - 1, n);  
 
if (size % 2 == 1)   
{  
     
int temp = array[0];  
array[0] = array[size - 1];  
array[size - 1] = temp;  
}  

else   
{  
     
int temp;     
temp = array[i];  
array[i] = array[size - 1];  
array[size - 1] = temp;  
}  
}  
}  
 
public static void main(String args[])  
{  
Permutation p = new Permutation();  
 
int array[] = { 2,8,9 };  
 
p.findPermutation(array, array.length, array.length);  
}  
} 