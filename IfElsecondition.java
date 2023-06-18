public class IfElsecondition {

    public static void main(String[] args) {

        int a = 10;
        String name = "Roshan";

        if (a == 10 && name == "Roshan") // if a is equal to our value
            System.out.println("Yes ,You are right");

        else if (a == 15) { // elseif for match to other value
            System.out.println("Second case is right");
        } else if (a == 20) {
            System.out.println("Third Condition Is Right");

        }

        else // else show me other
            System.out.println("Try again");
    }

}
