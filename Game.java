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
,"listen little donkey","i like my privacy","i put up signs","all right get out of here","eat me","no no not the buttons","my lord we found it","please keep off the grass shine your shoes wipe your face"
/*NEXT THINGS ARENT RELATED TO SHREK */,"we are assassins our target is our teacher","sir do we have to call you sir","thing is i dont have the kind of name you just give to people","hi i am from the ministry of defence",
"do the deed and you get ten billion","i am a gifted improviser","tenticles","seventy percent of the moon gone","a three hundred fifty kilometer per hour fastball","his top speed is mach twenty",
"which one of you rejcts wants this thing","you were comedic relief dude that is big","just a ten caliber nothing special","he even knows the lines","death is an occupational hazard","an anti me bb",
"rumor christened him the reaper","this is my afternoon snack","tadaomi karasuma","that was one of our m sixties","second blade","like a python","do not hate assassination","time to laze the day away",
/*NEXT THINGS ARENT RELATED TO ASSASSINATION CLASSROOM */"but my lord is it legal","i will make it legal","he will not be trained","misa called jar jar binks","roger roger","does not compute uhh you are under arrest",
"we are taking them to coruscant","the ambassadors are jedi knights i beleive","no need to report that to him","i love democracy","negotiations were short",
/*NEXT THINGS ARENT RELATED TO STAR WARS */"we are the knights of the round table","how do you know she is a witch","are you suggesting coconuts can migrate","she turned me into a newt","tis but a scratch",
"what are you gonna do bleed on me","we are the knights who say ni","it is the old man from scene twenty four","there are some who call me tim","one rabbit stew coming right up","he aint got shit all over him"
,"what is the airspeed velocity of an unladen swallow","holy hand grenade","pie jesu domine dona eis requiem","no singing","you will be stone dead in a few minutes","do me a favour","i do not want to go on the cart","i am thirty-seven i am not old","i thought we were an autonomous collective",
"we eat ham and jam and spam a lot","shut up","you got bad breath","you are in great peril","scilence foul temptress","i bet you are gay","shut your noise and get that suit on","did you kill all those guards","camelot is very good pig country",
/*NEXT THINGS ARENT RELATED TO MONTY PYTHON AN THE HOLY GRAIL */"welcome to the j","jungle one do you copy","they should give me a raise as a private","no do not waste it","fm comms work","i am glad the chicken has died for our cause"
,"everyone outta die someday red","number twenty three","it is very bland","could use some seasoning",
/*NEXT THINGS ARENT RELATED TO BUSINESS INSIDER JUNGLE SCHOOL VIDEO */"i hurt people","hey look buddy i am an engineer","be polite","be efficient","have a plan to kill everyone you meet","i am heavy weapons guy",
"who touched my gun","no that would be your mother","he punched out all my blood","piss","what makes me a good demoman","i do not think it is anything to worry about","doctor assisted homicide","cry some more",
"im a force o nature","that soldier is a bloody spy","spy around here","last one alive lock the door","do you believe in magic","nice hustle tons of fun"};
    public boolean gamefinished = false;
    public String gamestatus = "playing";

    public Game() {
        Game.rounds++;
        this.codewoord = wordlist[(int)(Math.random() * (wordlist.length + 1 ))];
        //System.out.println(this.codewoord);
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
    

    private boolean containsLettuce(String guess) { // checks if guess is correct
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

     public void promptGuessing() //prompts a guess and returns true or false depending
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
                    break;
                }
                if (validthingcounter > 0) {
                    validAnswer = true;
                } 
            
        }

        this.containsLettuce(userAnswer);
    }
}
