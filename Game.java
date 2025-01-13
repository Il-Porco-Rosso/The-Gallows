import java.util.Scanner;

public class Game {
    private int wrongs = 0;
    public static int rounds = 0;
    public static int dudeshanged = 0;
    private int turnspassed = 0;
    private String codewoord = "";
    private static String wordlist[] = {"she is perfect", "the muffin man", "the fighter donkey hops up", "ohh shrek", "with a dragon that breathes fire", "it is on my to do list",
"but how will you kiss me","I am not blocking","not exactly what i expected","donkey i am ok","He does not look so good","to move firewood","Shrek heaves a deep sigh","a guard puts fiona on the back of his horse"
,"if we need you i will whistle","shrek fights them","some of you may die but that is a sacrifice i am willing to make"};

    public Game() {
        Game.rounds++;
        this.codewoord = wordlist[(int)(Math.random() * wordlist.length)];
    }

    public int getWrongs() {
        return this.wrongs;
    }

    public int getTurnsPassed() {
        return this.turnspassed;
    }

     public static boolean promptGuessing() //prompts a guess and returns true or false depending
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        for (;!validAnswer;)
        {
            System.out.println("=====================================================");
            System.out.print("GUESS the letter: ");
            userAnswer = sc.nextLine();
            if ((userAnswer.equals("yes")) || (userAnswer.equals("no"))) {//checking if dude typed right letter
                validAnswer = true;
            } else {
                System.out.println("Plz type exactly either \"yes\" or \"no\". ");
            }
        }
        if (userAnswer.equals("yes")) {
            
            return true;
        }
        
        return false;
    }
}
