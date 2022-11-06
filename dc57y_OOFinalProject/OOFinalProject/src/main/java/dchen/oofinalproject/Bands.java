/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Bands extends Category {
    private final String[] array= {"Avenged Sevenfold", "Grateful Dead", "The Script", "Rage Against the Machine", "Steely Dan", "Evanescence", "Arctic Monkeys", "Paramore", "The Killers", "Panic! at the Disco", "Electric Light Orchestra", "Gorillaz", "OneRepublic", "ABBA", "Fall Out Boy", "Foo Fighters", "Nickelback", "Black Sabbath", "Pearl Jam", "Green Day", "Coldplay", "Nirvana", "Journey", "Red Hot Chili Peppers", "Linkin Park", "Aerosmith", "Guns N' Roses", "Metallica", "The Rolling Stones", "Pink Floyd", "Queem", "Led Zeppelin", "The Beatles"};
    
    public Bands()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(33);
        return array[rand];
    }
    
}