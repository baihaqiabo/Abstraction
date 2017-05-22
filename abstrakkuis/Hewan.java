

package abstrakkuis;


public abstract class Hewan {
    	private String warna;
	private String mata;
        private String kaki;

	protected void makan () { //ini deklarasi method konkret
		System.out.println ("Semua  hewan membutuhkan makan.");
        }
        protected void habitat () { //ini deklarasi method konkret
		System.out.println ("Setiap hewan mempunyai habitatnya masing-masing.");
        }
        protected void berlari () { //ini deklarasi method konkret
		System.out.println ("Tidak semua hewan bisa berlari.");
        }
        
	//ini deklarasi abstract method atau method abstract
	protected abstract void bernafas();
        
        protected abstract void tidur();	
	}
