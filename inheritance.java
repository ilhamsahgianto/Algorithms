class Manusia
{
    public void info()
    {System.out.println("Manusia butuh makan");}
}

class Mahasiswa extends Manusia
{
    @Override
    public void info()
    {System.out.println("Mahasiswa butuh makan");}
}

class Dukun extends Manusia
{
    @Override
    public void info()
    {System.out.println("Dukun butuh makan");}
}

class output1
{
    public void tampil()
    {
        orangtua object = new anak();
        if(object.a>50)
        {System.out.println("Nilai Anda adalah "+object.a);
        object.info();}
        else {System.out.println("Nilai Anda adalah "+object.a);
        System.out.println("Anda tidak mendapatkan hadiah");}
    }
}


public class TUGAS1_NOM1 {
    public static void main(String[] args) {
        Manusia[] human = new Manusia[3];
        human[0]=new Manusia();
        human[1]=new Mahasiswa();
        human[2]=new Dukun();
        
        human[0].info();
        human[1].info();
        human[2].info();
    }
}
