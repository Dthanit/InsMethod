import java.util.Scanner;
class InstMethod
{
  public static void getName()
  {
    String n = "Assignment"; 
    for(int i=1;i<=3;i++)
    System.out.println(n);
  }
  
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
    getName();
    System.out.println();
    System.out.print("Enter Integer  ");
    int num = sc.nextInt();
    System.out.println("Integer is "+num);
  }
}