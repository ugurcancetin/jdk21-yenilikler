package org.example.ffmapi.after;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class Demo {

  public static void main(String[] args) throws Throwable {
    try (Arena arena = Arena.ofConfined()) { // Otomatik bellek yönetimi
      MemorySegment str = arena.allocateUtf8String("Hello, FFM API!"); // Belleğe yaz

      // C'deki strlen fonksiyonunu çağır
      Linker linker = Linker.nativeLinker();
      SymbolLookup stdlib = linker.defaultLookup();
      MethodHandle strlen = linker.downcallHandle(
          stdlib.find("strlen").orElseThrow(),
          FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
      );

      long length = (long) strlen.invoke(str); // strlen çağrısı
      System.out.println("String length: " + length);
    }
  }
}
