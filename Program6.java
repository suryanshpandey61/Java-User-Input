import java.util.Scanner;
class Program6{

 public static void calculator(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first Value:");
  int a=sc.nextInt();
  System.out.println("Enter the Second value:");
  int b=sc.nextInt();
  System.out.println("Enter the Operation perform on both values:");
  char op=sc.next().charAt(0);
  switch(op){
   case '+':
    System.out.println(a+" + "+b+" = "+(a+b));
    break;
   case '-':
    System.out.println(a+" - "+b+" = "+(a-b));
    break;
   case '*':
    System.out.println(a+" * "+b+" = "+(a*b));
    break;
   case '/':
    System.out.println(a+" / "+b+" = "+(a/b));
    break;
   default:
    System.out.println("Enter an valid operation");


  }


}


 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   char ch;
   do{
       calculator();
       System.out.println("Press Y/y to continue....");
       ch=sc.next().charAt(0);
   }while(ch=='Y' || ch=='y');

   System.out.println("Program Ends !");
 }


}

















