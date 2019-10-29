public class AlgodatP5_J1_DeretAngka {
    public static void main(String[] args) 
    {
        int i=0;
        tambahSatu(i);
    }
    
    static void tambahSatu(int e)
    {
        if(e<10)
        {
            System.out.print(e+" ");
            tambahSatu(++e);
        }
    }
}
