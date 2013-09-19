package org.Arioch.JavaBrains;

import net.webservicex.GeoIPService;

public class IPFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("Error number of args is wrong");
		}
		else
		{
			System.out.println(new GeoIPService().getGeoIPServiceSoap().getGeoIP(args[0]).getCountryName());			
		}
	}

}
