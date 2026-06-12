package com.roulette.names;

import java.util.List;

import org.springframework.stereotype.Component;

import com.roulette.BaseSpell;
import com.roulette.model.SpellResponse;

@Component
public class Pranali extends BaseSpell {

	private static final boolean RANDOM_MODE = Boolean.FALSE;

	private static final String SINGLE_EMOJI = "😎";
	private static final String SINGLE_MESSAGE = "Sleep Well. Eat Well.";

	private static final List<String[]> QUOTES = List.of(new String[] { "☕", "Coffee consumed. Feature unlocked." },
			new String[] { "🚀", "P" },
			new String[] { "💻", "K" },
			new String[] { "🐳", "N" },
			new String[] { "⚙️", "S" },
			new String[] { "🔥", "S" },
			new String[] { "🧠", "D" },
			new String[] { "🔍", "I" },
			new String[] { "🎯", "V" },
			new String[] { "😎", "R" },
			new String[] { "🏆", "E" },
			new String[] { "⚡", "A" });

	@Override
	public SpellResponse cast() {

		if (!RANDOM_MODE) {
			return response(SINGLE_EMOJI, SINGLE_MESSAGE);
		}

		return randomResponse(QUOTES);
	}
}