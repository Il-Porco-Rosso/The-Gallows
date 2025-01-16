import java.util.Scanner;

public class Game {
    private int wrongs = 0;
    private static final String valids[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static int rounds = 0;
    public static int dudeshanged = 0;
    public String allcorrectletters = "";
    private int turnspassed = 0;
    public String codewoord = "";
    private static String wordlist[] = {"she is perfect", "the muffin man", "the fighter donkey hops up", "ohh shrek", "with a dragon that breathes fire", "it is on my to do list",
"but how will you kiss me","i am not blocking","not exactly what i expected","donkey i am ok","he does not look so good","to move firewood","shrek heaves a deep sigh","a guard puts fiona on the back of his horse"
,"if we need you i will whistle","shrek fights them","some of you may die but that is a sacrifice i am willing to make","extinguishes","twenty pieces","he is getting away","you there ogre","what are you doing in my swamp"
,"listen little donkey","i like my privacy","i put up signs","all right get out of here","eat me","no no not the buttons","my lord we found it","keep off the grass shine your shoes wipe your face"};
    public boolean gamefinished = false;
    public String gamestatus = "playing";

    public Game() {
        Game.rounds++;
        this.codewoord = wordlist[(int)(Math.random() * wordlist.length)];
    }

    public String getSecrat() {
        if (this.gamefinished) {
            return codewoord;
        } 
        return null;
    }
    public int getWrongs() {
        return this.wrongs;
    }

    public static String getValids(int csharp) {
        return valids[csharp];
    }

    public int getTurnsPassed() {
        return this.turnspassed;
    }
    
    public void printTheLines() {
        int amountofunderscores = 0;
            for (int i = 0;i < this.codewoord.length();i++) {
                if (isAValidLetter(codewoord.substring(i,i+1))) {
                    if (containsRawLettuce(codewoord.substring(i,i+1), allcorrectletters)) { 
                        System.out.print(codewoord.substring(i,i+1).toUpperCase()+" ");
                    } else {
                        System.out.print("_ ");
                        amountofunderscores++;
                    }
                } else {
                    System.out.print("  ");
                    
                }
            }
        if (amountofunderscores == 0) {
            gamestatus = "won";
            gamefinished = true;
        }
        
    }
    

    private boolean containsLettuce(String guess) {
        int correctcheckcounter = 0;
        for (int i = 0;i < codewoord.length();i++) {
            if (guess.toLowerCase().equals(codewoord.substring(i,i+1))) {
                correctcheckcounter++;
            }
        }
        if (correctcheckcounter > 0) {
            this.allcorrectletters += guess;
            return true;
        } else {
            this.wrongs++;
        }
        return false;
        }

        public boolean containsRawLettuce(String that, String islocatedin) {
            int corrr = 0;
            for (int i = 0;i < islocatedin.length();i++) {
                if (that.toLowerCase().equals(islocatedin.substring(i,i+1))) {
                    corrr++;
                }
            }
            if (corrr > 0) {
                
                return true;
            } else {
                
            }
            return false;

        

        }

    
    public boolean isAValidLetter(String letter) {
        for (int c = 0;c < 26;c++) {
            if (letter.equals(valids[c])) {
                return true;
            }
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
           
                System.out.println("\n=====================================================");
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
