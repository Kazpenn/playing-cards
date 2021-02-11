package edu.cnm.deepdive.model;

import java.util.Random;

public interface Dealable {

  void shuffle();

  void shuffle(Random rng);

  Dealable deal(int count);

  void sort();

}
