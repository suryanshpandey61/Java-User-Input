import java.util.Scanner;

class Program2
{
 public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Name:");
    String name = sc.nextLine();

    System.out.println("Enter your age:");
    int age =  sc.nextInt();

    sc.nextLine();

   System.out.println("Enter your address");
   String add=sc.nextLine();

   System.out.println("Enter your pincode");
   int pin = sc.nextInt();

   System.out.println("===============");
   
   System.out.println("Name is :"+name);

   System.out.println("Age is :"+age);

   System.out.println("Address is :"+add);

   System.out.println("Pincode is :"+pin);
 

   
   
  }

}