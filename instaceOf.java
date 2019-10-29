class kendaraan
{
    public void roda()
    {System.out.print("Kendaraan");}
}

class motor extends kendaraan
{
    @Override
    public void roda()
    {System.out.print("Motor ");}
}

class mobil extends kendaraan
{
    @Override
    public void roda()
    {System.out.print("Mobil ");}
}

public class TUGAS1_NOM3 {
    public static void argu (kendaraan ken) //ini adalah argument
    {
        if (ken instanceof motor)
        {
            motor mot = (motor) ken;
            mot.roda();
            System.out.println("Beroda 2");
        }
        else if (ken instanceof mobil)
        {
            mobil mob = (mobil) ken;
            mob.roda();
            System.out.println("Beroda 4");
        }
        else
        {
            kendaraan kend= (kendaraan)ken;
            kend.roda();
            System.out.println(" beroda");
        }
    }
    public static void main(String[] args) 
    {
        kendaraan r = new kendaraan();
        motor r2 = new motor();
        mobil r4 = new mobil();
        argu(r);
        argu(r2);
        argu(r4);
    }    
}
