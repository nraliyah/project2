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
public class latihanfor3 {
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        for( int i=1;i<=3;i++)
        {
            System.out.println ("Masukkan tapak:");
            int tapak = input.nextInt();
            System.out.println ("Masukkan tinggi:");
            int tinggi = input.nextInt();
            int jwpn=1*tapak*tinggi/2;
           System.out.println ("Luas segi tiga berikut ialah:"+jwpn);
        }    
}
}
