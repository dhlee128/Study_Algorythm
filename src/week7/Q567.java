package week7;

import java.util.HashMap;
import java.util.Map;

//567. Permutation in String
public class Q567 {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";

		System.out.println(checkInclusion(s1,s2));
	}
	public static boolean checkInclusion(String s1, String s2) {

		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length();i++){//map<-s1(
			char c1=s1.charAt(i);
			map.put(c1,map.getOrDefault(c1,0)+1);
		}

		for(int i=0;i<=s2.length()-s1.length();i++){
			Map<Character,Integer> map2=new HashMap<>();
			int cnt=0;
			while(cnt<s1.length()&&cnt+i<s2.length()){
				char c=s2.charAt(i+cnt);
				map2.put(c,map2.getOrDefault(c,0)+1);
				cnt++;
			}
			if(map.equals(map2)){
				return true;
			}
		}
		return false;
	}
}
