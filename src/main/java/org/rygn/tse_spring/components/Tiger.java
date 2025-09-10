package org.rygn.tse_spring.components;

import org.rygn.tse_spring.interfaces.Feline;
import org.springframework.stereotype.Component;

@Component
public class Tiger implements Feline {

	@Override
	public String toString() {
		return "Tiger instance";
	}
}
