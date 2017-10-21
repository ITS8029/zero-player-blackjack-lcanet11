package com.adampolt;

public class ZeroPlayerBlackjack {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the casino!");
		// TODO Auto-generated method stub
		Deck myDeck=new Deck();
		Card myCard=myDeck.drawCard();
		int cardValue=myCard.getValue();
		String cardSuit=myCard.getSuitName();
		String cardName=myCard.toString();
		
		System.out.println("You got a " + cardName);
		System.out.println("Your total is " + cardValue);
		
		Card myCard1=myDeck.nextCard();
		System.out.println("You got a " + cardName);

	}

