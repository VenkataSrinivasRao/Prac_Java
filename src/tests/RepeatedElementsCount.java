package tests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedElementsCount {

	public static void main(String[] args) {
		
		
		
		String str="srinivas";
		String s[]=str.split("");
		Map<String, Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++){
		if(map.get(s[i])!=null){
		map.put(s[i],map.get(s[i])+new Integer(1));
		}else{
		map.put(s[i],1);
		}
		}
		//For Displaying Repeated elements count
		for(Map.Entry<String, Integer> entry: map.entrySet()){
		System.out.println(entry.getKey()+"  - "+entry.getValue());
		}

		for(Map.Entry<String, Integer> count : map.entrySet()){
			if(count.getValue().equals(2)){
			
				System.out.println(count.getKey() + "  Times --->  "+count.getValue()  );
			}
			
		}
	}

}
