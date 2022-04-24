/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year_month_grouper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class Year_month_grouper {
    
     public static int createRandomYearBetween(int start) {
        return start + (int) Math.round(Math.random() * (2022 - start));
    }
     
     public static int createRandomMonthBetween(int start) {
        return start + (int) Math.round(Math.random() * (12 - start));
    }
     
     public static int createRandomDayBetween(int start) {
        return start + (int) Math.round(Math.random() * (28 - start));
    }
    
    public static LocalDate createRandomDate(int startYear) {
        int day = createRandomDayBetween(1);
        int month = createRandomMonthBetween(1);
        int year = createRandomYearBetween(startYear);
        return LocalDate.of(year, month, day);
    }
    
    static  Map<String, Integer> randomDateGenerator(int start, int n){
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            LocalDate randomDate = createRandomDate(start);
            String to_string = randomDate.toString();
            myMap.put(to_string, i);            
        }
        System.out.println("******* RANDOM DATES ***********");
        for (Map.Entry mapElement : myMap.entrySet()) {
            String key = (String)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            System.out.println(key);
        }
        
        return myMap;
    
    }
    
    static HashMap<String, Integer> yearMonthGrouper(Map<String, Integer> parametre){
       HashMap<String,Integer> my_map = new HashMap();
       int jan=0,feb=0,march=0,april=0,may=0,jun=0,june=0,agust=0,sep = 0,octo = 0,nov = 0,december = 0;                    
       for (Map.Entry mapElement : parametre.entrySet()) {
            String key = (String)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            String modified = ((String)mapElement.getKey().toString());
            char[] Array = modified.toCharArray();
            char s = Array[5];
            char b = Array[6];
            char k = Array[2];
            char g = Array[3];
            String ay = String.valueOf(s)+String.valueOf(b);
            String yıl = String.valueOf(k)+String.valueOf(g);          
            if(ay.equals("01")){
               jan += 1;      
            }else if(ay.equals("02")){
                feb +=1;
            }else if(ay.equals("03")){
                march +=1;
            }
            else if(ay.equals("04")){
                april +=1;            
            }else if(ay.equals("05")){
              may +=1;
            }else if(ay.equals("06")){
               jun += 1;
            }
            else if(ay.equals("07")){
               june +=1;
              }
            else if(ay.equals("08")){
               agust +=1;
            }
            else if(ay.equals("09")){
               sep +=1;
            }
            else if(ay.equals("10")){
               octo +=1;
            }
            else if(ay.equals("11")){
               nov +=1;
            }else if(ay.equals("12")){
               december +=1;
            }        
        }
           for (Map.Entry mapElement : parametre.entrySet()) {
                 String key = (String)mapElement.getKey();
                  int value = ((int)mapElement.getValue());
                  String modified = ((String)mapElement.getKey().toString());
                  char[] Array = modified.toCharArray();
                  char s = Array[5];
                  char b = Array[6];
                  char k = Array[2];
                  char g = Array[3];
                  String ay = String.valueOf(s)+String.valueOf(b);
                  String yıl = String.valueOf(k)+String.valueOf(g);                 
            if(ay.equals("01")){
                String m = "Jan-";
                String merge = m + yıl;
                my_map.put(merge, jan);
            }else if(ay.equals("02")){
                String m = "Feb-";
                String merge = m + yıl;
                my_map.put(merge, feb);
            }else if(ay.equals("03")){
                String m = "Mar-";
                String merge = m + yıl;
                my_map.put(merge, march);
            }
            else if(ay.equals("04")){
                String m = "Apr-";
                String merge = m + yıl;
                my_map.put(merge, april);           
            }else if(ay.equals("05")){
                String m = "May-";
                String merge = m + yıl;
                my_map.put(merge, may);              
            }else if(ay.equals("06")){
                String m = "Jun-";
                String merge = m + yıl;
                my_map.put(merge, june);
            }
            else if(ay.equals("07")){
                String m = "Jul-";
                String merge = m + yıl;
                my_map.put(merge, jun);
              }
            else if(ay.equals("08")){
                String m = "Aug-";
                String merge = m + yıl;
                my_map.put(merge, agust);
            }
            else if(ay.equals("09")){
                String m = "Sep-";
                String merge = m + yıl;
                my_map.put(merge, sep);
            }
            else if(ay.equals("10")){
                String m = "Oct-";
                String merge = m + yıl;
                my_map.put(merge, octo);
            }
            else if(ay.equals("11")){
                String m = "Nov-";
                String merge = m + yıl;
                my_map.put(merge, nov);
            }else if(ay.equals("12")){
                String m = "Dec-";
                String merge = m + december;
                my_map.put(merge, jan);
            }
              
      }
        return my_map;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Map<String, Integer> a = new HashMap<String, Integer>();
       HashMap<String,Integer> my_map = new HashMap();
       a = randomDateGenerator(2020, 20);
       System.out.println(yearMonthGrouper(a));    
    }
    
}
