package com.roulette.service;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.roulette.Spell;
import com.roulette.model.SpellResponse;

@Service
public class SpellEngine {

	private final Random random = new Random();

	private final List<String> spells = List.of("FireBall", "FreezeTime", "Confuse", "Thunder", "Potion", "Devops");

	private final Map<String, String> emojiMap = Map.of("FireBall", "🔥", "FreezeTime", "⏰", "Confuse", "🌀", "Thunder",
			"⚡", "Potion", "🧪", "Devops", "🚀");

	public SpellResponse castSpell() {

		try {

			String spellName = spells.get(random.nextInt(spells.size()));

			String className = "com.roulette.spells." + spellName;

			Class<?> clazz = Class.forName(className);

			Spell spell = (Spell) clazz.getDeclaredConstructor().newInstance();

			String result = spell.execute();

			return new SpellResponse(spellName, emojiMap.get(spellName), result);

		} catch (Exception e) {

			return new SpellResponse("ERROR", "❌", e.getMessage());
		}
	}
}
