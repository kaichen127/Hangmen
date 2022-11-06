/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class NerdWords extends Category {
    private final String[] array= {"Binary Search Tree", "Depth First Search", "Breadth First Search", "Strongly Connected Components", "Input / Output", "Algorithm", "Segementation Fault", "Hash Table", "Red-black tree", "Priority Queue", "Linked List", "Pseudo Code", "Object Oriented", "Hello World", "Polymorphism", "Inheritance", "Exeption Handling", "Bubble Sort", "Adjacency Matrix"};
    
    public NerdWords()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(18);
        return array[rand];
    }
    
}