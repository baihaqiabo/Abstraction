package datahidding;

public class Enkap extends Persegi{

    public static void main(String[] args) {
//creating object
        Persegi p = new Persegi();
        p.setPanjang(12);
        p.setLebar(6);

        System.out.println("Panjang: " + p.getPanjang());
        System.out.println("Lebar: " + p.getLebar());
        System.out.println("Luas persegi: " + p.getLuas());
    }

}
