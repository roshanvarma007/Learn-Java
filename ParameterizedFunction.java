public class ParameterizedFunction { // parameter is also called a agrs or argument
    public static void main(String[] args) {

        int user1Age = 20;
        getAgeInDays(user1Age);

        int user2Age = 15;
        getAgeInDays(user2Age);

        int ammout = 5000;
        int time = 5;
        int rate = 12;
        calculateIntrestRate(ammout, time, rate);

    }

    public static void getAgeInDays(int age) {
        System.out.println(age * 365);

    }

    public static void calculateIntrestRate(int ammout, int time, int rate) {
        System.out.println(ammout * time * rate / 100);

    }
}
