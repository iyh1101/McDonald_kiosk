import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Key {
//		A077		예제 p.743
		public static void main(String[] args) {
			HashMap<String,Integer> m=new HashMap<>();
			m.put("가", 1);
			m.put("나", 2);
			System.out.println("사이즈는 얘도 size함수로 구함:"+m.size());
			
			Set<String> ks = m.keySet();
			Iterator<String> it = ks.iterator();
			while(it.hasNext()) {
				String key=it.next();
				Integer n = m.get(key);
				System.out.println(n);
			}
		}

}
