/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Characters extends Category {
    private final String[] array= {"Mickey Mouse", "James Bond", "Han Solo", "Bugs Bunny", "Darth Vader", "Peter Pan", "Indiana Jones", "Homer Simpson", "King Kong", "Godzilla", "Winnie-the-Pooh", "Forrest Gump", "Big Bird", "The Terminator", "Charlie Brown", "Kermit the Frog", "Jack Sparrow", "Harry Potter", "Percy Jackson", "Willy Wonka", "Walter White", "Katniss Everdeen" };

    
    public Characters()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(19);
        return array[rand];
    }
    
}
