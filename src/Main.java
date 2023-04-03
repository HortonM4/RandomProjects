import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] compliments = {
                "You're awesome!",
                "You're a rockstar!",
                "You're a superhero!",
                "You're a genius!",
                "You're a legend!",
                "You're a master of your craft!",
                "You're amazing!",
                "You're a shining star!"
        };

        Random rand = new Random();
        int randomIndex = rand.nextInt(compliments.length);

        System.out.println(compliments[randomIndex]);
    }
}