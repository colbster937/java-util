package dev.colbster937.util;

public class WeightedObject<T> {
  private final T obj;
  private final int weight;

  public WeightedObject(final T obj, final int weight) {
    this.obj = obj;
    this.weight = weight;
  }

  public final T getObject() {
    return this.obj;
  }

  public final int getWeight() {
    return this.weight;
  }
}
