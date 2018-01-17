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
public class menu {
    public static void main (String args[]) 
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Masukkan pilihan menu makanan");
      char pilihan = input.next().charAt(0);
      
    switch (pilihan){
      case 'N' :
      System.out.println("RM4.90");
      break;
      case 'R' :

          System.out.println("RM0.80");
      break;
      case 'M' :
      System.out.println("RM4.50");
      break;
      default:
      System.out.println("tiada data yang direkodkan");
            break;
      
  }
            
  }
}
