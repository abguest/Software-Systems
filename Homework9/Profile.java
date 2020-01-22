import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;


public class Profile {
	
	public static void main(String[] args) throws Exception {
		String fileName=args[0];
		Scanner in = new Scanner (new File(fileName));
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while (in.hasNext()) {
			String name = in.next();
			
			if (map.get(name)==null) {
				map.put(name, 1);
			} else {
				map.put(name, map.get(name)+1);
			}		
		}
		
		if (args.length <= 1) Profile.whatever(map);
		else Profile.specificLength(map, Integer.parseInt(args[1]));

	}
	
	public static void whatever(Map<String, Integer> m) {		
		ArrayList<Candidate> cands = new ArrayList<Candidate>();
		
		for (String name : m.keySet()) {
			cands.add(new Candidate(name, m.get(name) ) );
		}
	
		Collections.sort(cands);
		System.out.println(cands);
	}
	
	public static void specificLength(Map<String, Integer> m, int top) {
		ArrayList<Candidate> cands = new ArrayList<Candidate>();
		
		for (String name : m.keySet()) {
			cands.add(new Candidate(name, m.get(name) ) );
		}
		
		Collections.sort(cands);
		for (int i=0; i<top; i++) {
			System.out.println(cands.get(i));
		}
	}
}

