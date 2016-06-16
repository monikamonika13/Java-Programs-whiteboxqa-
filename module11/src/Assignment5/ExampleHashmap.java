package Assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExampleHashmap {
	public static void main(String[] args) {
		HashMap<Integer,String>h= new HashMap<>();
		h.put(1, "Monika");
		h.put(2, "chiya");
		h.put(3, "akshu");
		h.put(4, "amit");
		for(Map.Entry m :h.entrySet() ){
			System.out.println(m.getKey()+ " "+m.getValue());
			
		}
		Set<Integer>s=h.keySet();
		for(Integer i: s){
				HashMap<Integer,String>h1= new HashMap<>();
				for(Map.Entry m :h.entrySet() ){
					if (i==3 && (int)m.getKey() == 3)
					    System.out.println("element is present"+m.getKey()+ " "+m.getValue());
				}
			
		}
		}
		}
		
		
			
		
		


		




