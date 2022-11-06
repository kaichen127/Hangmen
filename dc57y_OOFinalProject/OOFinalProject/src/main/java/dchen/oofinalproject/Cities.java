/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dchen.oofinalproject;

/**
 *
 * @author dchen
 */
public class Cities extends Category {
    private final String[] array= {"Tokyo", "New Delhi", "Shanghai", "Sao Paulo", "Mexico City", "Cairo", "Dhaka", "Beijing", "Istanbul", "Buenos Aires", "Manila", "Rio De Janeiro", "Jakarta", "Paris", "Bangkok", "New York City", "Los Angeles", "Seoul", "London", "Ho Chi Minh City", "Riyadh", "Kuala Lumpur", "Baghdad", "Toronto", "Madrid", "Moscow", "Kyiv"};
    
    public Cities()
    {
    }
    @Override
    String randomString()
    {
        int rand = getRandom(26);
        return array[rand];
    }
    
}