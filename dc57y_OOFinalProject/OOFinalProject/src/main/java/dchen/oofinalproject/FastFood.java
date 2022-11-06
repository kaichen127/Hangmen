/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class FastFood extends Category {
    private final String[] array= {"McDonald's", "Starbucks", "Chick-fil-A", "Taco Bell", "Burger King", "Subway", "Wendy's", "Dunkin' Donuts", "Domino's", "Panera Bread", "Chipotle", "Pizza Hut", "Jimmy John's", "Sonic", "Arby's", "Little Caesars", "Panda Express", "Popeyes", "Dairy Queen", "Jack in the Box", "Papa John's"};
    
    public FastFood()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(19);
        return array[rand];
    }
    
}
