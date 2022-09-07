package aug26;

public class MergeString {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Enter strings using command line argument");
		}
		StringBuffer mergedString = new StringBuffer();
		for(String inputString:args) {
			for(int i=0;i<inputString.length();i++) {
				if(Character.isUpperCase(inputString.charAt(i))){
					mergedString.append(inputString.charAt(i));
				}
			}
		}
		
		System.out.println(mergedString);
	}

}
