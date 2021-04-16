package com.gs.collection;

import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

public class StringCharCount {

  private Map<Character, Long> buildCharCountMap(String str) { // count as LONG
 
    return str.chars()
             .mapToObj( i -> (char)i)   // MUST CONVERT TO Character Object
             .collect(
                     groupingBy(Function.identity(), counting())
                 );
    
  }

  
  public static void main(String[] args) {
 
    Map<Character, Long>  charCountMap =  new StringCharCount().buildCharCountMap("GeneliaGopal");
    //{p=1, a=2, e=2, G=2, i=1, l=2, n=1, o=1}

    System.out.println(charCountMap);
  }

}
