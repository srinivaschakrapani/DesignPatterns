package com.srini.trains;

import com.srini.contracts.Pantrycar;

// Builder Pattern
// Instead of using the Long constructor create 
// Getters and Setters
public class TrainBuilder {
	private long tno;
	private String tname;
	private String src;
	private String dest;
	Pantrycar pc;
	
	public TrainBuilder(){
		System.out.println("====== 0-Param Constructor Train Builder Class =====");
	}

	public TrainBuilder setTno(long tno) {
		this.tno = tno;
		return this;
	}

	public TrainBuilder setTname(String tname) {
		this.tname = tname;
		return this;
	}

	public TrainBuilder setSrc(String src) {
		this.src = src;
		return this;
	}

	public TrainBuilder setDest(String dest) {
		this.dest = dest;
		return this;
	}

	public TrainBuilder setPc(Pantrycar pc) {
		this.pc = pc;
		return this;
	}
	
	public Train getTrain() {
		return new Train(tno, tname, src, dest, pc);
	}

}
