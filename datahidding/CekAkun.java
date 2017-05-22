package datahidding;

class CekAkun {
    double saldo = 0;
    private  void setSaldo (double sal) {
        saldo = sal;
    };
    
    public double getSaldo(){
        return  saldo;
    };
    
   // public void deposit(double dep){
   //    setSaldo(saldo + dep);
   // };
   // 
   // public void withdrawal (double with) {
   //    setSaldo(saldo - with);
   // };
}
