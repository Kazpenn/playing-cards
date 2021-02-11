package edu.cnm.deepdive.controller;

import edu.cnm.deepdive.model.Deck;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
  }

}
