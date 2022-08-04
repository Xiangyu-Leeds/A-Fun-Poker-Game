package comp1721.cwk2;

import java.util.*;
import java.util.HashMap;
// Implement PokerHand class here
public class PokerHand extends CardCollection {
    List<Card> hand0 = new ArrayList<>();   // every card
    HashMap<Character, Integer> x = new HashMap<>();
    HashMap<Character, Card.Rank> xx = new HashMap<>();
    HashMap<Character, Card.Suit> l = new HashMap<>();

    public PokerHand(){

    }
    public void b(){  //hashmap to get key and value
        xx.put('A',Card.Rank.ACE);
        xx.put('2',Card.Rank.TWO);
        xx.put('3',Card.Rank.THREE);
        xx.put('4',Card.Rank.FOUR);
        xx.put('5',Card.Rank.FIVE);
        xx.put('6',Card.Rank.SIX);
        xx.put('7',Card.Rank.SEVEN);
        xx.put('8',Card.Rank.EIGHT);
        xx.put('9',Card.Rank.NINE);
        xx.put('T',Card.Rank.TEN);
        xx.put('J',Card.Rank.JACK);
        xx.put('Q',Card.Rank.QUEEN);
        xx.put('K',Card.Rank.KING);
    }
    public void c(){  // get the color
        l.put('C',Card.Suit.CLUBS);
        l.put('D',Card.Suit.DIAMONDS);
        l.put('H',Card.Suit.HEARTS);
        l.put('S',Card.Suit.SPADES);

    }
    public PokerHand(String s){
        b();
        c();

        if (s.length()==2){
                Card c= new Card(xx.get(s.charAt(0)),l.get(s.charAt(1)));
                hand0.add(c);
            }

        if (s.length()==5){
            Card c= new Card(xx.get(s.charAt(0)),l.get(s.charAt(1)));
            hand0.add(c);
            Card c1 = new Card(xx.get(s.charAt(3)),l.get(s.charAt(4)));
            hand0.add(c1);
        }
        if (s.length()==14){
            Card c= new Card(xx.get(s.charAt(0)),l.get(s.charAt(1)));
            hand0.add(c);
            Card c1 = new Card(xx.get(s.charAt(3)),l.get(s.charAt(4)));
            hand0.add(c1);
            Card c2 = new Card(xx.get(s.charAt(6)),l.get(s.charAt(7)));
            hand0.add(c2);
            Card c3 = new Card(xx.get(s.charAt(9)),l.get(s.charAt(10)));
            hand0.add(c3);
            Card c4 = new Card(xx.get(s.charAt(12)),l.get(s.charAt(13)));
            hand0.add(c4);
        }
        if (s.length()>14){
            throw new CardException("too many cards");
        }
    }
    public void add(Card card) {   // add card in one hand
        if (hand0.size()==5){
            throw new CardException("you can't add more");

        }
        int count=0;   //check if contains
        for (Card value : hand0) {
            if (value.getRank().getSymbol() == card.getRank().getSymbol() && value.getSuit().getSymbol() == card.getSuit().getSymbol()) {
                count++;
                break;
            }
        }
        if (count==0){
            hand0.add(card);
        }else {
            throw new CardException("repeated");
        }
    }
    @Override
    public String toString()        //return these cards
    {
        if (hand0.size()==0){
            return "";
        }
        else {
            b();
            c();
            StringBuilder s= new StringBuilder();
            for (int i = 0; i < hand0.size(); i++) {
               s.append(hand0.get(i).toString());
                if (i!=hand0.size()-1){
                    s.append(" ");
                }
            }
            return s.toString();
        }

    }

    public int size(){
        return  hand0.size();
    }  //get the size
    public void discard(){
        if (hand0.size()==0){
            throw new CardException("it is empty");
        }else {
            hand0.clear();
        }
    }


    public void discardTo (Deck deck){  // discard it to decks
        if (hand0.size()==0){
            throw new CardException("it is empty");

        }else {
            int count=0;
            int h = hand0.size();
            while (count<h) {
                deck.add(hand0.get(0));
                hand0.remove(0);
                h--;
            }
            }
        }



    public boolean isPair() {   //check 2 same
        Set<Character> s1 = new HashSet<>();
        for (Card card : hand0) {
            s1.add(card.getRank().getSymbol());
        }
        return s1.size() == 4;
    }

    public boolean isTwoPairs() {
        Set<Character> s1 = new HashSet<>();
        for (Card card : hand0) {
            s1.add(card.getRank().getSymbol());
        }
        if (s1.size() == 3) {
            int count = 1;
            HashMap<Integer, Character> x = new HashMap<>();
            for (int i = 0; i < hand0.size(); i++) {
                x.put(i, hand0.get(i).getRank().getSymbol());
            }
            Character m = x.get(0);
            for (int i = 1; i < hand0.size(); i++) {
                if (m == x.get(i)) {
                    count++;
                }
            }
            if (count==3) {
                return false;
            }
            if (count==2){
                return true;
            }
            if (count==1){
                Character n = x.get(1);
                for (int i = 2; i < hand0.size(); i++) {
                    if (n == x.get(i)) {
                        count++;
                    }
                }
                return count == 2;
            }

        }
    return false;
    }

