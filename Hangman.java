public class Hangman {
    public static void main(String[] args) {
        
        Game gallows = new Game();
        while (!gallows.gamefinished) {
            draw(gallows.getWrongs());
            gallows.printTheLines();
            if (!gallows.gamefinished) {
                gallows.promptGuessing();
                if (gallows.getWrongs() > 4) {
                    gallows.gamefinished = true;
                    gallows.gamestatus = "lose";
                }
            }
        }
        draw(gallows.getWrongs());
        if (gallows.gamestatus == "won") {
            System.out.println("============================================");
            System.out.print("You win!!!! The word/phrase was: ");
            System.out.println(gallows.getSecrat());
            System.out.println("============================================");
        } else {
          System.out.println("============================================");
            System.out.print("Oh no he died!!!! The word/phrase was: ");
            System.out.println(gallows.getSecrat());
            loser();
        }
        



    }
//------------------------------------------------------------
//-------------------------------------------------------------
    public static void drawEmptyletters() {
      
    }

    public static void draw(int mess) {
            System.out.println("--------------------------------------------");    
            System.out.println("-------|==========================|---------");     
            System.out.println("-------|==========================|---------");       
            System.out.println("-----------||---------------|---|-----------");     
            System.out.println("-----------||---------------|---|-----------");  //5
          if (mess > 4) {
            System.out.println("--------_/|||//-------------|---|-----------");    
            System.out.println("--------/|x x//|------------|---|-----------");  
            System.out.println("----------\\_^/\\-------------|---|-----------"); //8
          } else {
            System.out.println("----------------------------|---|-----------");    
            System.out.println("----------------------------|---|-----------");  
            System.out.println("----------------------------|---|-----------"); //8
          }  
          if (mess > 3) {
            System.out.println("----------_| |_-------------|---|-----------");
            System.out.println("--------/   \\/  \\-----------|---|-----------");
            System.out.println("--------|       |-----------|---|-----------"); //11
          } else {
            System.out.println("----------------------------|---|-----------");
            System.out.println("----------------------------|---|-----------");
            System.out.println("----------------------------|---|-----------");} //11
          if (mess > 2) {
            System.out.println("--------|       |-----------|---|-----------");  
            System.out.println("--------|_     _|-----------|---|-----------");  
            System.out.println("--------()     ()-----------|---|-----------"); 
          } else {
            System.out.println("----------------------------|---|-----------");  
            System.out.println("----------------------------|---|-----------");  
            System.out.println("----------------------------|---|-----------"); }
          if (mess > 1) {
            System.out.println("----------|    |------------|---|-----------"); 
            System.out.println("----------|    |------------|---|-----------");
            System.out.println("----------|    |------------|---|-----------");
          } else {
            System.out.println("----------------------------|---|-----------"); 
            System.out.println("----------------------------|---|-----------");
            System.out.println("----------------------------|---|-----------");
          }
          if (mess > 0){
            System.out.println("----------|    |------------|---|-----------");
            System.out.println("----------|____|------------|---|-----------");
            System.out.println("-----------\\/\\/-------------|---|-----------");
          } else {
            System.out.println("----------------------------|---|-----------"); 
            System.out.println("----------------------------|---|-----------");
            System.out.println("----------------------------|---|-----------");
          }
            System.out.println("----------------------------|---|-----------");
            System.out.println("--------------------------------------------");

/*
        //System.out.println("--------------------------------------------");//     _/|||//
      //  System.out.println("-------|==========================|---------");//     /|x x//|
    //    System.out.println("-------|==========================|---------");//       \_^/\
  //      System.out.println("-----------||---------------|---|-----------");//       _| |_
//        System.out.println("-----------||---------------|---|-----------");//5    /   \/  \
        //System.out.println("----------------------------|---|-----------");//     |       |
      //  System.out.println("----------------------------|---|-----------");//     |       |
    //    System.out.println("----------------------------|---|-----------");//8    |_     _| 
  //      System.out.println("----------------------------|---|-----------");//     ()     ()
//        System.out.println("----------------------------|---|-----------");//10     |    |
        //System.out.println("----------------------------|---|-----------");//       |    |
      //  System.out.println("----------------------------|---|-----------");//       |    |
    //    System.out.println("----------------------------|---|-----------");//       |    |
  //      System.out.println("----------------------------|---|-----------");//       |____|
//        System.out.println("----------------------------|---|-----------");//        \/\/
        //System.out.println("----------------------------|---|-----------");//
      //  System.out.println("----------------------------|---|-----------");//
    //    System.out.println("----------------------------|---|-----------");//
  //      System.out.println("----------------------------|---|-----------");//
        //System.out.println("----------------------------|---|-----------");//
      //  System.out.println("----------------------------|---|-----------");//
    //    System.out.println("--------------------------------------------");//
    */
    }
    public static void loser(){
        System.out.println("U DUMB!");
    }
}
//-------------------------------------------------------------
