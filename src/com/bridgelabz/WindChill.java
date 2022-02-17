package com.bridgelabz;

public class WindChill {

	public static void main(String[] args) {

		double t = Double.parseDouble(args[0]); // temperature (F)
		double v = Double.parseDouble(args[1]); // velocity of wind (mph)
		if (t > 50 || v < 3 || v > 120) {

			System.out.println ("The entered value is invalid.");

		}

		else {


			double windChillTemp = 35.74 + 0.6215 * t +
					(0.4275 * t - 35.75) * Math.pow(v, 0.16);

			// print the result
			System.out.println(windChillTemp); // windchill (F)
			// Note - try using Math.round to produce more practical result
		}
	}
}