    public boolean isThreeOfAKind() {   //check 3 same
        Set<Character> s1 = new HashSet<>();
        for (Card card : hand0) {
            s1.add(card.getRank().getSymbol());
        }
        if (s1.size() == 3) {
            int count = 1;
            HashMap<Integer, Character> x = new HashMap<>();
            for (int i = 0; i < hand0.size(); i++) {
                x.put(i, hand0.get(i).getRank().getSymbol());
            }
            Character m = x.get(0);
            for (int i = 1; i < hand0.size(); i++) {
                if (m == x.get(i)) {
                    count++;
                }
            }
            if (count==3) {
                return true;
            }
            if (count==1){
                Character n = x.get(1);
                for (int i = 2; i < hand0.size(); i++) {
                    if (n == x.get(i)) {
                        count++;
                    }
                }
                return count == 1 || count == 3;
            }

        }
        return false;
    }

    public boolean isFourOfAKind() {  //check 4 same
        Set<Character> s1 = new HashSet<>();
        for (Card card : hand0) {
            s1.add(card.getRank().getSymbol());
        }
        if (s1.size() == 2) {
            int count = 1;
            HashMap<Integer, Character> x = new HashMap<>();
            for (int i = 0; i < hand0.size(); i++) {
                x.put(i, hand0.get(i).getRank().getSymbol());
            }
            Character m = x.get(0);
            for (int i = 1; i < hand0.size(); i++) {
                if (m == x.get(i)) {
                    count++;
                }
            }
            return count != 2 && count != 3;
        } else {
            return false;
        }

    }


        public boolean isFullHouse () {
            Set<Character> s1 = new HashSet<>();
            for (Card card : hand0) {
                s1.add(card.getRank().getSymbol());
            }
            if (s1.size() == 2) {
                int count = 1;
                HashMap<Integer, Character> x = new HashMap<>();
                for (int i = 0; i < hand0.size(); i++) {
                    x.put(i, hand0.get(i).getRank().getSymbol());
                }
                Character m = x.get(0);
                for (int i = 1; i < hand0.size(); i++) {
                    if (m == x.get(i)) {
                        count++;
                    }
                }
                return count == 2 || count == 3;
            } else {
                return false;
            }
        }

        public boolean isFlush () {
            Set<Character> s1 = new HashSet<>();
            for (Card card : hand0) {
                s1.add(card.getSuit().getFancySymbol());
            }
            return s1.size() == 1;
        }
        public boolean isStraight () {
            int count=0;
            int count1=0;
            Set<Character> s1 = new HashSet<>();
            List<Integer> a=new ArrayList<>();
            for (Card element : hand0) {
                s1.add(element.getRank().getSymbol());
            }
            if (s1.size() == 5) {
//                HashMap<Character, Integer> x = new HashMap<Character, Integer>();
                a();
                for (Card card : hand0) {
                    a.add(x.get(card.getRank().getSymbol()));
                }
                for (Integer item : a) {
                    if (item == 1) {
                        count++;
                    }
                }
                if (count==0){
                    int c =Collections.min(a);
                    for (Integer integer : a) {
                        if (integer == c + 1) {
                            count1++;
                        }
                        if (integer == c + 2) {
                            count1++;
                        }
                        if (integer == c + 3) {
                            count1++;
                        }
                        if (integer == c + 4) {
                            count1++;
                        }

                    }
                }
                else {
                    for (Integer value : a) {
                        if (value == 2) {
                            count1++;
                        }
                    }
                    if (count1 == 1) {
                        for (Integer integer : a) {
                            if (integer == 3) {
                                count1++;
                            }
                            if (integer == 4) {
                                count1++;
                            }
                            if (integer == 5) {
                                count1++;
                            }
                        }
                    }else {
                        for (Integer integer : a) {
                            if (integer == 10) {
                                count1++;
                            }
                            if (integer == 11) {
                                count1++;
                            }
                            if (integer == 12) {
                                count1++;
                            }
                            if (integer == 13) {
                                count1++;
                            }
                        }
                    }
                }
                return count1 == 4;
            }
            return false;
        }
        public void a(){   // create hashmap to get key and value
            x.put('A',1);
            x.put('2',2);
            x.put('3',3);
            x.put('4',4);
            x.put('5',5);
            x.put('6',6);
            x.put('7',7);
            x.put('8',8);
            x.put('9',9);
            x.put('T',10);
            x.put('J',11);
            x.put('Q',12);
            x.put('K',13);
        }


    }

