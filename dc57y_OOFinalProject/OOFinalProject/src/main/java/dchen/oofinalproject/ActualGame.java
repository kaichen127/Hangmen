/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;
import java.util.Scanner;


/**
 *
 * @author dchen
 */
public class ActualGame 
{
    private Game currentGame;
    private int score;
    private int winStreak;
    private static int highScore;
    
    public ActualGame()
    {
        this.currentGame = new Game();
        this.score = 0;
        this.winStreak = 0;
        this.highScore = highScore; 
    }
    
    public void Play()
    {
        int terminate = 0;
        while (terminate == 0)
        {
            currentGame.playGame();
            int points = currentGame.getLives();
            if (points <= 0)
            {
                winStreak = 0;
                score = 0;
            }
            else
            {
                winStreak++;
                score = score + points;
                if (score > highScore)
                {
                    highScore = score;
                    System.out.println("Your new high score is now " + highScore);
                }
            }
            System.out.println("Current score is " + score + " and current win streak is " + winStreak);
            System.out.println();
            System.out.println("Would you like to play again? Type 'Y' to continue, or any other character to exit");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            input = input.replaceAll("\\s", "");
            if (input.equalsIgnoreCase("Y"))
            {
                this.currentGame = new Game();
            }
            else
            {
                System.out.println("Sorry to see you go! Hope you had fun!");
                terminate = 1;
            }
        }
    }
}

