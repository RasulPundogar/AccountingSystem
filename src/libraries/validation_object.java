/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;
import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.text.*;
/**
 *
 * @author Rasul-PC
 */
public class validation_object {
    Pattern pt = null;
    Matcher match = null;
    private static final Pattern pattern = Pattern.compile("^[a-zA-Z0-9\\s]{0,20}$");
    
    public String check_name(String name){
        String canonical = normalize(name);
        if (!pattern.matcher(canonical).matches()) {
          return ("Improper format in " + name + " field");
        }
        canonical = HTMLEntityEncode(canonical);
        return canonical;
    }
    
    private String normalize(String input) {
        String canonical = java.text.Normalizer.normalize(input, Normalizer.Form.NFKC);
        return canonical;
    }
    private static String HTMLEntityEncode(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
          char ch = input.charAt(i);
          if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
            sb.append(ch);
          } else {
            sb.append("&#").append((int)ch).append(";");
          }
        }
        return sb.toString();
    }
    
    public String prepare_data(String data){
        data = data.trim();
        data = data.replaceAll("[^a-zA-Z_-]+", "");
        return data;
    }
} // END OF CLASS

