package edu.cnm.deepdive.model;

import java.util.Comparator;

public class CardColorComparator implements Comparator<Card> {

  @Override
  public int compare(Card card1, Card card2) {
    int comparison = card1.getSuit().compareTo(card2.getSuit());
    if (comparison == 0) {
      comparison = card1.getRank().compareTo(card2.getRank());
    } else {
      int colorValue1 = getColorValue(card1);
      int colorValue2 = getColorValue(card2);
      comparison = colorValue1 - colorValue2;
    }
    return comparison;
  }

  private int getColorValue(Card card) {
    return (card.getSuit() == Suit.CLUBS || card.getSuit() == Suit.SPADES) ? 0 : 1;
  }

}
