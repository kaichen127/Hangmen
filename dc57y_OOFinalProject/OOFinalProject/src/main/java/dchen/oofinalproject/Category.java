/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */

/*possible subjects: 
superheroes?
famous cities?
fast food restaurants?
animals?
popular holidays?
historical fkdfjlsdk
candy idk
*/


//equalsIgnoreCase
//.toUpperCase()

import java.util.Random;
        
public abstract class Category {
     abstract String randomString();
     String encodeString(String string)
     {
         String encode = new String();
         encode = string.replaceAll("\\w", "_ ");
         return encode;
     }
     int getRandom(int max)
     {
         Random random = new Random();
         return random.nextInt(max);
     }
}
