
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class reader {

	private static final String filepath = "C:\\Users\\Admin\\Desktop\\books.txt";

	public static void main(String args[]) throws IOException {
		File file = new File("C:\\Users\\Admin\\Desktop\\books.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
			System.out.println(st);
	}
}
