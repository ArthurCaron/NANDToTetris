package io.karon.nandtotetris;

public class Word {

	// Make sure every part of the code can adapt to the number of bits we decide upon instead of letting them all set any number of bit word

	public boolean[] bits;

	private Word(int size) {
		this.bits = new boolean[size];
	}

	public Word(boolean... bits) {
		this.bits = bits;
	}

	public static Word getAllZero() {
		return new Word();
	}

	public static Word getAllOne() {
		return new Word(
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true,
				true
		);
	}

	public static class w2 extends Word {
		public w2() {
			super(2);
		}

		public w2(boolean b1, boolean b0) {
			super(2);
			bits[1] = b1;
			bits[0] = b0;
		}
	}

	public static class w4 extends Word {
		public w4() {
			super(4);
		}
	}

	public static class w8 extends Word {
		public w8() {
			super(8);
		}
	}

	public static class w16 extends Word {
		public w16() {
			super(16);
		}
	}

	public static class w32 extends Word {
		public w32() {
			super(32);
		}
	}

	public static class w64 extends Word {
		public w64() {
			super(64);
		}
	}
}
