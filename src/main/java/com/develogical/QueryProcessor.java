package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("your name")) {
      return "RobTeam";
    }

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
              + "English poet, playwright, and actor, widely regarded as the greatest "
              + "writer in the English language and the world's pre-eminent dramatist.";
    }


    if (query.toLowerCase().contains("multiplied by")) {
      String input = query.toLowerCase();
      Pattern pattern = Pattern.compile("(\\d+)\\s+multiplied by\\s+(\\d+)");
      Matcher matcher = pattern.matcher(input);

      if (matcher.find()) {
        int num1 = Integer.parseInt(matcher.group(1));
        int num2 = Integer.parseInt(matcher.group(2));

        return String.valueOf((num1*num2));
    }}
      if (query.toLowerCase().contains("minus")) {
        String input = query.toLowerCase();
        Pattern pattern = Pattern.compile("(\\d+)\\s+minus\\s+(\\d+)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
          int num1 = Integer.parseInt(matcher.group(1));
          int num2 = Integer.parseInt(matcher.group(2));

          return String.valueOf((num1-num2));
        }}
        if (query.toLowerCase().contains("plus")) {
          String input = query.toLowerCase();
          Pattern pattern = Pattern.compile("(\\d+)\\s+plus\\s+(\\d+)");
          Matcher matcher = pattern.matcher(input);

          if (matcher.find()) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(2));

            return String.valueOf((num1+num2)); }}
        if (query.toLowerCase().contains("which of the following numbers are primes")) {
          String input = query.toLowerCase();
          Pattern pattern = Pattern.compile("(\\d+)\\s+minus\\s+(\\d+)");
          Matcher matcher = pattern.matcher(input);

          if (matcher.find()) {
            int num1 = Integer.parseInt(matcher.group(1));
            int num2 = Integer.parseInt(matcher.group(2));

            return String.valueOf((num1-num2));
          }
  }
   return "";}}