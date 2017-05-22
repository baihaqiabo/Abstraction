package datahidding;

class Enkapsulasi extends CekAkun{
    
    public static void main (String args[]) {
        System.out.println("Memulai enkapsulasi...");
        CekAkun akunSaya = new CekAkun();
        akunSaya.saldo = 40.00;
        System.out.println("Saldo = " + akunSaya.getSaldo());
    }
}

