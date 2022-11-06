/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */

import java.util.Random;

public class Hangman {
    private String originalString;
    private String categoryName;
    private Category randomCategory;
    private /*static*/ String encodedString;
    private String comparableString;
    private int stringLength;
//    private int lives;
    
    public Hangman() {
        Random generator = new Random();
        int number = generator.nextInt(10);
        if (number == 0)
        {
            this.categoryName = "Superheroes & Supervillains";
            this.randomCategory = new Superheroes();
        }
        if (number == 1)
        {
            this.categoryName = "Fast Food Chains";
            this.randomCategory = new FastFood();
        }
        if (number == 2)
        {
            this.categoryName = "Potato Chip Styles & Flavors";
            this.randomCategory = new PotatoChip();
        }       
        if (number == 3)
        {
            this.categoryName = "Holidays";
            this.randomCategory = new Holidays();
        } 
        if (number == 4)
        {
            this.categoryName = "Popular Characters";
            this.randomCategory = new Characters();
            
        }        
        if (number == 5)
        {
            this.categoryName = "Cities Around the World";
            this.randomCategory = new Cities();
        }        
        if (number == 6)
        {
            this.categoryName = "Famous Landmarks";
            this.randomCategory = new Landmarks();
        }
        if (number == 7)
        {
            this.categoryName = "Famous Bands";
            this.randomCategory = new Bands();
        }
        if (number == 8)
        {
            this.categoryName = "Computer Science Terms";
            this.randomCategory = new NerdWords();
        }
        if (number == 9)
        {
            this.categoryName = "Historical Leaders";
            this.randomCategory = new Leaders();
        }
       
       this.originalString = randomCategory.randomString();
       this.encodedString = this.randomCategory.encodeString(originalString);
//       System.out.printf("encoded string is %s, original is %s\n", this.encodedString, this.originalString);
       this.stringLength = this.originalString.length();
       this.comparableString = this.originalString.toUpperCase();
       StringBuilder temp = new StringBuilder(this.comparableString);
       int tempInt = this.stringLength;
       for (int i=0; i<tempInt; i++)
       {
           char tempChar = temp.charAt(i);
           if (Character.isLetter(tempChar))
           {
               temp.insert(i+1, " ");
               tempInt++;
               i++;
           }
       }
       this.comparableString = temp.toString();
}
    
    public boolean Guess()
    {
        return true;
    }
    
    public String getCategory()
    {
        return this.categoryName;
    }
    
    public String getComparableString()
    {
        return this.comparableString;
    }
    
    public String getEncodedString()
    {
        return this.encodedString;
    }

    
}
