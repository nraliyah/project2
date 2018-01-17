
import java.util.Scanner;
public class gaji {

    private static int bil_jam_sehari;

    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        double gaji=0;
        System.out.println("masukkan nama anda:");
        String nama = input.next();
        System.out.println("masukkan bilangan jam sehari:");
        
        if (bil_jam_sehari>9);
        {
            System.out.println("bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul");
        }
               
        System.out.println ("masukkan bilangan hari:");
                    int bil_hari = input.nextInt();
                      if(bil_hari>30);
                    {
                        System.out.println ("bilangan hari bekerja tidak boleh melebihi 30 hari, sila masukkan bilangan hari yang betul");
                    }
          
                    
                        System.out.println ("masukkan bilang jam ot:");
                         int bil_jam_ot = input.nextInt();
                            if (bil_jam_ot<=50)
                            {
                                System.out.println("gaji anda ialah:"+gaji);
                            }
                     else 
                            {
                                System.out.println ("bilangan jam kerja lebih masa tidak boleh melebihi 50 jam,sila masukkan bilangan jam yang betul");
                            }
            System.out.println("rumusan gaji bulanan"+nama+":");
            System.out.println("jumlah jam bekerja:"+bil_jam_sehari+"jam");
            System.out.println("jumlah hari bekerja:"+bil_hari+"hari");
            System.out.println("jumlah jam lebih masa:"+bil_jam_ot+"jam");
            System.out.println("JUMLAH GAJI:RM"+gaji);
            
    }
}

