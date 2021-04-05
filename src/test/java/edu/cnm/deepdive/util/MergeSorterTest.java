package edu.cnm.deepdive.util;

import static org.junit.jupiter.api.Assertions.*;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Shoe;
import java.security.SecureRandom;
import org.junit.jupiter.api.Test;

class MergeSorterTest {

  @Test
  void sort() {
    Shoe shoe = new Shoe.Builder()
        .setRng(new SecureRandom())
        .setShuffle(true)
        .setNumDecks(100)
        .build();
    Card[] cards = shoe.toArray();
    MergeSorter sorter = new MergeSorter();
    sorter.sort(cards);
    Card left = cards[0];
    for (int i = 1; i < cards.length; i++) {
      Card right = cards[i];
      if (left.compareTo(right) > 0) {
        fail();
      }
      left = right;
    }
  }

}