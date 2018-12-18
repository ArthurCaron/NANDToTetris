package io.karon.nandtotetris;

import java.util.function.BiFunction;
import java.util.function.Function;


public class LogicGates16Bits {

	public static Word.w16 nand16(Word.w16 a, Word.w16 b) {
		return apply(a, b, ElementaryLogicGates::nand);
	}

	public static Word.w16 not16(Word.w16 a) {
		return apply(a, ElementaryLogicGates::not);
	}

	public static Word.w16 and16(Word.w16 a, Word.w16 b) {
		return apply(a, b, ElementaryLogicGates::and);
	}

	public static Word.w16 or16(Word.w16 a, Word.w16 b) {
		return apply(a, b, ElementaryLogicGates::or);
	}

	public static Word.w16 nor16(Word.w16 a, Word.w16 b) {
		return apply(a, b, ElementaryLogicGates::nor);
	}

	public static Word.w16 xor16(Word.w16 a, Word.w16 b) {
		return apply(a, b, ElementaryLogicGates::xor);
	}

	public static Word.w16 xnor16(Word.w16 a, Word.w16 b) {
		return apply(a, b, ElementaryLogicGates::xnor);
	}

	public static Word.w16 mux16(boolean selector, Word.w16 a, Word.w16 b) {
		Word.w16 word = new Word.w16();

		for (int i = 0; i < word.bits.length; ++i) {
			word.bits[i] = ElementaryLogicGates.mux(selector, a.bits[i], b.bits[i]);
		}

		return word;
	}

	private static Word.w16 apply(Word.w16 a, Function<Boolean, Boolean> function) {
		Word.w16 word = new Word.w16();

		for (int i = 0; i < word.bits.length; ++i) {
			word.bits[i] = function.apply(a.bits[i]);
		}

		return word;
	}

	private static Word.w16 apply(Word.w16 a, Word.w16 b, BiFunction<Boolean, Boolean, Boolean> function) {
		Word.w16 word = new Word.w16();

		for (int i = 0; i < word.bits.length; ++i) {
			word.bits[i] = function.apply(a.bits[i], b.bits[i]);
		}

		return word;
	}

}
