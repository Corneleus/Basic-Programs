package BasicPrograms;
/*
* Cody Narber & Cory Caswell
* Blackjack (Dealing 2 cards only)
* TODO: Complete the code to compute the score for their given hand.
*/
import java.security.SecureRandom;


public class BlackJack {
   // Main method, that deals cards out to the house and player
   // It then displays the cards
   public static void main(String [] args){
      
      
      String playCard1=dealCard("","","","");//no cards drawn yet
      String houseCard1=dealCard(playCard1,"","","");
      String playCard2=dealCard(playCard1,houseCard1,"","");
      String houseCard2=dealCard(playCard1,houseCard1,playCard2,"");
    
      System.out.println("Player\'s Hand: "+playCard1+", "+playCard2);
      
      int playScore = computeHandScore(playCard1) + computeHandScore(playCard2);
      System.out.printf("The player has %d  points\n" , playScore);
      
      System.out.println("House\'s Hand: "+houseCard1+", "+houseCard2);      
      int houseScore = computeHandScore(houseCard1)+ computeHandScore(houseCard2);
      System.out.printf("The house has %d points\n", houseScore); 
      
      if (playScore > houseScore)
      {
      System.out.print("Player Wins This Round!");
      }     
      
      else if(playScore < houseScore) 
      {
      System.out.print("House Wins This Round!");
      }
      
      else if (playScore == houseScore)
      {
      System.out.print("Its a Tie!");      
      }
   }// end method main
   
  // converting back and fourth to and from a string
   public static int computeHandScore(String s)
   {
     String[] chars = new String[s.length()];
     
     for(int i = 0; i < s.length(); i++)
     {
     chars[i] = s.substring(i, i+1);
     }
     
    String str = "";
    
    for(int i = 0; i < chars.length; i++)
    {
    
    switch(chars[i])
    {
    // adds value based on letter or number to str
    case "K": str += "10";
    break;
    
    case "Q": str += "10";
    break;
    
    case "J": str += "10";
    break;
    
    case "10":  str += "10";
    break;
    
    case "9":  str += "9";
    break;
    
    case "8":  str += "8";
    break;
    
    case "7":  str += "7";
    break;
    
    case "6":  str += "6";
    break;
    
    case "5":  str += "5";
    break;
    
    case "4":  str += "4";
    break;
    
    case "3":  str += "3";
    break;
    
    case "2":  str += "2";
    break;
    
    case "A":  str += "11";
   }
   
  }
  // returns number for uses in score
  return Integer.parseInt(str);
 }   
   //TODO: Add in the computeHandScore method, so that it will compute the value \
   //given the two cards passed.
   
   
   
   //Given a potential cardFace, check to see if any of the other cards(c1-c4) match
   //true if there is at least one match
   public static boolean seenCard(String cardFace, String c1, String c2, String c3, String c4){
      boolean seenC1 = cardFace.equals(c1);
      boolean seenC2 = cardFace.equals(c2);
      boolean seenC3 = cardFace.equals(c3);
      boolean seenC4 = cardFace.equals(c4); 
      boolean seen = seenC1 || seenC2 || seenC3 || seenC4;
      return seen;
   }
   
   //Randomly selects a new card out of 52 possibilities , if the card is already chosen (c1-c4)
   //then another random card is chosen (repeating until a card drawn hasn't been seen)
   public static String dealCard(String c1, String c2, String c3, String c4){
      SecureRandom rand = new SecureRandom();
      int cardN = rand.nextInt(52);
      String cardFace = convertNumToCard(cardN);//2H. AD
                       
      while(seenCard(cardFace,c1,c2,c3,c4)){
         cardN = rand.nextInt(52);            
         cardFace = convertNumToCard(cardN);//2H. AD
      }  
      return cardFace; 
   }
   
   //Converts a numeric value (0-51) into a String representation
   //FaceValue followed by the Suit       
   public static String convertNumToCard(int card){
      int suitV = card/13;
      int cardV = card%13+2;
      String cardFace="";
      if(cardV<11) cardFace+=cardV; // 2-10
      else if(cardV==11) cardFace+="J";
      else if(cardV==12) cardFace+="Q";
      else if(cardV==13) cardFace+="K";            
      else if(cardV==14) cardFace+="A";                  
      if(suitV==0) cardFace+="H";//hearts
      if(suitV==1) cardFace+="C";//clubs      
      if(suitV==2) cardFace+="D";//diamonds
      if(suitV==3) cardFace+="S";//spades            
      return cardFace;
   }
}//end class