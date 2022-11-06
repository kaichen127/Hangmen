/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Leaders extends Category {
    private final String[] array= {"Hammurabi", "Mansa Musa", "Alexander the Great", "Qin Shi Huang", "Julius Caesar", "Constatine", "Charlemagne", "Genghis Khan", "George Washington", "Thomas Jefferson", "Tecumseh", "Napoleon Bonaparte", "Abraham Lincoln", "Mahatma Gandhi", "Vladimir Lenin", "Martin Luther King Jr.", "Winston Churchill", "Nelson Mandela", "Franklin D. Roosevelt", "Julius Caesar", "Mikhail Gorbachev", "Hannibal", "Benjamin Franklin", "Marcus Aurelius", "Marquis de Lafayette", "Marc Antony", "Sun Tzu", "Caligula"};
    
    public Leaders()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(27);
        return array[rand];
    }
    
}