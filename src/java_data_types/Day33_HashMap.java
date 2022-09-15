package java_data_types;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Day33_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> info = new HashMap<String, String>();
		info.put("name", "Noel");
		info.put("car", "subaru");
		info.put("state", "Virginia");
		info.put("city", "Woodbridge");
		System.out.println(info);
		
		Set<Entry<String , String>> information =  info.entrySet();
		
		Iterator<Entry<String,String>> it = information.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			Entry<String, String> singleMap = it.next();
			System.out.println(singleMap.getKey());
			System.out.println(singleMap.getValue());
		}
		

	}

}
