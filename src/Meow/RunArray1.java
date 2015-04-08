/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Meow;

/**
 *
 * @author jlopn2
 */
public class RunArray1 
{
    
    public static void main(String[] args)
    { 
        Array a1 = new Array();
        int[] scores = {5, 5, 12, 17, 11}; //scores referencing an array of ints
        float avg = a1.averData(scores, scores.length);
        System.out.println("Average score: " + avg );
    }
    
}
