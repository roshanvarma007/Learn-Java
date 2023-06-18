import java.util.Scanner;

public class GetInput {
   public static void main(String[] args){

    System.out.println("Discrbe Your self Name , Age , Adhar Card & Pan Card");
    Scanner scan = new Scanner(System.in);

    String name = scan.nextLine();
int age = scan.nextInt();
int adharcard = scan.nextInt();
int pancard = scan.nextInt();

System.out.println("My name is" + " " + name);
System.out.println("My age is" + " " + age);
System.out.println("My adharcard is" + " " + adharcard);
System.out.println("My pancard is" + " " + pancard);
        
    }
    
}
