public class ReturnVSprintln {
    public static void main(String[] args) {
      int data = getData();    
      System.out.println(data);
      String name = getName();
      System.out.println(getName());
    }
    
    public static int getData(){
return 100;  //return will give output , it will not display


    }

public static String getName(){
   System.out.println("Get emp name");
    return "Roshan Varma";

}


    
}
