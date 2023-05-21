public class FunctionExampla {
    public static void main(String[] args) {
        
        int Radha = 18;
        int Krishna = 21;

        // im calling to my function 
        getDaysFromAge(Radha);
        getDaysFromAge(Krishna);

    }public static void getDaysFromAge(int age){

        System.out.println("User age in days");
        System.out.println(age*365);

    }
    
}
