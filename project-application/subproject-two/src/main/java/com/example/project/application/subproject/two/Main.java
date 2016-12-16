package com.example.project.application.subproject.two;

import com.example.project.lib.two.LibraryTwo;

public class Main {

   public static void main(String[] args) {
      LibraryTwo library = new LibraryTwo();

      System.out.println("Library says: " + library.saySomething() + " from subproject two.");
   }
}
