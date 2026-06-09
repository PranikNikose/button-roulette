package com.roulette.spells;

import java.util.List;
import java.util.Random;
import com.roulette.Spell;

public class Devops implements Spell {
	private static final List<String> QUOTES = List.of("🚀 Shipped to prod. Pray.", "✅ Pipeline green. Don't touch it.",
			"🐳 Docker image: 4GB. Nice.", "🔥 It works in staging. Staging lies.",
			"☸️ 12 K8s nodes. App uses 0.3 of one.", "😅 Rollback? We hotfix with courage.", "💀 Merged. Site is down.",
			"🕵️ Secret committed in 2021. Still there.", "📉 Zero downtime deploy. Downtime: 4 mins.",
			"🤡 DO NOT RUN ON FRIDAYS. Running on Friday.");

	@Override
	public String execute() {
		return QUOTES.get(new Random().nextInt(QUOTES.size()));
	}
}