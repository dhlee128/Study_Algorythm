package week7;

//567. Permutation in String
public class Q567 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bbbca";

		System.out.println(checkInclusion(s1,s2));

	}
	public static boolean checkInclusion(String s1, String s2) {
		//¿Þ->¿À
		int len=s1.length();
		int idx=s2.indexOf(s1.charAt(0));

		for(int i=idx;i<s2.length();i=idx) {
			if(idx==-1) {
				break;
			}

			if(i+len>s2.length()) {
				break;
			}

			if(s1.equals(s2.substring(i,i+len))){
				return true;
			}

			idx=s2.indexOf(s1.charAt(0),idx+1);
		}


		StringBuffer sb = new StringBuffer(s2);
		String reversedS2 = sb.reverse().toString();
		idx=reversedS2.indexOf(s1.charAt(0));
		//¿À->¿Þ
		for(int i=idx;i<reversedS2.length();i=idx) {
			if(idx==-1) {
				return false;
			}

			if(i+len>reversedS2.length()) {
				return false;
			}
			if(s1.equals(reversedS2.substring(i,i+len))){
				return true;
			}
			idx=reversedS2.indexOf(s1.charAt(0),idx+1);
		}

        return false;
	}
}
