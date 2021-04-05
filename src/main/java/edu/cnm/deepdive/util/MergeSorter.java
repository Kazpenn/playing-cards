package edu.cnm.deepdive.util;

import edu.cnm.deepdive.model.Card;

public class MergeSorter extends AbstractSorter {

  @Override
  public void sort(Card[] cards, int start, int finish) {
    if (finish > start + 1) {
      // Divide
      int midpoint = (start + finish) / 2;
      sort(cards, start, midpoint);
      sort(cards, midpoint, finish);
      // Conquer
      Card[] merged = new Card[finish - start];
      int mergedIndex = 0;
      int leftIndex = start;
      int rightIndex = midpoint;
      while (leftIndex < midpoint && rightIndex < finish) {
        Card left = cards[leftIndex];
        Card right = cards[rightIndex];
        if (left.compareTo(right) <= 0) {
          merged[mergedIndex] = left;
          leftIndex++;
        } else {
          merged[mergedIndex] = right;
          rightIndex++;
        }
        mergedIndex++;
      }
      if (leftIndex < midpoint) {
        System.arraycopy(cards, leftIndex, merged, mergedIndex, midpoint - leftIndex);
      } else {
        System.arraycopy(cards, rightIndex, merged, mergedIndex, finish - rightIndex);
      }
      System.arraycopy(merged, 0, cards, start, finish - start);
    }
  }

}
