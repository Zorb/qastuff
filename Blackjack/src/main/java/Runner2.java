
public class Runner2 {
	String[][] Strat = { { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
			{ "H", "D", "D", "D", "D", "H", "H", "H", "H", "H" }, { "D", "D", "D", "D", "D", "D", "D", "D", "H", "H" },
			{ "D", "D", "D", "D", "D", "D", "D", "D", "D", "H" }, { "H", "H", "S", "S", "S", "H", "H", "H", "H", "H" },
			{ "S", "S", "S", "S", "S", "S", "H", "H", "H", "H" }, { "S", "S", "S", "S", "S", "S", "H", "H", "H", "H" },
			{ "S", "S", "S", "S", "S", "S", "H", "H", "H", "H" }, { "S", "S", "S", "S", "S", "S", "H", "H", "H", "H" },
			{ "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" }, { "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" },
			{ "S", "D", "D", "D", "D", "S", "S", "H", "H", "H" }, { "H", "D", "D", "D", "D", "H", "H", "H", "H", "H" },
			{ "H", "H", "D", "D", "D", "H", "H", "H", "H", "H" }, { "H", "H", "D", "D", "D", "H", "H", "H", "H", "H" },
			{ "H", "H", "H", "D", "D", "H", "H", "H", "H", "H" }, { "H", "H", "H", "D", "D", "H", "H", "H", "H", "H" },
			{ "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP", "SP" },
			{ "S", "S", "S", "S", "S", "S", "S", "S", "S", "S" },
			{ "SP", "SP", "SP", "SP", "SP", "S", "SP", "SP", "S", "S" },
			{ "SP", "SP", "SP", "SP", "SP", "SP", "H", "H", "H", "H" },
			{ "H", "SP", "SP", "SP", "SP", "H", "H", "H", "H", "H" },
			{ "D", "D", "D", "D", "D", "D", "D", "D", "H", "H" }, { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H" },
			{ "H", "H", "SP", "SP", "SP", "SP", "H", "H", "H", "H" }

	};
	static String H = "Hit";
	static String S = "Stop";
	static String D = "Double Down";
	static String SP = "Split";
	static boolean ace = false;
	static boolean doubles = false;

	public static void play(int you, int you2, int dealer) {
		int sum = you + you2;
		if (you == 1 || you2 == 1) {
			ace = true;
		}
		if (you == you2) {
			doubles = true;
		}
		if (ace && doubles) {
			System.out.println(SP);
		} else if (ace) {
			switch (sum) {
			case 1:

			}
		}
	}
}