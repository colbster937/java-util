package dev.colbster937.util;

public abstract class WeightedObject {
  private final WeightedObject obj;
  private final int weight;

  public WeightedObject(final WeightedObject obj, final int weight) {
    this.obj = obj;
    this.weight = weight;
  }

  public final WeightedObject getObject() {
    return this.obj;
  }

  public final int getWeight() {
    return this.weight;
  }
}
