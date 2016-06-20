package com.InnerBean;

public class TextEditor {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Spellchecker called");
		this.spellChecker = spellChecker;
	}
	
	public void call(){
		spellChecker.check();
	}
}
