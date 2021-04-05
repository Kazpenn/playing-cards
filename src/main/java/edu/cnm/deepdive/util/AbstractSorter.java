package edu.cnm.deepdive.util;

import edu.cnm.deepdive.model.Card;

public abstract class AbstractSorter {

  public void sort(Card[] cards) {
    sort(cards, 0, cards.length);
  }

  public abstract void sort(Card[] cards, int start, int finish);
}
