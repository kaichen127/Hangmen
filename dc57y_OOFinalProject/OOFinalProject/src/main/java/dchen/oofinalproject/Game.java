/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author dchen
 */
public class Game {
    private Hangman game1;
    private Hangman game2;
    private int lives;
    private int winStreak;
    private int terminate;
    private String playerString1;
    private String playerString2;
    private /*static*/ Set<Character> guesses;
    private int String1;
    private int String2;

    
    
    public Game() {
        this.game1 = new Hangman();
        this.game2 = new Hangman();
        this.lives = 6;
//        this.winStreak = 0;
        this.terminate = 0;
        this.playerString1 = game1.getEncodedString();
        this.playerString2 = game2.getEncodedString();
        this.guesses = new HashSet<>();
        this.String1 = 1;
        this.String2= 1;
}
    
    public void printStart() {
        System.out.println("______________________________________________________________________________________");
//        System.out.println("");
        System.out.printf("%18s", "Hangmen");
        System.out.println("");
        System.out.println("______________________________________________________________________________________");
        System.out.println("CATEGORIES:");
        System.out.printf("%40s %5s %s %5s %s\n", game1.getCategory(), " ", "|", " ", game2.getCategory());
        System.out.println("______________________________________________________________________________________");
        printEncoded();
//        printEncoded();
//        printPlayerString();
    }
    
    public void printEncoded() {
        System.out.printf("%40s %5s %s %5s %s\n", game1.getEncodedString(), " ", "|", " ",game2.getEncodedString());
//        System.out.printf("%40s %5s %s %5s %s\n", game1.getComparableString(), " " ,"|", " ", game2.getComparableString());
    }
    
    public void printPlayerString() {
        System.out.printf("%40s %5s %s %5s %s\n", this.playerString1, " ","|", " ", this.playerString2);

    }
    
    public char userInput() 
    {
        int error = 1;
        Scanner scanner = new Scanner(System.in);
        char letter = ' ';
        while (error == 1)
        {
            try
            {
                System.out.println("Please enter a guess ~");
                String guess = scanner.nextLine();
                guess = guess.toUpperCase();
                guess = guess.replaceAll("\\s", "");
                if (guess.length() > 1)
                {
//                    throw new BadInput(2);
                    for (int i=0; i<guess.length(); i++)
                    {
                        if (lives <= 0)
                        {
                            return 0;
                        }
                        letter = guess.charAt(i);
                        if (!(Character.isLetter(letter)))
                        {
                            System.out.println("Could not identify character. Moving to next char in string ~");
                        }
                        if (this.guesses.contains(letter))
                        {
                            
                        }
                        else if (Character.isLetter(letter))
                        {
                            this.guesses.add(letter);
                            System.out.println("You guessed : " + letter);
                            checkForLetter(letter);
                            error = 0;
                        }
                    }
                    printPlayerString();

                }
                else {
                if (guess.equals(""))
                {
                    throw new BadInput(0);
                }
                letter = guess.charAt(0);
                if (!(Character.isLetter(letter)))
                {
                    throw new BadInput(1);
                }
                if (Character.isLetter(letter))
                {
                    if (this.guesses.contains(letter))
                    {
                        throw new BadInput(3);
                    }
                    else
                    {
                        this.guesses.add(letter);
                        System.out.println("You guessed : " + letter);
                        checkForLetter(letter);
                        printPlayerString();
                        error = 0;
                    }
                }
//                    return letter;
                }
            }
            catch (BadInput exception)
            {
                System.out.println(exception.getMessage());
            }
            
        }
        return letter;
    }
    
    public void checkForLetter(char letter)
    {
        int replacements = 0;
        String comp1 = this.game1.getComparableString();
        String comp2 = this.game2.getComparableString();
        for (int i=0; i<comp1.length(); i++)
        {
            if (comp1.charAt(i) == letter)
            {
                StringBuilder temp = new StringBuilder(this.playerString1);
                temp.setCharAt(i, letter);
                this.playerString1 = new String (temp);
                replacements++;
            }
            
        }
        for (int i=0; i<comp2.length(); i++)
        {
            if (comp2.charAt(i) == letter)
            {
                StringBuilder temp = new StringBuilder(this.playerString2);
                temp.setCharAt(i, letter);
                this.playerString2 = new String (temp);
                replacements++;
            }
        }
        if (replacements == 0)
        {
            this.lives--;
            System.out.println("Ouch! You now have " + lives + " lives");
        }
    }
    
    public void playGame()
    {
        printStart();
        while ((this.String1 == 1 || this.String2 == 1) && this.lives >0)
        {
            userInput();
            if (String1 == 1 && this.playerString1.equalsIgnoreCase(this.game1.getComparableString()))
            {
                this.String1 = 0;
                if (String2 == 1)
                {
                    System.out.println("Only one string left to go!");
                }
                
            }
            if (String2 == 1 && this.playerString2.equalsIgnoreCase(this.game2.getComparableString()))
            {
                this.String2 = 0;
                if (String1 == 1)
                {
                    System.out.println("Only one string left to go!");
                }
            }
            if (String1 == 0 && String2 == 0 )
            {
                System.out.println("______________________________________________________________________________________");
                System.out.printf("%40s\n", "YOU WIN");
                System.out.println("______________________________________________________________________________________");            
            }
            if (lives == 0)
            {
                System.out.println("______________________________________________________________________________________");
                System.out.printf("%40s\n", "YOU LOSE");
                System.out.printf("%40s %5s %s %5s %s\n", game1.getComparableString(), " " ,"|", " ", game2.getComparableString());
                System.out.println("______________________________________________________________________________________");            }
        }
    }
    
    public int getLives()
    {
        return this.lives;
    }
    
    
    
}
