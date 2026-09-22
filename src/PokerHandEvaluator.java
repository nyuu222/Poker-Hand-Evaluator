import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PokerHandEvaluator {
    public static void main(String[] args) {
        //The cards
        Card card0 = new Card();
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();
        Card card6 = new Card();
        
        //Makes an array list for all cards
        ArrayList <Card> hand = new ArrayList <Card>();
        hand.addAll(Arrays.asList(card0, card1, card2, card3, card4, card5,
                card6));

        
        //Allows the user to set the cards
        System.out.print("FIRST TABLE CARD RANK: ");
        card0.setRank();
        System.out.print("FIRST TABLE CARD SUIT: ");
        card0.setSuit();
        System.out.print("SECOND TABLE CARD RANK: ");
        card1.setRank();
        System.out.print("SECOND TABLE CARD SUIT: ");
        card1.setSuit();
        System.out.print("THIRD TABLE CARD RANK: ");
        card2.setRank();
        System.out.print("THIRD TABLE CARD SUIT: ");
        card2.setSuit();
        System.out.print("FOURTH TABLE CARD RANK: ");
        card3.setRank();
        System.out.print("FOURTH TABLE CARD SUIT: ");
        card3.setSuit();
        System.out.print("FIFTH TABLE CARD RANK: ");
        card4.setRank();
        System.out.print("FIFTH TABLE CARD SUIT: ");
        card4.setSuit();
        System.out.print("FIRST HOLE CARD RANK: ");
        card5.setRank();
        System.out.print("FIRST HOLE CARD SUIT: ");
        card5.setSuit();
        System.out.print("SECOND HOLE CARD RANK: ");
        card6.setRank();
        System.out.print("SECOND HOLE CARD SUIT: ");
        card6.setSuit();
        
        
        //Orders the cards
        Collections.sort(hand, Comparator.comparingInt(Card::getRankNumber));
        
        
        //ROYAL FLUSH CHECKER
        for (int i = 0; i < 3; i++)
        {
            if (hand.get(i).getRankNumber() == 10)
            {
                for (int j = i+1; j < 4; j++)
                {
                    if ((hand.get(j).getRankNumber() == 11) && (hand.get(j).getSuit().equals(hand.get(i).getSuit())))
                    {
                        for (int k = j+1; k < 5; k++)
                        {
                            if ((hand.get(k).getRankNumber() == 12) && (hand.get(k).getSuit().equals(hand.get(i).getSuit())))
                            {
                                for (int l = k+1; l < 6; l++)
                                {
                                    if ((hand.get(l).getRankNumber() == 13) && (hand.get(l).getSuit().equals(hand.get(i).getSuit())))
                                    {
                                        for (int m = l+1; m < 7; l++)
                                        {
                                            if ((hand.get(m).getRankNumber() == 14) && (hand.get(l).getSuit().equals(hand.get(i).getSuit())))
                                            {
                                                System.out.println("\nROYAL FLUSH");
                                                System.exit(0);
                                            }}}}}}}}}}
        
        
        
        
        //STRAIGHT FLUSH CHECKER
        for (int i = 6; i > 3; i--)
        {
            for (int j = i-1; j > 2; j--)
            {
                if ((hand.get(j).getRankNumber() == hand.get(i).getRankNumber()-1) && (hand.get(j).getSuit().equals(hand.get(i).getSuit())))
                {
                    for (int k = j-1; k > 1; k--)
                    {
                        if ((hand.get(k).getRankNumber() == hand.get(j).getRankNumber()-1) && (hand.get(k).getSuit().equals(hand.get(i).getSuit())))
                        {
                            for (int l = k-1; l > 0; l--)
                            {
                                if ((hand.get(l).getRankNumber() == hand.get(k).getRankNumber()-1) && (hand.get(l).getSuit().equals(hand.get(i).getSuit())))
                                {    
                                    for (int m = l-1; m >= 0; m--)
                                    {
                                        if ((hand.get(m).getRankNumber() == hand.get(l).getRankNumber()-1) && (hand.get(m).getSuit().equals(hand.get(i).getSuit())))
                                        {
                                            System.out.println("\n" + hand.get(i).getRankString() + " HIGH STRAIGHT FLUSH");
                                            System.exit(0);
                                        }}}}}}}}}
        
        
        
        //5 HIGH STRAIGHT FLUSH CHECKER
        for (int i = 0; i < 3; i++)
        {
            if (hand.get(i).getRankNumber() == 2)
            {
                for (int j = i+1; j < 4; j++)
                {
                    if ((hand.get(j).getRankNumber() == 3) && (hand.get(j).getSuit().equals(hand.get(i).getSuit())))
                    {
                        for (int k = j+1; k < 5; k++)
                        {
                            if ((hand.get(k).getRankNumber() == 4) && (hand.get(k).getSuit().equals(hand.get(i).getSuit())))
                            {
                                for (int l = k+1; l < 6; l++)
                                {
                                    if ((hand.get(l).getRankNumber() == 5) && (hand.get(l).getSuit().equals(hand.get(i).getSuit())))
                                    {
                                        for (int m = l+1; m < 7; m++)
                                        {
                                            if ((hand.get(m).getRankNumber() == 14) && (hand.get(l).getSuit().equals(hand.get(i).getSuit())))
                                            {
                                                System.out.println("\n5 HIGH STRAIGHT FLUSH");
                                                System.exit(0);
                                            }}}}}}}}}}
        
        
        
        
        //FOUR OF A KIND CHECKER
        for (int i = 6; i > 2; i--)
        {
            for (int j = i-1; j > 1; j--)
            {
                if ((hand.get(j).getRankNumber() == hand.get(i).getRankNumber()))
                {
                    for (int k = j-1; k > 0; k--)
                    {
                        if ((hand.get(k).getRankNumber() == hand.get(i).getRankNumber()))
                        {
                            for (int l = k-1; l >= 0; l--)
                            {
                                if ((hand.get(l).getRankNumber() == hand.get(i).getRankNumber()))
                                {
                                    System.out.println("\n" + hand.get(i).getRankString() + " HIGH FOUR OF A KIND");
                                    System.exit(0);
                                    
                                }}}}}}}
        
        
        
        
        //FULL HOUSE CHECKER
        for (int i = 6; i > 1; i--)
        {
            if ((hand.get(i).getRankNumber() == hand.get(i-1).getRankNumber()) && (hand.get(i).getRankNumber() == hand.get(i-2).getRankNumber()))
            {
                for (int j = 6; j > 0; j--)
                {
                    if ((hand.get(j).getRankNumber() == hand.get(j-1).getRankNumber()) && (hand.get(j).getRankNumber() != hand.get(i).getRankNumber()))
                    {
                        System.out.println("\n" + hand.get(i).getRankString() + " HIGH FULL HOUSE");
                        System.exit(0);
                    }}}}
            
            
            
          
        //FLUSH CHECKER
        for (int i = 6; i > 3; i--)
        {
            for (int j = i-1; j > 2; j--)
            {
                if (hand.get(j).getSuit().equals(hand.get(i).getSuit()))
                {
                    for (int k = j-1; k > 1; k--)
                    {
                        if (hand.get(k).getSuit().equals(hand.get(i).getSuit()))
                        {
                            for (int l = k-1; l > 0; l--)
                            {
                                if (hand.get(l).getSuit().equals(hand.get(i).getSuit()))
                                {
                                    for (int m = l-1; m >= 0; m--)
                                    {
                                        if (hand.get(m).getSuit().equals(hand.get(i).getSuit()))
                                        {
                                            System.out.println("\n" + hand.get(i).getRankString() + " HIGH FLUSH");
                                            System.exit(0);
                                        }}}}}}}}}
        
        
        
        
        //STRAIGHT CHECKER
        for (int i = 6; i > 3; i--)
        {
            for (int j = i-1; j > 2; j--)
            {
                if ((hand.get(j).getRankNumber() == hand.get(i).getRankNumber()-1))
                {
                    for (int k = j-1; k > 1; k--)
                    {
                        if ((hand.get(k).getRankNumber() == hand.get(j).getRankNumber()-1))
                        {
                            for (int l = k-1; l > 0; l--)
                            {
                                if ((hand.get(l).getRankNumber() == hand.get(k).getRankNumber()-1))
                                {   
                                    for (int m = l-1; m >= 0; m--)
                                    {
                                        if ((hand.get(m).getRankNumber() == hand.get(l).getRankNumber()-1))
                                        {
                                            System.out.println("\n" + hand.get(i).getRankString() + " HIGH STRAIGHT");
                                            System.exit(0);
                                        }}}}}}}}}
        
        
    
        
        //5 HIGH STRAIGHT CHECKER
        for (int i = 0; i < 7; i++)
        {
            if (hand.get(i).getRankNumber() == 2)
            {
                for (int j = i+1; j < 7; j++)
                {
                    if ((hand.get(j).getRankNumber() == 3))
                    {
                        for (int k = j+1; k < 7; k++)
                        {
                            if ((hand.get(k).getRankNumber() == 4))
                            {
                                for (int l = k+1; l < 7; l++)
                                {
                                    if ((hand.get(l).getRankNumber() == 5))
                                    {
                                        for (int m = l+1; m < 7; m++)
                                        {
                                            if ((hand.get(m).getRankNumber() == 14))
                                            {
                                                System.out.println("\n5 HIGH STRAIGHT");
                                                System.exit(0);
                                            }}}}}}}}}}
        
        
        
        
        //THREE OF A KIND CHECKER
        for (int i = 6; i > 1; i--)
        {
            if ((hand.get(i).getRankNumber() == hand.get(i-1).getRankNumber()) && (hand.get(i).getRankNumber() == hand.get(i-2).getRankNumber()))
            {
                System.out.println("\n" + hand.get(i).getRankString() + " HIGH THREE OF A KIND");
                System.exit(0);
            }}
        
        
        
        
        //TWO PAIR CHECKER
        for (int i = 6; i > 2; i--)
        {
            if ((hand.get(i).getRankNumber() == hand.get(i-1).getRankNumber()))
            {
                for (int j = i-2; j > 0; j--)
                {
                    if ((hand.get(j).getRankNumber() == hand.get(j-1).getRankNumber()))
                    {
                        System.out.println("\n" + hand.get(i).getRankString() + " HIGH TWO PAIR");
                        System.exit(0);
                    }}}}
        
        
        
        
        //PAIR CHECKER
        for (int i = 6; i > 0; i--)
        {
            if ((hand.get(i).getRankNumber() == hand.get(i-1).getRankNumber()))
            {
                System.out.println("\nPAIR OF " + hand.get(i).getRankString() + "S");
                System.exit(0);
            }}
        
        
        
        
        //HIGH CARD FINDER
        System.out.println("\n" + hand.get(6).getRankString() + " HIGH");
}}        