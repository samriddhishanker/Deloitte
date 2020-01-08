package com;

import java.util.ListResourceBundle;
public class Example_En extends ListResourceBundle {
	
   public Object[][] getContents() {
      return contents;
   }
   static final Object[][] contents = {
      {"INDIA", "IN"},
      {"USA", "US"},
      {"ENGLAND", "EN"},
   };
}