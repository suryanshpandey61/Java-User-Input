import java.util.Scanner;
class Program5{
   
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any value:");
     char ch=sc.next().charAt(0);
     switch(ch){
        case 'a':
        case 'A':
	case 'e':
	case 'E':
	case 'i':
	case 'I':
	case 'o':
	case 'O':
	case 'u':
	case 'U':
	   System.out.println("Your choice is a Vowel & is :"+ch);
           break;
        case '0':
        case '1':
	case '2':
	case '3':
	case '4':
	case '5':
	case '6':
	case '7':
	case '8':
	case '9':
          System.out.println("Your choice is a Numeric Character & is :"+ch);
          break;
    
        default:
         System.out.println("Defauls Case Statement");
        


     }
 
  }
 
}