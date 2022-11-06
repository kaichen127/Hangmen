/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Holidays extends Category {
    private final String[] array= {"New Year", "Christmas", "Valentine's Day", "Halloween", "Ramadan", "Easter", "Thanksgiving", "St. Patrick's Day", "Diwali", "Lunar New Year", "Independence Day", "Oktoberfest", "Day of the Dead", "Hanukkah", "Juneteenth", "Martin Luther King Day", "Labor Day", "New Year's Eve", "Kwanzaa", "Boxing Day"};
    
    public Holidays()
    {
        
    }
    @Override
    String randomString()
    {
        int rand = getRandom(19);
        return array[rand];
    }
    
}