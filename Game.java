import java.util.Scanner;

public class Game {
    private int wrongs = 0;
    private static final String valids[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static int rounds = 0;
    public static int dudeshanged = 0;
    public String lastcorrectletter = "";
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

    private boolean containsLettuce(String guess) {
        int correctcheckcounter = 0;
        for (int i = 0;i < codewoord.length();i++) {
            if (guess.equals(codewoord.substring(i,i+1))) {
                correctcheckcounter++;
            }
        }
        if (correctcheckcounter > 0) {
            this.lastcorrectletter = guess;
            return true;
        }
        return false;

    }

     public boolean promptGuessing() //prompts a guess and returns true or false depending
    {
        Scanner sc = new Scanner(System.in);
        boolean validAnswer = false;
        String userAnswer = "";
        int validthingcounter = 0;
        for (;!validAnswer;)
        {
            System.out.println("=====================================================");
            System.out.print("GUESS a letter: ");
            userAnswer = sc.nextLine();
            while (validthingcounter == 0) {
                for (int i = 0; i < 26;i++) {
                    if ((userAnswer.equals(valids[i]))) {//checking if dude typed right letter
                        validthingcounter++;
                    } 
                }
            }
            if (validthingcounter > 0) {
                validAnswer = true;
            }
        }
        return this.containsLettuce(userAnswer);
    }
}
