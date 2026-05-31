package com.roulette.spells;

import com.roulette.Spell;

import java.util.List;
import java.util.Random;

public class Potion implements Spell {

	private static final List<String> FACTS = List.of("The first computer bug was an actual moth.",
			"Java was originally called Oak.", "The Internet and Web are not the same thing.",
			"Linux powers most cloud servers.");

	@Override
	public String execute() {
		return FACTS.get(new Random().nextInt(FACTS.size()));
	}
}