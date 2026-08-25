package Tasks;

public class F86irstNONrepeatingchar {

	public static void main(String[] args) {
		String str = "aabbccdeef";
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			
			for(int j=0;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch[i]);
				break;
			}
		}
	}

}
