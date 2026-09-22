import java.util.Scanner;

public class Card
{
    //Instance variables
    private String rankString;
    private int rankNumber;
    private String suit;
    Scanner scan = new Scanner(System.in);
    
    //Establishes the properties of the card
    public Card()
    {
        rankString = "invalidNumber";
        rankNumber = 15;
        suit = "invalidSuit";
    }
    
    //Sets the rank
    public void setRankString(String x)
    {
        rankString = x.toUpperCase();
    }
    
    //Checks if the set rank is valid and assigns an integer value
    public void setRank()
    {        
        while (rankNumber == 15)
        {
            setRankString(scan.next());
            switch (rankString)
            {
                case "2":
                {
                    rankNumber = 2;
                    break;
                }
                case "3":
                {
                    rankNumber = 3;
                    break;
                }
                case "4":
                {
                    rankNumber = 4;
                    break;
                }
                case "5":
                {
                    rankNumber = 5;
                    break;
                }
                case "6":
                {
                    rankNumber = 6;
                    break;
                }
                case "7":
                {
                    rankNumber = 7;
                    break;
                }
                case "8":
                {
                    rankNumber = 8;
                    break;
                }
                case "9":
                {
                    rankNumber = 9;
                    break;
                }
                case "10":
                {
                    rankNumber = 10;
                    break;
                }
                case "JACK":
                {
                    rankNumber = 11;
                    break;
                }
                case "QUEEN":
                {
                    rankNumber = 12;
                    break;
                }
                case "KING":
                {
                    rankNumber = 13;
                    break;
                }
                case "ACE":
                {
                    rankNumber = 14;
                    break;
                }
                default:
                {
                    rankNumber = 15;
                    System.out.print("INVALID RANK, TRY AGAIN: ");
                    break;
                }
            }
        }
    }

    //Sets the suit
    public void setSuitString(String x)
    {
        suit = x.toUpperCase();
    }
    
    //Checks if the set suit is valid
    public void setSuit()
    {
        boolean validSuit = false;
        while (!validSuit)
        {
            setSuitString(scan.next());
            switch (suit)
            {
                case "CLUB":
                {
                    validSuit = true;
                    break;
                }
                case "DIAMOND":
                {
                    validSuit = true;
                    break;
                }
                case "HEART":
                {
                    validSuit = true;
                    break;
                }
                case "SPADE":
                {
                    validSuit = true;
                    break;
                }
                default:
                {
                    System.out.print("INVALID SUIT, TRY AGAIN: ");
                    break;
                }
            }
        }
    }
    
    public String getRankString()
    {
        return rankString;
    }
    
    public int getRankNumber()
    {
        return rankNumber;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public String toString()
    {
        String result = (rankString + " of " + suit + "s");
        return result;
    }
    
    
}