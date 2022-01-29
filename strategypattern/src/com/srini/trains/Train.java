package com.srini.trains;

import com.srini.contracts.Pantrycar;

public class Train {
	private long tno;
	private String tname;
	private String src;
	private String dest;
	private Pantrycar pc;
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(" ============ Train details =============== ");
		System.out.println(" Train Number : " + tno + "\n Train Name : " + tname + "\n Source : " + src
				+ "\n Destination : " + dest + "\n" + pc.toString());
		
		return super.toString();
	}

	public Train(long tno, String tname, String src, String dest, Pantrycar pc) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.src = src;
		this.dest = dest;
		this.pc = pc;
	}

	// Has - a relationship , this is called composition
	// Train is a target class and PantryCar is a dependent class
	public Pantrycar getPc() {
		return pc;
	}
	
	
}
