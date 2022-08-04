package comp1721.cwk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Implement Deck class here
public class Deck{
    List<Card> deck0=new ArrayList<>(); //deck is used to put 52 cards
    public Deck() {
        for (int i = 0; i < 4; i++) {
                if (i==0){
                    Card c =new Card(Card.Rank.ACE, Card.Suit.CLUBS);
                    deck0.add(c);
                    Card c0 =new Card(Card.Rank.TWO, Card.Suit.CLUBS);
                    deck0.add(c0);
                    Card c1 =new Card(Card.Rank.THREE, Card.Suit.CLUBS);
                    deck0.add(c1);
                    Card c2 =new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
                    deck0.add(c2);
                    Card c3 =new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
                    deck0.add(c3);
                    Card c4 =new Card(Card.Rank.SIX, Card.Suit.CLUBS);
                    deck0.add(c4);
                    Card c5 =new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
                    deck0.add(c5);
                    Card c6 =new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
                    deck0.add(c6);
                    Card c7 =new Card(Card.Rank.NINE, Card.Suit.CLUBS);
                    deck0.add(c7);
                    Card c8 =new Card(Card.Rank.TEN, Card.Suit.CLUBS);
                    deck0.add(c8);
                    Card c9 =new Card(Card.Rank.JACK, Card.Suit.CLUBS);
                    deck0.add(c9);
                    Card c10 =new Card(Card.Rank.QUEEN, Card.Suit.CLUBS);
                    deck0.add(c10);
                    Card c11 =new Card(Card.Rank.KING, Card.Suit.CLUBS);
                    deck0.add(c11);

                }
                if (i==1){
                    Card c =new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
                    deck0.add(c);
                    Card c0 =new Card(Card.Rank.TWO, Card.Suit.DIAMONDS);
                    deck0.add(c0);
                    Card c1 =new Card(Card.Rank.THREE, Card.Suit.DIAMONDS);
                    deck0.add(c1);
                    Card c2 =new Card(Card.Rank.FOUR, Card.Suit.DIAMONDS);
                    deck0.add(c2);
                    Card c3 =new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS);
                    deck0.add(c3);
                    Card c4 =new Card(Card.Rank.SIX, Card.Suit.DIAMONDS);
                    deck0.add(c4);
                    Card c5 =new Card(Card.Rank.SEVEN, Card.Suit.DIAMONDS);
                    deck0.add(c5);
                    Card c6 =new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
                    deck0.add(c6);
                    Card c7 =new Card(Card.Rank.NINE, Card.Suit.DIAMONDS);
                    deck0.add(c7);
                    Card c8 =new Card(Card.Rank.TEN, Card.Suit.DIAMONDS);
                    deck0.add(c8);
                    Card c9 =new Card(Card.Rank.JACK, Card.Suit.DIAMONDS);
                    deck0.add(c9);
                    Card c10 =new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS);
                    deck0.add(c10);
                    Card c11 =new Card(Card.Rank.KING, Card.Suit.DIAMONDS);
                    deck0.add(c11);
                }
                if (i==2){
                    Card c =new Card(Card.Rank.ACE, Card.Suit.SPADES);
                    deck0.add(c);
                    Card c0 =new Card(Card.Rank.TWO, Card.Suit.SPADES);
                    deck0.add(c0);
                    Card c1 =new Card(Card.Rank.THREE, Card.Suit.SPADES);
                    deck0.add(c1);
                    Card c2 =new Card(Card.Rank.FOUR, Card.Suit.SPADES);
                    deck0.add(c2);
                    Card c3 =new Card(Card.Rank.FIVE, Card.Suit.SPADES);
                    deck0.add(c3);
                    Card c4 =new Card(Card.Rank.SIX, Card.Suit.SPADES);
                    deck0.add(c4);
                    Card c5 =new Card(Card.Rank.SEVEN, Card.Suit.SPADES);
                    deck0.add(c5);
                    Card c6 =new Card(Card.Rank.EIGHT, Card.Suit.SPADES);
                    deck0.add(c6);
                    Card c7 =new Card(Card.Rank.NINE, Card.Suit.SPADES);
                    deck0.add(c7);
                    Card c8 =new Card(Card.Rank.TEN, Card.Suit.SPADES);
                    deck0.add(c8);
                    Card c9 =new Card(Card.Rank.JACK, Card.Suit.SPADES);
                    deck0.add(c9);
                    Card c10 =new Card(Card.Rank.QUEEN, Card.Suit.SPADES);
                    deck0.add(c10);
                    Card c11 =new Card(Card.Rank.KING, Card.Suit.SPADES);
                    deck0.add(c11);

                }
                if (i==3){
                    Card c =new Card(Card.Rank.ACE, Card.Suit.HEARTS);
                    deck0.add(c);
                    Card c0 =new Card(Card.Rank.TWO, Card.Suit.HEARTS);
                    deck0.add(c0);
                    Card c1 =new Card(Card.Rank.THREE, Card.Suit.HEARTS);
                    deck0.add(c1);
                    Card c2 =new Card(Card.Rank.FOUR, Card.Suit.HEARTS);
                    deck0.add(c2);
                    Card c3 =new Card(Card.Rank.FIVE, Card.Suit.HEARTS);
                    deck0.add(c3);
                    Card c4 =new Card(Card.Rank.SIX, Card.Suit.HEARTS);
                    deck0.add(c4);
                    Card c5 =new Card(Card.Rank.SEVEN, Card.Suit.HEARTS);
                    deck0.add(c5);
                    Card c6 =new Card(Card.Rank.EIGHT, Card.Suit.HEARTS);
                    deck0.add(c6);
                    Card c7 =new Card(Card.Rank.NINE, Card.Suit.HEARTS);
                    deck0.add(c7);
                    Card c8 =new Card(Card.Rank.TEN, Card.Suit.HEARTS);
                    deck0.add(c8);
                    Card c9 =new Card(Card.Rank.JACK, Card.Suit.HEARTS);
                    deck0.add(c9);
                    Card c10 =new Card(Card.Rank.QUEEN, Card.Suit.HEARTS);
                    deck0.add(c10);
                    Card c11 =new Card(Card.Rank.KING, Card.Suit.HEARTS);
                    deck0.add(c11);
                }

            }

        }
    public int size() {
        return deck0.size();
    }  //the size

    public void discard(){
        deck0.clear();
    }  // clear the cards
    public boolean isEmpty() {
        return deck0.size() == 0;
    }

    public boolean contains(Card card) {    // check if contains this card
        for (Card value : deck0) {
            if (value.getRank() == card.getRank() && value.getSuit() == card.getSuit()) {
                return true;
            }
        }
        return false;
    }


    public void shuffle() {
        Collections.shuffle(deck0);
    }  // shuffle these cards

    public void add(Card card) {
        deck0.add(card);
    }  // add cards
    public Card deal() {
        if (deck0.size()==0){
            throw new CardException("It is empty");
        }else {
            Card e = deck0.get(0);
            deck0.remove(0);
            return e;
        }

    }
}