/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class BadInput extends Exception{
        String message;
    
    public BadInput(int error)
    {
        if (error == 0)
        {
            this.message = "No input detected";
        }
        if (error == 1)
        {
            this.message = "That's not a letter!";
        }
        if (error == 2)
        {
            this.message = "Input was too long!";
        }
        if (error == 3)
        {
            this.message = "You already guessed that letter!";
        }
    }
    
    @Override
    public String getMessage()
    {
        return this.message;
    }
        
    
}
