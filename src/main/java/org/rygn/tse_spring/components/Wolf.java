package org.rygn.tse_spring.components;

import org.rygn.tse_spring.interfaces.Canine;
import org.springframework.stereotype.Component;

@Component
public class Wolf implements Canine {

	@Override
	public String toString() {
		return "Wolf instance";
	}
}
