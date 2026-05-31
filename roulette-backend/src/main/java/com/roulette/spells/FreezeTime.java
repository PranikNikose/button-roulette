package com.roulette.spells;

import com.roulette.Spell;

import java.time.LocalDateTime;

public class FreezeTime implements Spell {

	@Override
	public String execute() {
		return "Server Time : " + LocalDateTime.now();
	}
}