package com.hat.service;

import org.apache.commons.lang3.StringUtils;

import com.hat.data.Heure;

public class AngleService {

	public String detreminerAngle(Heure heure) {
		String angle = null;
		if (heure == null || !checkValidHeure(heure))
			throw new IllegalArgumentException("IllegalArgument : " + heure);
		Integer angleTmp =(Math.abs((heure.getIntegerHeure() % 12) - (heure.getIntegerMinute() / 5) )* 30);
		angle = angleTmp+" °";
		return angle;
	}

	private boolean checkValidHeure(Heure heure) {
		boolean validHeure = false;
		if (heure != null && StringUtils.isNotBlank(heure.getHeure())
				&& StringUtils.isNotBlank(heure.getMinute())) {

			return (heure.getIntegerHeure() >= 0
					&& heure.getIntegerHeure() < 24
					&& heure.getIntegerMinute() >= 0 && heure
					.getIntegerMinute() < 60);
		}
		return validHeure;
	}
	
}
