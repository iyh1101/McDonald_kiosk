import java.util.*;

public class HashSet1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("사자");
		set.add("사자");
		set.add("토끼");
		set.add("얼룩말");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String em = iterator.next();
			System.out.println("\t" + em);
		}
		
		set.remove("토끼");
		
		System.out.println("객체수" + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String em = iterator.next();
			System.out.println("\t" + em);
		}
		
		set.clear();
		System.out.println(set.size());
	}
}
