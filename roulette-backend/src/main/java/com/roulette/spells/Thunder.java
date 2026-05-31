package com.roulette.spells;

import java.util.List;
import java.util.Random;

import com.roulette.Spell;

public class Thunder implements Spell {

	private static final List<String> QUOTES = List.of("Keep shipping.", "Small improvements compound.",
			"Done beats perfect.", "Consistency wins.");

	@Override
	public String execute() {
		return QUOTES.get(new Random().nextInt(QUOTES.size()));
	}
}