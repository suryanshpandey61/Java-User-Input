import java.util.Scanner;
class Program4{

   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("ENter any character from a-z");
     char choice=sc.nextLine().charAt(0);
     switch(choice){
     
      case 'a':
        System.out.println("Your choice is "+choice+" inside case 1");
        break;

      case 'b':
        System.out.println("Your choice is "+choice+" inside case 2");
        break;
      case 'c':
        System.out.println("Your choice is "+choice+" inside case 3");
        break;
      case 'd':
        System.out.println("Your choice is "+choice+" inside case 4");
        break;
      case 'e':
        System.out.println("Your choice is "+choice+" inside case 5");
        break;
      default:
        System.out.println("Enter into the default Statement");


     }
    

 
   }



}