class handphone
{
    int jumlah=3;
    public void info()
    {
        System.out.println("HAPE");
    }
}

class samsung extends handphone
{
    int jumlah=1;
    @Override
    public void info()
    {
        System.out.println("HAPE SAMSUNG");
    }
}

public class TUGAS1_NOM2 {
    public static void main(String[] args) {
        handphone oubjiecto = new samsung();
        System.out.println("Jumlah hp = "+oubjiecto.jumlah);
        oubjiecto.info();
    }
}
