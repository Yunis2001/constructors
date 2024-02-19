import java.util.Scanner;
 public class constructors{

 public static int sum(int num1,int num2){
 int ans = num1 + num2;
 return ans;
 }

 public static int mult(int num1,int num2){
 int ans = num1 * num2;
 return ans;
 }
 public static float div(int num1,int num2){
 float ans = num1 / num2;
 return ans;
 }


 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter the first number: ");
 int n1 = sc.nextInt();

 System.out.println("Enter the second number: ");
 int n2 = sc.nextInt();

 int sum = sum(n1,n2);
 int mult = mult(n1,n2);
 float div = div(n1,n2);


// System.out.println("The sum is"+ sum);

// System.out.println(" The mult of "+n1+" and "+n2+" is"+ mult);
// System.out.println("The div of "+n1+" and "+n2+" is "+ div);


 }
}