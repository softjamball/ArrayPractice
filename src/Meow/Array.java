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
public class Array 
{
    
	
    public float averData(int[]  numbers, int size) 
        {
        int i, sum;
        for(i=0, sum=0; i<size; i++) 
        {
            System.out.println( "score " + i+1 + " = " + numbers[i] ); //prints 5 first time
            sum += numbers[i];
        }
	
        return ( (float) sum / i );

        }
}
