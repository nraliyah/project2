/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class latihanwhile {
    public static void main (String [] args)
    { 
        Scanner input = new Scanner (System.in);
        System.out.println ("Masukkan nombor yang dikehendaki:");
        int i=input.nextInt();
        
        while (i>=1)
        {
            for(int no=2;no<=i;no++)
            {
                System.out.print (i);
            }
            System.out.println (i);
            i--;
                    }
        }
    }


 
