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
public class switchcase1 {
    public static void main (String args[]) 
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Masukkan kedudukan pelari");
      int no = input.nextInt();
      
    switch (no){
      case 1 :
      System.out.println("Tempat pertama dalam perlumbaan");
      break;
      case 2 :

          System.out.println("Tempat kedua dalam perlumbaan");
      break;
      case 3 :
      System.out.println("Tempat ketiga dalam perlumbaan");
      break;
      default:
      System.out.println("Maaf,Salah input");
            break;
      
  }
            
  }
}
