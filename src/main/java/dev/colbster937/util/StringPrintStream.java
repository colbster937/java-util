package dev.colbster937.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public final class StringPrintStream extends PrintStream {
  private final ByteArrayOutputStream buffer;

  public StringPrintStream() {
    super(new ByteArrayOutputStream(), true);
    this.buffer = (ByteArrayOutputStream) this.out;
  }

  @Override
  public final String toString() {
    try {
      return buffer.toString("UTF-8");
    } catch (final UnsupportedEncodingException ex) {
      return null;
    }
  }

  public final void reset() {
    buffer.reset();
  }
}
