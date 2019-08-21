package Session9.Assignments1;

import java.util.HashMap;

public class genericHashMap {
	
	public static void main(String[] args) {

		int[] EmpCode = { 1, 2, 3, 4, 5, 6 };
		String[] EmpName = { "Rahib", "Alex", "Zair", "Karissa", "Danial", "Brandon" };

		HashMap<Object, Object> hashM = new HashMap<>();

		for (int i = 0; i < 6; i++) {
			hashM.put(EmpCode[i], EmpName[i]);
		}
		System.out.println(hashM.values());

	}

}
