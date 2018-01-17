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
public class switchcase2 {
    public static void main (String args[]) 
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Menu pilihan anda:");
      System.out.println("1. Nama dan No K/P");
      System.out.println("2. No. Telepon");
      System.out.println("3. Alamat");
      System.out.println("Sila pilih menu berikut(1,2 atau 3):");
      int no=input.nextInt();
      
    switch (no){
      case 1 :
      System.out.println("1. Nama dan No K/P");
      String nama=input.next();
      int nokp=input.nextInt();
      System.out.println(nama+","+nokp);
      break;
      case 2 :
          System.out.println("2. No. Telepon");
          int notel=input.nextInt();
          System.out.println("No. telefon anda ialah:"+notel);
      break;
      case 3 :
      System.out.println("3. Alamat");
      String alamat=input.next();
      System.out.println("Alamat rumah anda ialah:"+ alamat);
      break;
      default:
      System.out.println("Maaf,Salah input");
            break;
     
  }
            
  }
}
