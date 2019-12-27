import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

public class AlgProje {

	public static void main(String args[]) throws IOException {

		String filepath1 = "test.txt";
		String filepath2 = "test2.txt";

		Random random = new Random(); // created random (to give random number)
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // Created HashMap (key=String in test.txt)
// --------------------------------------------------------------------------------------------------------------------------------------------
		String line = "";
		BufferedReader reader = new BufferedReader(new FileReader(filepath1)); // Reading test.txt line by line and put into
// hash.
		while ((line = reader.readLine()) != null) {
			Integer value = random.nextInt();
// value is not important , we just can give constant number such as 0.
			map.put(line, value);

		}
		reader.close();
		// System.out.println(map); // We can see hash map key and value.
		// System.out.println(map.keySet()); // We can see keys of hash map in an array.

// --------------------------------------------------------------------------------------------------------------------------------------------

		BufferedReader reader2 = new BufferedReader(new FileReader(filepath2)); // Reading test.txt line by line and put
// into hash.
		while ((line = reader2.readLine()) != null) {
//System.out.println(line);           // We can see text2.txt lines.
			for (String word : map.keySet()) {
//System.out.println(word); // We can see text.txt (length) x text2.txt (length) times hash keys. For checking each keys is exist in text2.txt

				if (line.contains(word)) {
					System.out.println("\"" + word + " \" exists in " + "\"" + line + "\"");
				}
			}
//System.out.println();
		}
		reader2.close();
	}
}

