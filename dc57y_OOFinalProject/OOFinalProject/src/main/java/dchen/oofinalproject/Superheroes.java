/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Superheroes extends Category {
    private final String[] array= {"Spider-Man", "Wonder Woman", "Batman", "Iron Man", "Superman", "Wolverine", "Captain America", "Thor", "The Incredible Hulk", "The Flash", /*10*/ "Black Widow", "Deadpool", "Black Panther", "The Joker", "Doctor Doom", "Green Goblin", "Lex Luthor", "Thanos", "Loki", "Magneto" };

    
    public Superheroes()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(19);
        return array[rand];
    }
    
}
