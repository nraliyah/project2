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
public class isipadu {
  public static void main (String args[]) 
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Masukkan pilihan anda");
      String pilihan = input.next();
      
      switch (pilihan){
          case "k":
      System.out.println("Masukkan panjang");
      double panjang = input.nextDouble();
      System.out.println("Masukkan lebar");
      double lebar = input.nextDouble();
      System.out.println("Masukkan tinggi");
      double tinggi = input.nextDouble();
      
      double kuboid = panjang * lebar * tinggi;
      
              System.out.println("nilai kuboid ialah" + kuboid);
           break;
          case "s":
      System.out.println("Masukkan nilai jejari");
      double jejari = input.nextDouble();
      System.out.println("Masukkan nilai tinggi");
      double tinggi2 = input.nextDouble();
      
      double silinder = 3.142 * jejari * jejari * tinggi2;
      
              System.out.println("nilai silinder ialah" +silinder);
              
            break;
          default:
              System.out.println("error");
            break;
      }
              
  }
}