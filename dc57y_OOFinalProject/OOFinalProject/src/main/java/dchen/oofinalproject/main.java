/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class main {
    public static void main(String[] args)
    {
        String string = "spider-man";
//        System.out.println(string);
//        System.out.println("");
//        String newString = string.replaceAll ("\\w", "_ ");
//        System.out.println(string);
//        System.out.println(newString);
//        System.out.println("________________");
//        string = string.toUpperCase();
//        StringBuilder temp = new StringBuilder(string);
//        int tempInt = string.length();
//        for (int i=0; i<tempInt; i++)
//        {
//           char tempChar = temp.charAt(i);
//           System.out.println(tempChar);
//           if (Character.isLetter(tempChar))
//           {
//               temp.insert(i+1, " ");
//               tempInt++;
//               i++;
//           }
//        }
//       String testing = temp.toString();
//       System.out.println(testing);
//       
//       Category category = new Superheroes();
//       System.out.println(category.randomString());
//       category = new FastFood();
//       System.out.println(category.randomString());
//       category = new Holidays();
//       System.out.println(category.randomString());
       
//       Game game = new Game();
//       game.playGame();
//       game.printStart();
//       game.userInput();

        ActualGame game = new ActualGame();
        game.Play();
//        ActualGame game2 = new ActualGame();
//        game2.Play();
    }
}
