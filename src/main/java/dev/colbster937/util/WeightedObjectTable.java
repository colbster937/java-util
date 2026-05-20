package dev.colbster937.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;

@SuppressWarnings({ "varargs" })
public class WeightedObjectTable<T> {
  private final List<WeightedObject<T>> objects;
  private final SplittableRandom rng;

  @SafeVarargs
  public WeightedObjectTable(final long seed, final WeightedObject<T>... objects) {
    final List<WeightedObject<T>> lst = new ArrayList<>();

    Collections.addAll(lst, objects);

    this.objects = Collections.unmodifiableList(lst);
    this.rng = new SplittableRandom(seed);
  }

  public final T computeRandomObject() {
    final WeightedObject<T> first = this.objects.get(0);

    T ret = first.getObject();
    int totalWeight = first.getWeight();

    for (int i = 1; i < this.objects.size(); i++) {
      final WeightedObject<T> obj = this.objects.get(i);
      final int weight = obj.getWeight();

      totalWeight += weight;

      if (this.rng.nextInt(totalWeight) < weight) {
        ret = obj.getObject();
      }
    }

    return ret;
  }
}
