/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraction;

/**
 *
 * @author BAIHAQIABO
 */
public abstract class Mahasiswa {
    	public String nama;
	public String nim;

	protected void tidakLulus () { //ini deklarasi method konkret
		System.out.println ("Semua mahasiswa tidak mau tidak lulus");
        }
	///ini deklarasi abstract method atau method abstract
	protected abstract void lulus();
        
        protected abstract void kuliah();	
	}

