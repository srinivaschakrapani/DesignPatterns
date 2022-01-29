package com.srini.factory;

import com.srini.contracts.Pantrycar;
import com.srini.pantryvendors.MealsOnWheels;
import com.srini.trains.Train;
import com.srini.trains.TrainBuilder;

public class TrainFactory {

	public static Train getInstance(long tno, String tname, String src, String dest, String pantryvendor) {
		Pantrycar pc = null;
		if (pantryvendor.equalsIgnoreCase("MealsOnWheels")) {
			pc = new MealsOnWheels();
		} else {
			throw new IllegalArgumentException("Invalid Pantry car vendor ===> " + pantryvendor);
		}
		
		//
		Train tr = new TrainBuilder().setTno(tno).setTname(tname).setSrc(src).setDest(dest).setPc(pc).getTrain();

		return tr;
	}

}
