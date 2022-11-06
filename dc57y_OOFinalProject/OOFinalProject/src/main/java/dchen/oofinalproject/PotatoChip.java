/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class PotatoChip extends Category {
    private final String[] array= {"Plain", "Barbecue", "Sour Cream & Onion", "Salt & Vinegar", "Cheddar Cheese", "Jalapeno", "Kettle Cooked", "Ketchup", "Cheddar & Bacon", "Dill Pickle", "Southern Biscuits & Gravy", "Honey Dijon", "Cheddar & Sour Cream", "Sea Salt & Black Pepper", "Sea Salt", "Cheesy Garlic Bread", "Chicken & Waffles", "Ranch", "Wavy", "Baked"};
    
    public PotatoChip()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(19);
        return array[rand];
    }
    
}
