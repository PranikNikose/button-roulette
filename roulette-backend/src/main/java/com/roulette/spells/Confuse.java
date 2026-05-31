package com.roulette.spells;

import java.util.List;
import java.util.Random;

import com.roulette.Spell;

public class Confuse implements Spell {

	private static final List<String> TEXTS = List.of("Spring Boot loves production", "Java developers need coffee",
			"Deploy first pray later", "Code review is coming");

	@Override
	public String execute() {
		return TEXTS.get(new Random().nextInt(TEXTS.size()));
	}
}