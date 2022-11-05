package com.wigg.appt.entity;

import javax.persistence.Entity;

import lombok.Data;

@Data
public class Location {

	private String street;
	private enum state{AK, AL, AR, AS, AZ, CA, CO, CT, DC, DE, FL, GA, GU, HI, IA, ID, IL, IN, KS, KY, LA, MA, MD, ME, MI, MN, MO, MP, MS, MT, NC, ND, NE, NH, NJ, NM, NV, NY, OH, OK, OR, PA, PR, RI, SC, SD, TN, TX, UM, UT, VA, VI, VT, WA, WI, WV, WY}
	private String city;
	private int zipcode;
	private Provider provider;
}
