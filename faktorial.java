public class AlgodatP5_J2_Faktoriall 
{
    public static void main(String[] args) 
    {
        System.out.println("Faktorial");
        int angkaFaktorial=5;
        System.out.println("Hasil Faktorial dari "+angkaFaktorial+" ! = "+faktorial(angkaFaktorial));
    }
    
    static int faktorial(int a)
    {
        if(a==1)
        {
            return 1;
        }
        else
        {
            return(a*faktorial(a-1));
        }
    }
}
