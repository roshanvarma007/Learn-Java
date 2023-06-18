import java.util.Scanner; //first we  have to import java

public class InputScanner {

    public static void main(String[] args) {

        String str = "Please Entre Your Name , Age and Salary";
        System.out.println(str);
        
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        
        int age = scan.nextInt();
        float salary = scan.nextFloat();
        System.out.println("******");

        System.out.println("Your name is" + " " + name);
        System.out.println("Your age is" + " " + age);
        System.out.println("Your salary" + " " + salary);
        
        System.out.println("******");

    }

}
