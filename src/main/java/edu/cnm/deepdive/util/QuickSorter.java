package edu.cnm.deepdive.util;

import edu.cnm.deepdive.model.Card;
import java.util.Random;

public class QuickSorter extends AbstractSorter {

  @Override
  public void sort(Card[] cards, int start, int finish) {
    Random rng = new Random();
    if (finish > start + 1) {
      int pivotSelector = start + rng.nextInt(finish - start);
      Card pivot = cards[pivotSelector];
      cards[pivotSelector] = cards[start];
      cards[start] = pivot;
      int marker = start;
      for (int cardIndex = start + 1; cardIndex < finish; cardIndex++) {
        Card current = cards[cardIndex];
        if (current.compareTo(pivot) <= 0) {
          marker++;
          if (marker < cardIndex) {
            Card temp = cards[marker];
            cards[cardIndex] = cards[marker];
            cards[marker] = current;
          }
        }
      }
      cards[start] = cards[marker];
      cards[marker] = pivot;
      sort(cards, start, marker);
      sort(cards, marker + 1, finish);
    }
  }

}
