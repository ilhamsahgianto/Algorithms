abstract class abstrak
{
    public abstract void nama();
}

class namanim
{
    public void hasil()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("------------INPUT------------");
        System.out.print("Masukkan nama Anda : ");
        String nama = a.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        String nim = a.nextLine();
        System.out.print("Masukkan kelompok berapa Anda : ");
        int kelompok = a.nextInt();
        System.out.println("------------OUTPUT------------");
        System.out.print("Nama : ");
        System.out.println(nama);
        System.out.print("NIM : ");
        System.out.println(nim);
        System.out.print("Kelompok : ");
        System.out.println(kelompok);
    }
}

public class PBO_P1_Project1 {
    
    public static void main(String[] args) {
        namanim obj = new namanim();
        obj.hasil();
    }
    
}
