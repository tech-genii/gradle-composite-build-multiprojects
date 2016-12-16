package com.example.project.application.subproject.one;

import com.example.project.lib.one.LibraryOne;

public class Main {

   public static void main(String[] args) {
      LibraryOne library = new LibraryOne();

      System.out.println("Library says: " + library.saySomething() + " from subproject one.");
   }
}
