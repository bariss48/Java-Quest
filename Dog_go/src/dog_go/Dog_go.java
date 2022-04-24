package dog_go;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class Dog_go {
    
    
      static void removeDuplicate(String str[], int n)
    {
       // Create a set using String characters
    // excluding '\0'
        int counter = 0;
        HashSet<String> s = new LinkedHashSet<>(n - 1);
      // HashSet doesn't allow repetition of elements
        for (String x : str){
            s.add(x);
        } 
        // Print content of the set
        for (String x : s){
        if(counter == 4){
            System.out.println();
          } 
        if(counter == 10){
            System.out.println();
        }
          System.out.print(x+' ');
          counter++;
        }
        HashMap<String, Integer> count = new HashMap<>();
        /*Store duplicates present
        in the passed string */
        for (int i = 0; i < str.length; i++) {
            if (!count.containsKey(str[i]))
                count.put(str[i], 1);
            else
                count.put(str[i],
                          count.get(str[i]) + 1);
        }
         System.out.println();
         System.out.println("**************************");
        /*Print duplicates in sorted order*/
        for (Map.Entry mapElement : count.entrySet()) {
            String key = (String)mapElement.getKey();
            int value = ((int)mapElement.getValue());
            System.out.println(key+ " " + value);
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size_of_array = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter total count of words in sentence. (starts with index 0)");
        
        size_of_array = input.nextInt();
        String str[] = new String[size_of_array];               
        
        /*
        str[0] = "Happy";
        str[1] = "hour";
        str[2] = "hour";
        str[3] = "class";
        str[4] = "class";
        str[5] = "classs";
        str[6] = "Do";
        str[7] = "you";
        str[8] = "you";
        str[9] = "go";
        str[10] = "go";
        str[11] = "go";
        str[12] = "go";
        str[13] = "to";
        str[14] = "the";
        str[15] = "gym";
        str[16] = "Okey";
        str[17] = "okey";
        str[18] = "bro";
        str[19] = "Bro";
        */
        int n = str.length;
        try{
        for (int i = 0; i < n; i++) {
            System.out.println("prompt word");
            String s = input.next();
            str[i] = s;            
        }
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println(e);
        }
        removeDuplicate(str, n);
    }    
}


