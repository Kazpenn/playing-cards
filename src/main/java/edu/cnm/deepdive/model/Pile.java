package edu.cnm.deepdive.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Pile {

  private final List<Card> cards;

  public Pile() {
    cards = new ArrayList<>();
  }

  public void add(Card card) {
    cards.add(card);
  }

public Card draw() {
    return cards.remove(0);
  }

  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
  }

  public void sort() {
    Collections.sort(cards);
  }

  public void sort(Comparator<Card> comparator) {
    cards.sort(comparator);
  }

  public void clear() {
    cards.clear();
  }

  public int size() {
    return cards.size();
  }

  @Override
  public String toString() {
    return cards.toString();
  }

}
