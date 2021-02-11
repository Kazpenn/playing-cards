package edu.cnm.deepdive.model;

public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;

  public char symbol() {
    char symbol = 0;
    switch (this) {
      case CLUBS:
        symbol = '\u2663';
        break;
      case DIAMONDS:
        symbol = '\u2662';
        break;
      case HEARTS:
        symbol = '\u2661';
        break;
      case SPADES:
        symbol = '\u2660';
        break;
    }
    return symbol;
  }

}
