/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class aidafor {
     public static void main (String args[])
     {  
             int tahun;
              double baki = 500.00;
              
              for(tahun=1; tahun<=5; tahun++){
              baki = baki + (0.1 * baki);
              
              System.out.println ("jumlah" + baki);
     }
     }
                   
}
