package Strings;
public class StringPermutations {
	private static void permutations(String remaining,String candidate) {
		// base case
		if (remaining == null) {
			return;
		}

		if (remaining.length() == 0) {
			System.out.println(candidate);
		}

		for (int i = 0; i < remaining.length(); i++) {
			 char ch= remaining.charAt(i);
			 String lpart = remaining.substring(0, i);  
			 String rpart= remaining.substring(i + 1);
			 String newRemaining= lpart+rpart;
			permutations(newRemaining,candidate+ch);
		}
	}

	// Find Permutations of a string in Java
	public static void main(String[] args) {
		String str = "ABC";
		permutations(str,"");
	}
}


/*String  :  abc            p(abc,"")-> p(ac,b)

p(abc, "")
i=0 	(abc)			
p(bc, a)			


p(bc , a)
i=0     (bc)			i=1
p(c,ab)				p(b,ac)

p(c,ab)				p(b,ac)				
i=0				i=0
p("",abc)			p("",acb)

p("",abc)			p("",acb)
abc				acb*/
