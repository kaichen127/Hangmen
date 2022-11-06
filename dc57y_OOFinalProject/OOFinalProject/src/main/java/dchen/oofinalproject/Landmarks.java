/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Landmarks extends Category {
    private final String[] array= {"Sydney Opera House", "Eiffel Tower", "Taj Mahal", "Burj Khalifa", "Machu Picchu", "The Great Wall of China", "Mount Rushmore", "The Acropolis", "Easter Island", "Golden Gate Bridge", "Leaning Tower of Pisa", "The Great Pyramids", "Victoria Falls", "Buckingham Palace", "Christ the Redeemer", "The Colosseum", "Statue of Liberty", "Stonehenge", "Niagara Falls", "Louvre Museum" };
    
    public Landmarks()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(19);
        return array[rand];
    }
    
}