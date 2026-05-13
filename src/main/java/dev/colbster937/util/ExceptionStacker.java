package dev.colbster937.util;

public final class ExceptionStacker {
  public static final String getFullStackString(final Throwable t) {
    final StringPrintStream sps = new StringPrintStream();
    t.printStackTrace(sps);
    return sps.toString();
  }
}
